package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Crear un programa de búsqueda y reemplazo:
		// ○ Usa StringBuffer o StringBuilder para implementar un programa que
		// reemplace todas las ocurrencias de una palabra en un texto por otra palabra
		// proporcionada por el usuario.

		System.out.println("Introduce una frase");
		Scanner sc = new Scanner(System.in);
		StringBuilder cadena = new StringBuilder();
		cadena.append(sc.nextLine());
		System.out.println("Introduce las ocurrencias que quieres cambiar");
		String ocurrencias = sc.nextLine();
		String cambio = "hola";
		int inicio = -1;
		int total = 0;
		boolean correcto = cadena.toString().contains(ocurrencias);

		if (correcto) {
			int j = 0;
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i) == ocurrencias.charAt(j) && j < ocurrencias.length()) {
					total++;

					if (inicio == -1)
						inicio = i;

				} else if (total == ocurrencias.length()) {
					cadena = cadena.replace(inicio, (inicio + total), cambio);
					total = 0;
					inicio = -1;
					j = 0;
				} else {
					total = 0;
					inicio = -1;
					j = 0;
				}

			}

		}
		System.out.println(cadena);

	}
}
