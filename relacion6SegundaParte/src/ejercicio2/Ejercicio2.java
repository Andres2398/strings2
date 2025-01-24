package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	
	
	public static void main(String[] args) {
		
	//Comparar cadenas: 
		//○ Escribe un programa que tome dos cadenas como entrada y determine si son 
		//iguales usando el método equals() y equalsIgnoreCase().	
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una cadena");
		String cadena1 = sc.nextLine();
		System.out.println("Introduce la segunda cadena");
		String cadena2 = sc.nextLine();
		if(cadena1.equals(cadena2))
			System.out.println("Tus cadenas son iguales");
		else if(cadena1.equalsIgnoreCase(cadena2))
			System.out.println("tus cadenas son iguales si ignoramos mayusculas y minusculas");
		else 
			System.out.println("Tus cadenas no son iguales");
		
	}

}
