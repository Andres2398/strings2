package ejercicio6;

import java.util.Scanner;

public class Ejericico6 {
	
	public static void main(String[] args) {
		
		//Convertir un texto en mayúsculas y minúsculas:
		//○ Pide al usuario una cadena y transforma el texto a mayúsculas
		//(toUpperCase()) y a minúsculas (toLowerCase()).

		
		
		System.out.println("Introduce una cadena");

		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();
		
		
		System.out.println("Todo en mayuscula " + cadena.toUpperCase());
		System.out.println("Todo en minuscula " + cadena.toLowerCase());
		
	}
	
	

}
