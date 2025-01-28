package ejercicio3;

import java.util.Scanner;

public class Ejercicio3PrimeraParte {

	
		//Invertir una cadena: 
		//○ Implementa un programa que invierta una cadena usando tanto: 
			//■ Una forma manual (con bucles). 

		
		static String invertirLetras(String cadena) {

			// invertir letra de cada palabra

			String invertir = "";
			char caracter;

			for (int i = cadena.length() - 1; i >= 0; i--) {

				caracter = cadena.charAt(i);

				invertir += caracter;

			}

			return invertir;
		}

		public static void main(String[] args) {
			
			
			System.out.println("Introduce una cadena");
			
			Scanner sc = new Scanner(System.in);
			String cadena = sc.nextLine();
			String invertir;
			
			invertir=invertirLetras(cadena);
			System.out.println(invertir);
			
		
		
		
	}

}
