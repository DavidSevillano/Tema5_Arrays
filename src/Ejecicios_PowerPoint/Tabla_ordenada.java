package Ejecicios_PowerPoint;

import java.util.*;

public class Tabla_ordenada {
	
/*Escribir la función: int[ ] rellenaPares(int longitud, int fin) que crea y devuelva 
una tabla ordenada de la longitud especificada, que se encuentra rellena con números 
pares aleatorios comprendidos en el rango de 2 hasta fin (inclusive).*/
	
	static int RellenaPares (int longitud, int fin) {
		
	int TablaOrdenada[] = new int [longitud]; //Declaramos la variable con la longitud correspondiente
	
	for (int i=0; i<TablaOrdenada.length;i++) {//Recorremos el array
		do {
		 TablaOrdenada[i] = (int) (Math.random()*fin)+1;//Le damos un valor Random
		 
		}while(TablaOrdenada[i]%2!=0);//Hasta que ese valor no sea par no se sale del bucle
		
	}Arrays.sort(TablaOrdenada);//Ordenamos la tabla
	System.out.println(Arrays.toString(TablaOrdenada));//Mostramos la tabla ordenada
	return 0;	
	}

	public static void main(String[] args) {
		
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Introduce la longitud del Array");
    int longitud = sc.nextInt();
    
    System.out.println("Introduce el fin del Array");
    int fin = sc.nextInt();
    
    RellenaPares(longitud,fin);
		

	}

}
