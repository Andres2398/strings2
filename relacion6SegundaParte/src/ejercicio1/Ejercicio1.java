package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Concatenar cadenas con String: 
		//○ Crea un programa que concatene dos cadenas dadas por el usuario y 
		//muestre el resultado. 
		//○ Ejemplo: Entrada: "Hola, ", "mundo" → Salida: "Hola, mundo"
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una cadena");
		String cadena1 = sc.nextLine();
		System.out.println("Introduce la segunda cadena");
		String cadena2 = sc.nextLine();
		String cadenaResultado=cadena1+ " " +cadena2;
		System.out.println(cadenaResultado);

	}

}
