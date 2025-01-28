package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	static String transformarTitulo(String palabra) {

		return null;
	}

	public static void main(String[] args) {
		// Formato de texto:
		// ○ Diseña un programa que convierta un párrafo ingresado por el usuario a
		// formato "Título". Esto significa que la primera letra de cada palabra debe
		// estar en mayúscula, y el resto en minúscula.
		// Ejemplo: Entrada: "hola mundo desde java" → Salida: "Hola Mundo
		// Desde Java"

		System.out.println("Introduzaca una frase para pasarla a formato Titulo");

		Scanner sc = new Scanner(System.in);
		String cadena=sc.nextLine();
		cadena=cadena.toLowerCase();
		StringBuffer cadena2=new StringBuffer(cadena);
		String cambio = "";

		for (int i = 0; i < cadena2.length(); i++) {
			if (cadena2.charAt(i) == ' ') {
				cambio += cadena2.charAt(i + 1);
				cambio=cambio.toUpperCase();
				cadena2.replace((i + 1), (i + 2), cambio);
				cambio="";
			}
			else if(i==0) {
				cambio += cadena2.charAt(i);
				cambio=cambio.toUpperCase();
				cadena2.replace((i), (i + 1), cambio);
				cambio="";
			}
		}
		System.out.println(cadena2);

	}
}
