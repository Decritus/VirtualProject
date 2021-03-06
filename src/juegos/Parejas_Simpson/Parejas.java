package juegos.Parejas_Simpson;

/*
	Programa: Parejas
	Autor: Celia del Mar Valero Aparicio y Ar�nzazu Gila Arrondo
	Web: http://www.todojava.tk
	Version: 1.0

	Descripci�n: Este es el t�pico juego de las parejas en que se trata de buscar 
	todos los pares de fichas iguales en el menor n�mero de intentos posibles.
	Si descubres una pareja, tu saldo aumenta en 1. Si pasados 15 intentos, no aciertas 
	el programa comienza a disminuir el saldo. Si llegas a saldo = 0, significa que has 
	perdido todo tu dinero y se termina la partida. Si descubres todo el panel, significa 
	que has ganado la partida.

	Dificultad: Principiante

 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import basededatos.UsuarioActivado;
import AbrirJuego.AbrirFichaJuego;
import RMI.ICasino;
import RMI.IJuego;
import juegos.Mastermind.Mastermind;

class Parejas extends JFrame implements ActionListener, IJuego
{
	UsuarioActivado usuario;
	static Parejas juego;
	static ICasino casino;
	//matriz de botones
	JButton boton [][] = new JButton[5][8];
	JLabel nombre = new JLabel("Parejas Simpsons",JLabel.CENTER);
	ImageIcon foto [] = new ImageIcon[20]; 
	ImageIcon vacia, loser, winner;
	JLabel Lintentos = new JLabel("N�mero de intentos: 0        ");
	JLabel Puntos = new JLabel("Hola",JLabel.LEFT);
	JLabel Saldo = new JLabel("Saldo:     ",JLabel.LEFT);
	JButton cerrar = new JButton("CERRAR");


	//Donde se coloca cada ficha?� matriz de fichas!!
	int ficha [][] = new int [5][8];
	int comprobar = 0;
	int pos1,i1,j1,j2,i2,quedan,intentos= 0;
	
	//saldo que el internauta da para jugar a este juego
	int saldo = 2;
	
	@Override
	public int darSaldo() {	
		System.out.println("Aqui esta el saldo de las parejas"+saldo);
		return saldo;
	}

	@Override
	public void ponerSaldo(int saldo, UsuarioActivado usuario) {
		this.usuario = usuario;
		juego.setVisible(true);
		this.saldo = saldo;
	}
	
	public Parejas()
	{
			//ficha por defecto
		vacia = new ImageIcon(System.getProperty("user.dir")+"/src/juegos/Parejas_Simpson/quien.jpg");
		loser = new ImageIcon(System.getProperty("user.dir")+"/src/juegos/Parejas_Simpson/loser.jpg");
		winner = new ImageIcon(System.getProperty("user.dir")+"/src/juegos/Parejas_Simpson/winner.jpg");
		
		//cargar las im�genes . . . . las im�genes se encuentran en la misma carpeta que el archivo Parejas.java
		//y se nombran de la forma x.JPG.
		for(int i=0;i<20;i++)
		{
			foto[i] = new ImageIcon(System.getProperty("user.dir")+"/src/juegos/Parejas_Simpson/"
						+Integer.toString(i)+".jpg");
		}
		add(nombre,"North");
		JPanel central = new JPanel(new GridLayout(5,8));
		//A�adir Botones al panel principal de botones
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				boton[i][j] = new JButton();
				//a�ade el actionlistener al boton
				boton[i][j].addActionListener(this);
				boton[i][j].setBackground(Color.WHITE);
				central.add(boton[i][j]);
			}
		}
		add(central,"Center");
		//Panel que muestra la puntuaci�n m�xima
		JPanel Pun = new JPanel();
		Pun.setLayout(null);
		Pun.setPreferredSize(new Dimension(100, 100));
		Pun.setActionMap(null);
		Pun.getAccessibleContext();
		Pun.add(Lintentos);
		Lintentos.setBounds(10, 0, 300, 30);
		Pun.add(Puntos);
		Puntos.setBounds(10, 30, 300, 30);
		Pun.add(Saldo);
		Saldo.setBounds(10, 60, 300, 30);
		
		cerrar.setBounds(600, 30, 90, 25);


		Pun.add(cerrar);
		cerrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(final MouseEvent arg0) {
				juego.setVisible(false);
				try {
					casino.acabado(saldo,usuario);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//System.exit(0);
			}
		});
		add(Pun,"South");
		
		
//		JPanel cerrar = new JPanel();
//		cerrar.setLayout(new GridLayout(1,2));
//		add(cerrar,"South");
		
		
		

		//M�todo que coloca las im�genes aleatoriamente en la matriz
		ImagenesAleatorias ();
		
//		VerPuntuacion();

		//M�todo para cerrar la ventana
//		addWindowListener(new WindowAdapter()
//		{
//			public void windowClosing(WindowEvent we)
//			{
//				System.out.println("X pulsada");
//				System.exit(0);
//			}
//		});

		// Propiedades de la ventana
		setTitle("Parejas Simpsons");	
		setResizable(false);
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
	}

	/**
	 * Este m�todo coloca las fotos aleatoriamente en la pantalla
	 */
	private void ImagenesAleatorias ()
	{
		int x,y=0;int numero=-1;
		double x1,y1=0;

		//Pone la matriz de las fichas a -1. El n�mero -1 indica que no tiene ficha
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				ficha[i][j]=-1;
			}

		}

		//Crear Numeros aleatorios. 
		for (int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				//Genera una posici�n aleatoria dentro de la matriz dada
				do
				{
					x1=Math.random()*5;
					y1=Math.random()*8;
					x=(int)x1;
					y=(int)y1;
				}
				while(ficha[x][y]!=-1);
				numero++;
				if (numero==20)numero=0;
				ficha[x][y]=numero;
				boton[i][j].setIcon(vacia);
			}
		}	
		/* Solucion: Poner esto para visualizar la matriz en la consola de java  
		      for (int i=0;i<5;i++)
		        {
		          for(int j=0;j<8;j++)
		          {
		 			System.out.print(ficha[i][j] + "     ");
		 		  }
		 		  System.out.println(" ");
		 	   }
		 */ 
	}

	public void actionPerformed(ActionEvent ae)
	{
		//si el jugador tiene un saldo superior a 0, puede juegar
		if (saldo > 0)
		{			
			for (int i=0;i<5;i++)
			{
				for(int j=0;j<8;j++)
				{	
					if(ae.getSource() == boton[i][j])
					{
						if(boton[i][j].getIcon().equals(vacia))
						{
							comprobar++;
							//Cuando la pulsaci�n no es la n� 3 muestra la carta de esa posicion
							if(comprobar!=3)
									boton[i][j].setIcon(foto[ficha[i][j]]);
							if(comprobar == 1) //Guarda las propiedades de la 1� carta 
							{
								pos1 = ficha[i][j]; //guarda la ficha que se encuentra en esa posici�n
								i1 = i; 	//coordenada i de la ficha
								j1 = j;		//cordenada j de la ficha
								intentos++; //contador del n�mero de intentos para establecer record
							}
							if(comprobar == 2) //Guarda las propiedades de la 2� carta
							{ 
								if(pos1 == ficha[i][j])  //Las cartas coinciden
								{
									quedan++; //Contador de fichas que han salido
									comprobar = 0; //Poner a 0 la pulsaci�n
//									intentos++; //contador de el numero de intentos
									aumentarSaldo();
								}
								else //Has fallado. Las fichas son diferentes 
								{
									i2=i;
									j2=j;
									//se da un margen de 15 fallos para empezar a disminuir saldo
									if (intentos >= 15)
										disminuirSaldo();
								}
							}	 

							if(comprobar==3) //El 3� Click, al ser distintas vuelve a ocultar las fichas
							{
								boton[i1][j1].setIcon(vacia);
								boton[i2][j2].setIcon(vacia);	
								comprobar=0;	      		    	 	
							}
						}
					}
				}
			}
			//El n�mero de intentos que llevas.....
			Lintentos.setText("N�mero de intentos: "+intentos + "		");
			Puntos.setText("Parejas acertadas:  "+quedan);
			Saldo.setText("Saldo actual:  "+saldo);
			//Ganar consiste en descrubir el panel. Verifica puntuaci�n y vuelve a empezar
			if(quedan == 20)
			{
				JOptionPane.showMessageDialog(this,"Saldo final:      "+saldo,"Ganador",JOptionPane.INFORMATION_MESSAGE,winner);	 
				
//				JOptionPane.showMessageDialog(this,"El n� de intentos es:     " + intentos
//						+"\nSaldo:                           "+saldo,"Parejas Simpsons",JOptionPane.INFORMATION_MESSAGE,winner);	 
//				Puntuacion();
//				VerPuntuacion();
				
				
				try {
					casino.acabado(saldo, usuario);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
 
				
				quedan=0;
				intentos=0;
				ImagenesAleatorias();
				Lintentos.setText("N�mero de intentos: "+intentos );
			}
		}else{
			//si se queda sin saldo, se debe cerrar y cancelar la partida
			JOptionPane.showMessageDialog(this,"Saldo agotado","Perdedor", JOptionPane.ERROR_MESSAGE,loser);
			
		    try {
				casino.acabado(saldo, usuario);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//System.exit(0);
		}
	} 
	
	/**
	 * Aumenta el saldo del jugador
	 */
	private void aumentarSaldo(){
		saldo = saldo + 1;
	}
	
	/**
	 * Disminuye el saldo del jugador
	 */
	private void disminuirSaldo(){
		saldo = saldo - 1;
	}
	
	/**
	 * M�todo que lee desde el archivo "record.txt" el record de puntuaci�n del juego.  
	 * La m�xima puntuaci�n consiste en el m�nimo n�mero de intentos en los que se ha 
	 * resuelto el panel.
	 */
	private void VerPuntuacion() //Muestra la puntuaci�n Record
	{
		String record="";
		String nom="";
		//Leer Record
		try
		{
			FileReader puntuacionmax = new FileReader("record.txt");
			BufferedReader leer = new BufferedReader(puntuacionmax);
			record = leer.readLine();
			nom = leer.readLine();
			puntuacionmax.close();
		}
		catch(IOException ioe)
		{
		}
		Puntos.setText(nom + ": " + record);
	}
		
	/**
	 * Este m�todo guarda la nueva puntuaci�n en el archivo "record.txt" en caso de 
	 * de que se obtenga un nuevo record.
	 */
	public void Puntuacion() //Guarda la nueva puntuaci�n en caso de ser Record
	{
		String record = "";
		String nom = "Anonimo";
		//Leer Record
		try
		{
			FileReader puntuacionmax = new FileReader("record.txt");
			BufferedReader leer = new BufferedReader(puntuacionmax);
			record = leer.readLine();
			nom = leer.readLine();
			puntuacionmax.close();
		}
		catch(IOException ioe)
		{	
		}
		//Tienes Menor n�mero de intentos que el anterior?
		try
		{
			Integer.parseInt(record);
		}
		catch(NumberFormatException NFE)
		{
			record="100"; //en el caso de haber un error en el archivo inicia otra vez el record a 100 
		}
		if(intentos < Integer.parseInt(record)) //se ha producidu un record......
		{
			try
			{	
				FileWriter  puntuacionmax=new FileWriter("record.txt");
				nom = JOptionPane.showInputDialog("Nuevo Record, Introduce tu Nombre:");
				puntuacionmax.write(Integer.toString(intentos)+"\n");
				puntuacionmax.write(nom +"\n");
				puntuacionmax.close();
			}
			catch (IOException ioe)
			{

			}

		}
	}  	

	public static void main (String [] args)
	{
		juego = new Parejas();
		 
		
		//SERVIDOR
		
			try {
			Registry registry = LocateRegistry.getRegistry(2500);     
		    IJuego stub = (IJuego) UnicastRemoteObject.exportObject(juego, 0);
		    registry.rebind("Parejas", stub);
		    casino = (ICasino) registry.lookup("Casino");
		    
		    System.err.println("Parejas listo");
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.toString());
		    e.printStackTrace();
		}
			
		juego.setVisible(false);
			// SERVIDOR
	}

	
}