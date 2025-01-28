package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Eliminar caracteres repetidos:
		// ○ Escribe un programa que elimine caracteres duplicados consecutivos de una
		// cadena usando StringBuilder.
		// Ejemplo: Entrada: "aaabbccdd" → Salida: "abcd"

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena y eliminaremos los caracteres duplicados");
		StringBuffer cadena = new StringBuffer();
		cadena.append(sc.nextLine());

		for (int i = 0; i < cadena.length(); i++) {
			for (int j = i + 1; j < cadena.length(); j++) {
				if (cadena.charAt(i) == cadena.charAt(j)) {
					cadena = cadena.deleteCharAt(j);
					j = i;
				}

			}
		}
		System.out.println(cadena);

	}

}
