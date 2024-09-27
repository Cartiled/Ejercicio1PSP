package ejercicio1;

import java.util.Scanner;

public class EjemploLectura {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce lo que quieras por aqui abajo");
		String res = teclado.nextLine();
		System.out.println("La cadena de escrictura es:" + res);
		teclado.close();
	}
}
