package juegos.Mastermind;

//PROGRAM LISTING
//_________________________________________________________________________

import java.awt.*;
import java.awt.event.*;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JFrame;

import basededatos.UsuarioActivado;
import RMI.ICasino;
import RMI.IJuego;
import juegos.Craps.CrapsFrame;

/**
* The Board class paints and plays a Mastermind board on screen.
*
* @since JDK1.0
* @author MarkF (008095880@00.humber.ac.uk).
* @see Launcher
* @see Peg
* @see MessageBox
*/
public class Mastermind extends JFrame implements MouseListener, IJuego {
	UsuarioActivado usuario;
	static Mastermind juego;
	static ICasino casino;
	// Variables
	private static final int
		HOLES = 4, OFX[] = {230,250,230,250}, OFY[] = {546,546,566,566},
		SECRET = 0, SCORE = 10, BUTTONS1 = 21, BUTTONS2 = 22;
	
	/** Peg row: 0 is 'SECRET CODE', 1-10 is Turns, 11-20 is Score Pins,
	   21 is coloured button pegs 1-4, 22 is button pegs 5-8. */
	private Peg peg[][] = new Peg[23][HOLES]; // array of Peg objects
	private int code[] = new int[HOLES]; // the code you're guessing
	private int pegX = 0; // your current Peg
	private int turn = 1; // your current turn
	private int x, y, pegUpdate;
	private int apuesta = 0;
	private int ganancia = 0;
	private boolean isUpdate = true, isPlaying = true, isRowFull = false;
	
	
	public static void main(String argv[]){
		juego = new Mastermind();
		 
		
		//SERVIDOR
		
			try {
			Registry registry = LocateRegistry.getRegistry(2500);     
		    IJuego stub = (IJuego) UnicastRemoteObject.exportObject(juego, 0);
		    registry.rebind("Mastermind", stub);
		    casino = (ICasino) registry.lookup("Casino");
		    
		    System.err.println("Mastermind listo");
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.toString());
		    e.printStackTrace();
		}
			
