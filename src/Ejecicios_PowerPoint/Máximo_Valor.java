package Ejecicios_PowerPoint;

import java.util.*;

public class Máximo_Valor {
	
	/*Diseñar la función: int maximo(int t[ ]), que devuelva el máximo valor
contenido en la tabla t.*/
	
	static int maximo (int t[]) {
	
	int max=0;
		
	for (int i=0;i<t.length;i++) {
		
		if (t[i]>max) {
			max=t[i];
		}else {
			
		}
	} System.out.println("El valor maximo es " + max);
	return max;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int numeros[];
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Cuantos numeros quieres almacenar?");
	int n = sc.nextInt();
	
	numeros = new int [n];
	
	for (int i=0; i<n; i++) {
		
		System.out.println("Introduce un valor");
		numeros[i] = sc.nextInt();
	
	}
	
	maximo(numeros);

	}

}
