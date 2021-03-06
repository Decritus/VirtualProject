package juegos.GBoard;

import javax.swing.*;

import basededatos.UsuarioActivado;
import RMI.ICasino;
import RMI.IJuego;

import java.awt.*;
import java.awt.event.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


//GRAPHIC CLASS OF THE TABLERO
public class Game extends JFrame implements IJuego, ActionListener 
{
	//MDS2
	UsuarioActivado usuario;
	static Game juego;
	static ICasino casino;
	//VARIABLE GLOBAL
	protected int saldo_en_juego;
		
	//Atributes
	
	//The boards
	private GBoardPlayer brdPlayer; //The board of the player CRUISER
	private GBoardComputer brdCom;	//The board of the computer player
	
	//The intelligence
	private Intelligence comIntelligence;	//The intelligence of the computer
	
	//The panels
	private JPanel pnlMain;		//Main panel where all appear on the frame
	private JPanel pnlBoards;	//The panel where the boards of the game appear
	private JPanel pnlShips;	//The panel where appear the ships to put on the board
	
	//The buttons and the radio buttons for choose what ships do you want to put in your board
	private JButton [] btnShips;
	private JRadioButton rdbHorizontal;
	private JRadioButton rdbVertical;
	private ButtonGroup bgPosition;
	
	//The menus
	private JMenuBar mnbMenu;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JMenuItem mnitStart;
	private JMenuItem mnitExit;
	private JMenuItem mnitPref;
	
	//Implementation variables, need for the control of the program
	private int iSize;		//Variable to know the size of the boards
	public int iLevel;		//Varialbe to know the level of dificulty of the game
	
	//Constants for make easier the coding
	static final int BATTLESHIP=0;
	static final int CRUISER=1;
	static final int DESTROYER=2;
	static final int SUBMARINE=3;
	static final int NUMSHIPS=4;
	
	
	//BEHAVIORS	
		//IMPLEMENTACION PONER Y DEVOLVER SALDO
		public void ponerSaldo(int saldo){
			try {
				ponerSaldo(saldo,usuario);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public int darSaldo(){
			int saldo= saldo_en_juego;
			return saldo;
		}
	
	//BEHAVIORS	
	//DEFAULT CONSTRUCTOR
	public Game() 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
			SwingUtilities.updateComponentTreeUI(this);
		}
		catch(Exception e){}
		iSize=10; //Default value
		iLevel=0;
		createMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("BattleShip Game");
		setResizable(false);
		setSize(1000,500);
		setVisible(true);	
	} 
	