		juego.setVisible(false);
			// SERVIDOR
	};
	
	@Override
	public int darSaldo() {
		// TODO Auto-generated method stub
		return ganancia;
	}

	@Override
	public void ponerSaldo(int saldo, UsuarioActivado usuario) {
		this.usuario = usuario;
		// TODO Auto-generated method stub
		juego.setVisible(true);
		apuesta = saldo;
	}
	// Constructors
	public Mastermind() { 
		
		this.setTitle( "Mastermind" ); // set the frame title
		this.setSize( 323, 590 ); // set the frame size
		this.setResizable( false ); // user can't resize the frame
		//this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	
	 // initialize Pegs
		for ( y = 0; y <= SCORE; y++ ) 
			for ( x = 0; x < HOLES; x++ ) { 
				peg[y][x] = new Peg( 20,0 ); // 'SECRET CODE' and Board Pegs
			    peg[y][x].setPosition( x * 50 + 33,556 - y * 50 );
			    peg[y+SCORE][x] = new Peg( 8,0 ); // Score Pins
			    peg[y+SCORE][x].setPosition(OFX[x],OFY[x] - y * 50);
	     } // end for
		 for ( x = 0; x < HOLES; x++ ) { // Coloured button Pegs in top-right
			 peg[BUTTONS1][x] = new Peg( 20,x + 1 );
			 peg[BUTTONS1][x].setPosition( 298,x * 50 + 56); 
			 peg[BUTTONS2][x] = new Peg( 20,x + 5 ); 
			 peg[BUTTONS2][x].setPosition( 298,x * 50 + 256 );
		 } // end for
	
		 // start Game
		randomCode(); // fill code with a random code
		addMouseListener(this); // add mouse listener
		setVisible( true ); // ask it to become visible on screen
	} // Mastermind()
	
	// Methods
	/** Custom painting code, called automatically by the Java system. */
	public void paint( Graphics g ) {
		g.setColor( new Color( 51,51,102 ) ); // draws the board itself
		g.fillRoundRect( 4,27,264,559,15,15 );
		 g.setColor( new Color( 255,204,0 ) ); // draws the 'SECRET CODE' area
		 g.fill3DRect( 10,533,197,53,true );
		 g.setFont( new Font( "SansSerif",Font.BOLD,26 ) );
		 g.setColor( Color.yellow );
		 g.drawString( "SECRET CODE",15,569 );
		 g.setColor( new Color ( 127,151,175 ) ); // draws the Peg selection area
		 g.fill3DRect( 269,27,50,459,true );
		 g.setColor( Color.green ); // draws the 'Go' button
		 g.fillOval( 278,436,40,40);
		 g.setColor( Color.black );
		 g.drawOval( 278,436,40,40);
		 g.setColor( Color.green.darker() );
		 g.drawString( "Go",280,466 );
		
		 // draws the Pegs
		 for ( y = 0; y < peg.length; y++ ) {
			 peg[y][0].paint(g); peg[y][1].paint(g);
			 peg[y][2].paint(g); peg[y][3].paint(g);
		 } // end for
	} // paint()
	
	/** Overrides the update() method, see repaintPegs(). */
	public void update( Graphics g ) {
		if ( isUpdate ) {
			paint( g ); // update everything
		} else { // else, update only the Pegs flagged by repaintPegs()
			isUpdate = true;
		   peg[pegUpdate][0].paint( g ); peg[pegUpdate][1].paint( g );
		   peg[pegUpdate][2].paint( g ); peg[pegUpdate][3].paint( g );
	   }
	} // update()
	
	/** Repaints Pegs, Java system calls update(). */
	void repaintPegs( int pegUpdate ) {
		this.pegUpdate = pegUpdate;
		 isUpdate = false;
		 repaint(); // schedule for update()
	} // repaintPegs()
	
	/** Called just after a mouse button press (Mouse Listener). */
	public void mousePressed(MouseEvent e) {
		Point mouse = new Point(); // holds mouse's current location
	
		 mouse = e.getPoint(); // get its coordinates
		 if ((mouse.y >= 533) && (mouse.x <= 207)) // is the 'SECRET CODE' area?
			 return;
		 else
			 if (isPlaying)
				 if (mouse.x > 270) { // is the peg selection area?
					 int button = 1 + (int)((mouse.y - 32) / 50); //translate mouse.y
					 if ((button >= 1) && (button <= 8)) // is a colored Peg?
						 fillHole( button );
					 else
						 if (button == 9) // else, is the 'Go' button?
							 if (isRowFull)
								 Go();
							 else {
								 MessageBox message = new MessageBox( this,"Mastermind Help",
								 " Antes de comprobar debes de rellenar la fila con bolas coloreadas." );
							 } 
				 } else { // is playing and are unknown mouse co-ordinates?
					 MessageBox message = new MessageBox( this,"Mastermind Help",
					 " Rellena las filas con bolas de colores y presiona 'GO'." );
				 }
			 else { // is not the 'SECRET CODE' area and is not playing?
				 MessageBox message = new MessageBox( this,"Mastermind",
				 " Lo siento, la partida ha concluido!" );
			 }
	} // mousePressed()
	/** These four interface methods are not used but must be defined. */
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e)  {}
	
	/** Picks the current Peg, called from mousePressed(). */
	void fillHole( int newC ) {
		 peg[turn][pegX].setColor( newC );
		 repaintPegs( turn );
		 pegX = (pegX + 1) % HOLES; // next Peg or first Peg
		 if (pegX == 0)
			 isRowFull = true;
	} // fillHole()
	
	/** 'Go' button pressed, called from mousePressed().
	    Scoring based on www.students.cs.uu.nl/~smotterl/mmind */
	void Go() {
		 int junkPegs[] = new int[HOLES], junkCode[] = new int[HOLES];
		 int pegCount = 0, pico = 0;
		
		 for ( x = 0; x < HOLES; x++ ) { // copy, as we will overwrite
		   junkPegs[x] = peg[turn][x].getColor();
		   junkCode[x] = code[x];
		 }
	 // Red pins, right colour, right place
		for ( x = 0; x < HOLES; x++ )
			if (junkPegs[x]==junkCode[x]) {
			     peg[turn+SCORE][pegCount].setColor( 1 );
			     pegCount++;
			     pico++;
			     junkPegs[x] = 98; // trash it, so it won't...
			     junkCode[x] = 99; // match again
			}
	 // Yellow pins, right colour, wrong place
		for ( x = 0; x < HOLES; x++ )
			for ( y = 0; y < HOLES; y++ )
				if (junkPegs[x]==junkCode[y]) {
					peg[turn+SCORE][pegCount].setColor( 2 );
					pegCount++;
					junkPegs[x] = 98; // trash it, so it won't...
					junkCode[y] = 99; // match again
					y = HOLES; // abort inner loop
				}
		repaintPegs( turn+SCORE ); // updates the score
	
		if ( pico == HOLES ) { // has won?
			if (turn <= 2) ganancia = apuesta * 3;
			else if (turn == 3) ganancia = apuesta * 2;
			else if (turn == 4) ganancia = apuesta;
			else ganancia = 0;
			MessageBox message = new MessageBox( this,"Mastermind",
			" Felicidades! Has descubierto la combinacion secreta!. Has ganado " + ganancia + "�." );
			isPlaying = false; // halt gameplay
			revealCode();
			try {
				casino.acabado(ganancia, usuario);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			if ( turn >= 10 ) { // else, has lost?
				MessageBox message = new MessageBox( this,"Mastermind",
				" Fin de la partida. Has perdido" );
				isPlaying = false; // halt gameplay
				revealCode();
				try {
					casino.acabado(ganancia, usuario);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else { // else, start the next row of Pegs
				pegX = 0;
				isRowFull = false;
				turn++;
			}
	} // Go()
	
	/** Shows the 'SECRET CODE', called from mousePressed(). */
	void revealCode() {
		for ( x = 0; x < HOLES; x++ )
			peg[SECRET][x].setColor( code[x] );
		repaintPegs( SECRET );
	} // revealCode()
	
	/** Generates a random 'SECRET CODE', called from init(). */
	void randomCode() {
		for ( x = 0; x < HOLES; x++ )
			code[x] = 1 + (int)(Math.random() * 8);
	} // randomCode()
	
} // End class Board

/**
* The Peg class is a blueprint for a Peg object.
*
* @since JDK1.0
* @author MarkF (008095880@00.humber.ac.uk).
*         Based on Circle class in Chapter 38 of...
*         Bradley Kjell's "Introduction to Computer Science using Java".
* @see Board
*/
class Peg {
// Variables
	private int color, x, y, radius;
	private static final Color PALETTE[] = {
		Color.black,Color.red,Color.yellow,Color.green,Color.orange,
		Color.pink,Color.magenta,Color.blue,Color.white,Color.lightGray };
	
	// Constructors
	public Peg()
		{ x = 0; y = 0; radius = 0; color = 0; }
	
	public Peg( int radius,int color )
		{ x = 0; y = 0; this.radius = radius; this.color = color; }
	
	// Methods
	public void paint( Graphics g ) {
		int ulX = x-radius ; // X of upper left corner of rectangle
		int ulY = y-radius ; // Y of upper left corner of rectangle
		int d14 = radius >>1; // one-quarter diameter
		int d34 = radius+d14; // three-quarter diameter
		if (color > 0) {
			g.setColor( PALETTE[color].darker() );
			g.fillOval( ulX,ulY,2*radius,2*radius );
			g.setColor( PALETTE[color] );
			g.fillOval( ulX+d14-1,ulY+d14-1,d34,d34 );
			g.setColor( Color.white );
			g.fillOval( x,y,d14,d14);
		} else {
			g.setColor( Color.lightGray );
			g.drawOval( ulX,ulY,2*radius-1,2*radius-1 );
		}
		g.setColor( Color.black );
		g.drawOval( ulX,ulY,2*radius,2*radius );
	} // paint()
	
	/** Changes the center of the peg to a new X and Y. */
	public void setPosition( int newX,int newY ) {
		x = newX ;
		y = newY ;
	} // setPosition()
	
	/** Changes the radius of the peg. */
	public void setRadius( int newR ) {
		radius = newR;
	} // setRadius()
	
	/** Changes the color of the peg. */
	public void setColor( int newC ) {
		color = newC;
	} // setColor()
	
	/** Returns the color of the peg. */
	public int getColor() {
		return color;
	} // getColor()

} // End class Peg

/**
* The MessageBox class implements a message dialog box.
*
* @since JDK1.0
* @author MarkF (008095880@00.humber.ac.uk).
*         Based on Java How to Program, p. 616.
* @see Board
*/
class MessageBox extends Dialog implements ActionListener {
// Variables
	private Button okButton;
	
	// Constructors
	public MessageBox( Frame f,String title,String message ) {
		super( f,title,true ); // construct a Dialog box
		setBackground( new Color ( 127,151,175 ) );
		setResizable( false ); // user can't resize the frame
		add( new Label( message ), BorderLayout.NORTH );
		okButton = new Button( "    OK    " ); // button
		okButton.addActionListener( this ); // assign the listener
		add( okButton, BorderLayout.EAST ); // add the component
		pack(); // pack layout
		setVisible( true ); // ask it to become visible
	} // MessageBox()

	// Methods
	/** Called when the Dialog's button is pressed. */
	public void actionPerformed( ActionEvent e )
		{ dispose(); 
		
		}

};  

