package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// División y reconstrucción de texto: 
		//○ Crea un programa que divida un texto en palabras usando split() y luego 
		//reconstruya la frase en orden inverso utilizando StringBuilder. 
		
		System.out.println("Introduce una cadena");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		String[] auxiliar = cadena.split(" ");
		
		StringBuffer resultado = new StringBuffer();
		
		for (int i = auxiliar.length-1; i>=0; i--) {
			resultado.append(auxiliar[i]);
			resultado.append(" ");
			
		}
		
		System.out.println(resultado.toString().trim());
		}
		
	}


