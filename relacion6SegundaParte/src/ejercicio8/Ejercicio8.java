package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Reemplazo de caracteres:
		//○ Solicita una cadena y reemplaza todas las vocales con el carácter * usando
		//replace().
		
		System.out.println("Introduce una cadena");
		Scanner sc = new Scanner (System.in);
		String cadena = sc.nextLine();
		
		cadena=cadena.replaceAll("a","*");
		cadena=cadena.replaceAll("e","*");
		cadena=cadena.replaceAll("i","*");
		cadena=cadena.replaceAll("o","*");
		cadena=cadena.replaceAll("u","*");
		System.out.println(cadena);

	}

}
