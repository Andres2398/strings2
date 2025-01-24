package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Invertir una cadena:
		// ■ Una forma manual (con bucles).
		

		System.out.println("Introduce una cadena");

		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		String invertir="";
		

		 for (int i = cadena.length()-1; i >=0; i--) {
			
			
			 invertir+=cadena.charAt(i);
			 
		}
		 System.out.println(invertir);

	}

}
