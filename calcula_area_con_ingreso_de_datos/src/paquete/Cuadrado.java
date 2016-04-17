package paquete;
import java.util.Scanner;
import java.io.IOException;

public class Cuadrado {
	
	

	public static void main(String[] args) {
		
		String continuar = "";

		do {			
			
			Integer lado = 0;
			
			System.out.println ("**********************************************");
			System.out.println ("* PROGRAMA PARA CALCULAR AREA DE UN CUADRADO *");
			System.out.println ("**********************************************");
			          
	        Scanner teclado = new Scanner (System.in); //Creación de un objeto Scanner
	        
	        System.out.println ("Por favor introduzca el LADO del CUADRADO:");
	        
	        lado = teclado.nextInt(); //Invocamos un método sobre un objeto Scanner
	            
	        System.out.println ("\nEl area del CUADRADO es: \"" + lado*lado +"\"");
			
	        System.out.println ("Desea SALIR?: y / n");
	        continuar = teclado.next();
	        
	                

		} while ( !continuar.equals("y") );
			
		System.out.println ("\nADIOS...!");
		
	}

} // fin de la clase cuadrado
