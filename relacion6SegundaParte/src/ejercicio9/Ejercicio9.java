package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Cifrado César básico:
		//○ Implementa un programa que tome una cadena y un número, y desplace
		//cada carácter en el alfabeto por la cantidad dada (cifrado César). Usa
		//StringBuilder para modificar el texto.
		
		System.out.println("Introduce una cadena");
		Scanner sc = new Scanner (System.in);
		StringBuilder cadena = new StringBuilder();
		cadena.append(sc.nextLine());
		System.out.println("Introduce un digito para desplazar los caracteres de la cadena");
		int numero = sc.nextInt();
		char caracter;
		for (int i = 0; i < cadena.length(); i++) {
			caracter=cadena.charAt(i);
			caracter+=numero;
			cadena.setCharAt(i, caracter);
		}
		System.out.println(cadena);
	}

}
