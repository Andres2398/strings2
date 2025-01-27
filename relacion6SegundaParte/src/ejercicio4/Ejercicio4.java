package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Buscar un carácter en una cadena:
		// ○ Pide al usuario una cadena y un carácter, y encuentra la primera y última
		// posición del carácter en la cadena usando indexOf() y lastIndexOf().

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cadena = sc.nextLine();

		System.out.println("introduce un caracter para encontrar en la cadena");

		String caracter = sc.nextLine();
		while (caracter.length() != 1) {
			System.out.println("Error, introduzca un solo caracter");
			caracter = sc.nextLine();
			
		}
		System.out.println("La primera posicion del primer caracter es la numero " + cadena.indexOf(caracter));
		System.out.println("La ultima posicon del caracter es la numero " + cadena.lastIndexOf(caracter));
	}	

}
