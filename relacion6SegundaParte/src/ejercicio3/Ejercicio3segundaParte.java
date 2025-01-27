package ejercicio3;

import java.util.Scanner;

public class Ejercicio3segundaParte {
	
	
	
	public static void main(String[] args) {
		
		//	// Invertir una cadena:
		//■ El método reverse() de StringBuffer o StringBuilder. 
		
		System.out.println("Introduce una cadena");

		Scanner sc = new Scanner(System.in);
		StringBuffer cadena= new StringBuffer();
		cadena.append(sc.nextLine());
		System.out.println("cadena invertida "+ cadena.reverse());
		
		
		
		
	}

}
