package Ejecicios_PowerPoint;

import java.util.*;

public class Mismo_Orden_Numeros {
	
/*Diseñar un programa que solicite al usuario que introduzca por teclado 5 números
decimales. A continuación, mostrar los números en el mismo orden que se han
introducido.*/

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	
	double numeros[] = new double[5];
		
	for (int i=0; i<=4; i++) {
		
		System.out.println("Introduce un numero decimal");
		numeros [i]= sc.nextDouble();
		
	}
	/*for (int i=0; i<=4; i++) {
		
		System.out.println(numeros[i]);
		
		
	}	*///Solucion larga
	
	System.out.println(Arrays.toString(numeros)); //Solucion corta

	}

}
