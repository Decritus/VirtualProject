package Herencia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import AbrirJuego.AbrirFichaJuego;
import Administrador.ActualizarJuego;
import UsuarioNoRegistrado.CatalogoDeJuegos;

public class ListadoDeJuegos extends JFrame {

	protected JPanel contentPane;
	protected JTable juegosT;
	protected JButton actualizarJuegoB;
	protected JButton cerrarB;
	/**
	 * Permite que la tabla sea scrollable
	 */
	JScrollPane scrollTabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CatalogoDeJuegos frame = new CatalogoDeJuegos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ListadoDeJuegos() {
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		this.setLayout(new BorderLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		this.add(contentPane, BorderLayout.CENTER);
		
		JPanel btn = new JPanel();
		btn.setBounds(5,375,440,45);
		actualizarJuegoB = new JButton ("Actualizar Juego");
		cerrarB = new JButton("cerrar");
		btn.setLayout(new BorderLayout(0, 0));
		btn.add(actualizarJuegoB, BorderLayout.EAST);
		btn.add(cerrarB, BorderLayout.WEST);
		btn.setVisible(true);
		this.add(btn, BorderLayout.SOUTH);
		// juegosT = new JTable();
		llenarTabla();
		dibujarTabla();

	}

	/**
	 * Rellena la tabla
	 */
	private void llenarTabla() {
		String[] cabecera = { "Juego", "Id", "Fecha", "Desea Jugar" };

		Object[][] datos = new Object[13][4];

		for (int i = 0; i < datos.length; i++) {
			datos[i][0] = (String) "Cartas";
			datos[i][1] = i;
			datos[i][2] = (String) "Hoy es 29.04.2014";
			datos[i][3] = false;
		}
		juegosT = new JTable(datos, cabecera);

		juegosT.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2 && !e.isConsumed()) {
					String nombre = juegosT.getValueAt(
							juegosT.getSelectedRow(), 1).toString();
					//a cambiar para poner en enlace al siguiente punto de modificar
					//AbrirFichaJuego afj = new AbrirFichaJuego(nombre);
				//	ActualizarJuego ac= new ActualizarJuego(123);
					e.consume();
				}
			}
		});

	}

	/**
	 * Dibuja la tabla
	 */
	private void dibujarTabla() {
		contentPane.setLayout(new BorderLayout(0, 0));

		juegosT.setRowSelectionAllowed(false);
		juegosT.setBackground(new Color(127, 255, 212));

		juegosT.setRowSelectionAllowed(true);
		juegosT.setColumnSelectionAllowed(false);
		// juegosT.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollTabla = new JScrollPane(juegosT);
	//	scrollTabla.setBounds(5, 5, 440, 395);
	//	contentPane.add(scrollTabla, BorderLayout.CENTER);
		contentPane.add(scrollTabla);
	}

}
