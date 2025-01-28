package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Validar una dirección de correo electrónico:
		// ○ Escribe un programa que valide si una dirección de correo electrónico
		// ingresada por el usuario tiene un formato válido usando métodos de String
		// (como contains() y endsWith()).

		System.out.println("Introduce una direccion de correo electronico");
		Scanner sc = new Scanner(System.in);
		String correo = sc.nextLine();

		boolean at = correo.contains("@");
		boolean end = correo.endsWith(".es");
		boolean end2 = correo.endsWith(".com");
		if (at && (end || end2))
			System.out.println("correo valido");
		else
			System.out.println("correo no valido");

	}

}
