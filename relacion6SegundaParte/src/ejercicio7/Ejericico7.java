package ejercicio7;

import java.util.Scanner;

public class Ejericico7 {

	public static void main(String[] args) {
		// Palíndromos con StringBuffer o StringBuilder:
		// ○ Crea un programa que determine si una palabra o frase es un palíndromo (se
		// lee igual al revés) ignorando espacios y mayúsculas/minúsculas.

		System.out.println("Introduce una cadena");

		Scanner sc = new Scanner(System.in);
		StringBuilder cadena = new StringBuilder();
		cadena.append(sc.nextLine());
		
		cadena.replaceAll(" ", "");
		
		

	}
}
