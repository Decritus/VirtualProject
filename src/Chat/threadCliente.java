package Chat;

import java.net.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class threadCliente extends Thread {
	DataInputStream entrada2;

	public threadCliente(DataInputStream entrada) throws IOException {
		entrada2 = entrada;
	}

	public void run() {
		publico p = new publico();

		String menser;
		while (true) {
			try {
				menser = entrada2.readUTF();
				System.out.println("ECO del servidor:" + menser);
				p.pan.setText(p.pan.getText() + menser + "\n");
				System.out.println("el contenido" + p.pan.getText());
			} catch (IOException e) {
				System.out.println("Error en la comunicación "
						+ "Información para el usuario");
				break;
			}

		}

		System.out.println("se desconecto el servidor");
	}
}