	public static void main (String[] Args)
	{
		juego = new Game();
		juego.setVisible(false);
		try {
			Registry registry = LocateRegistry.getRegistry(2500);     
		    IJuego stub = (IJuego) UnicastRemoteObject.exportObject(juego, 0);
		    registry.rebind("GBoard", stub);
		    casino = (ICasino) registry.lookup("Casino");
		    
		    System.err.println("GBoard listo");
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.toString());
		    e.printStackTrace();
		}
		
	}
	
	private void createMenu()
	{
		mnbMenu=new JMenuBar();
	
		mnFile=new JMenu("File");
		mnEdit=new JMenu("Edit");
	
		mnitStart=new JMenuItem("Start");
		mnitExit=new JMenuItem("Exit");
	 	mnitPref=new JMenuItem("Preferences");
		
		mnitStart.addActionListener(this);
		mnitExit.addActionListener(this);
	 	mnitPref.addActionListener(this);
		
		mnFile.add(mnitStart);mnFile.addSeparator();mnFile.add(mnitExit);
		mnEdit.add(mnitPref);
		mnbMenu.add(mnFile);mnbMenu.add(mnEdit);
		setJMenuBar(mnbMenu);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		int s;
		if(mnitStart==evt.getSource())
		{
			start();
			seeShips();
		}
		else
			if(mnitExit==evt.getSource()){
				//se acaba el juego, devolver saldo
				s = darSaldo();
				JOptionPane.showMessageDialog(null,"JUEGO FINALIZADO--SALDO:"+s);
				try {
					casino.acabado(saldo_en_juego, usuario);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				juego.setVisible(false);
				//System.exit(0);
			}
			else
				if(mnitPref==evt.getSource())
					preferences();			
				else
					if(rdbHorizontal==evt.getSource())
						brdPlayer.setPosition(GBoard.HORIZONTAL);
					else
						if(rdbVertical==evt.getSource())
							brdPlayer.setPosition(GBoard.VERTICAL);
						else
							for(int i=0;i<NUMSHIPS;++i)
								if(btnShips[i]==evt.getSource())
									selectShip(i);		
	}
	
	private void start()
	{
		//Create the two GBoard and the Boards panel
		brdPlayer=new GBoardPlayer(this,iSize);
		brdCom=new GBoardComputer(this,iSize); 
		comIntelligence=new Intelligence(brdPlayer,iLevel); //Create the intelligence
		mnitPref.setEnabled(false);
		brdCom.putShipAutomatically();
		pnlBoards=new JPanel();
		//Create and assign the layout for the main panel
		GridLayout gl = new GridLayout(1,2,10,10);
		pnlBoards.setLayout(gl);
		//Add the GBoard to the panel
		pnlBoards.add(brdPlayer);
		pnlBoards.add(brdCom);
		setContentPane(pnlBoards);
		//Set invisible the computer GBoard until the player set his ships
		brdCom.setVisible(false);
	}
	
	//Procedure to show the ships under the boards
	private void seeShips()
	{
		//Create the main panel and the panel from the south
		pnlMain=new JPanel();
		pnlShips=new JPanel();
		
		initButtons(); //Create the buttons with the names of the ships
		initPosition();
				
		//Create and assign the layout for the main panel and the south
		BorderLayout bl = new BorderLayout(10,10);
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER,10,10);
		
		pnlMain.setLayout(bl);
		pnlShips.setLayout(fl);
		for(int i=0;i<NUMSHIPS;++i)
			pnlShips.add(btnShips[i]);

		pnlShips.add(rdbHorizontal);	
		pnlShips.add(rdbVertical);
		
		//Add the panels to the Main Panel
		pnlMain.add("Center",pnlBoards);
		pnlMain.add("South",pnlShips);
		setContentPane(pnlMain);
		setVisible(true);
	}

	private void selectShip(int pos) //pos tell us with buttons was press to know what kind of ship are we going to put
	{
		for(int i=0;i<NUMSHIPS;++i)
			if(i==pos)
			{
				brdPlayer.setShip(btnShips[i]);
				btnShips[i].setEnabled(false);
			}
			else
				btnShips[i].setEnabled(true);	
	}
	
	public void selectNextShip()
	{
		int i=0,pos=0;
		while(i<NUMSHIPS)
		{
			if(btnShips[i].isVisible()==true)
			{
				pos=i;
				i=NUMSHIPS;
			}
			++i;
		}
		if(i==NUMSHIPS)
		{
			pnlShips.setVisible(false);
			brdCom.setVisible(true);
			brdPlayer.setTurn("Is your turn...");
		}
		else
		{
			brdPlayer.setShip(btnShips[pos]);
			btnShips[pos].setEnabled(false);
		}
	}
	
	private void preferences()
	{	
		mnitStart.setEnabled(false);
		mnitPref.setEnabled(false);
		Edit editFrame=new Edit(this);
	}
	
	public void finishEdit()
	{
		mnitStart.setEnabled(true);
		mnitPref.setEnabled(true);
	}
		
	private void initButtons()
	{
		btnShips=new JButton[NUMSHIPS];
		btnShips[BATTLESHIP]=new JButton("Battleship");
		btnShips[CRUISER]=new JButton("Cruiser");
		btnShips[DESTROYER]=new JButton("Destroyer");
		btnShips[SUBMARINE]=new JButton("Submarine");
		for(int i=0;i<NUMSHIPS;++i)
			btnShips[i].addActionListener(this);
		btnShips[BATTLESHIP].setEnabled(false);
		brdPlayer.setShip(btnShips[BATTLESHIP]);
	}
	
	private void initPosition()
	{
		rdbHorizontal=new JRadioButton("Horizontal");
		rdbVertical=new JRadioButton("Vertical");
		bgPosition=new ButtonGroup();
		rdbHorizontal.addActionListener(this);
		rdbVertical.addActionListener(this);
		bgPosition.add(rdbHorizontal);
		bgPosition.add(rdbVertical);
		rdbHorizontal.setSelected(true);
		brdPlayer.setPosition(GBoard.HORIZONTAL);
	}
	
	public void setLevel(int inputLevel){iLevel=inputLevel;}
	public void setSize(int inputSize){iSize=inputSize;}
	
	public void playerTurn()
	{
		brdCom.setCanHit(true);
		brdCom.setTurn("Wait...");
		brdPlayer.setTurn("Is your turn...");
	}
	
	public void computerTurn()
	{	
		brdPlayer.setCanHit(true);
		brdPlayer.setTurn("Wait...");
		brdCom.setTurn("Is your turn...");
		comIntelligence.attack();		
	}
	
	public void initialize()
	{
		brdPlayer.setVisible(false);
		brdCom.setVisible(false);
		brdPlayer=null; //Destroy the GBoards
		brdCom=null;
		comIntelligence=null; //and destroy the intelligence
		mnitPref.setEnabled(true);
	}
	@Override
	public void ponerSaldo(int saldo, UsuarioActivado usuario)
			throws RemoteException {
		this.usuario = usuario;
		juego.setVisible(true);
		saldo_en_juego = saldo;
		
	}
}
