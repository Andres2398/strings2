package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Eliminar espacios:
		// ○ Escribe un programa que elimine los espacios en blanco de una cadena
		// usando métodos de String.

		System.out.println("Introduce una cadena");

		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		System.out.println(cadena.replaceAll(" ", ""));
	}

}
