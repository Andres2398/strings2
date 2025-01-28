package ejercicio11;

import java.nio.file.spi.FileSystemProvider;

public class Ejercicio11 {
	
	
	public static void main(String[] args) {
		// Construcción eficiente de cadenas:
		// ○ Compara el rendimiento de concatenar 100,000 palabras en un String, un
		// StringBuffer, y un StringBuilder. Usa System.nanoTime() para
		// medir los tiempos de ejecución.

		String palabra="hola";
		String cadena ="";
		StringBuffer cadena2 = new StringBuffer();
		StringBuilder cadena3 = new StringBuilder();

		long tiempo = 0;
		long tiempofinal=0;
		
		 for (int i = 0; i < 100000; i++) {
			 cadena=cadena.concat(palabra);
		}
		 
		tiempo =System.nanoTime();
		System.out.println("Tiempo del String \n" + tiempo + " nanosegundos");
		tiempofinal=tiempo;
		
		for (int i = 0; i < 100000; i++) {
			cadena2=cadena2.append(palabra);
		}
		tiempo=System.nanoTime()-tiempofinal;
		System.out.println("Tiempo del StringBuffer \n" + tiempo + " nanosegundos");
		tiempofinal=tiempo;
		
		for (int i = 0; i < 100000; i++) {
			cadena3=cadena3.append(palabra);
		}
		tiempo=System.nanoTime()-tiempofinal;
		System.out.println("Tiempo del StringBuilder \n" + tiempo + " nanosegundos");
	}

}
