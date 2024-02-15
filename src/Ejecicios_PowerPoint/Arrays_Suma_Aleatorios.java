package Ejecicios_PowerPoint;

import java.util.*;

public class Arrays_Suma_Aleatorios {
	
/*Crear una tabla de longitud 10 que se inicializará con números aleatorios
comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios que se
guardan en la tabla.*/	

	public static void main(String[] args) {
    
    double aleatorio[] = {(int)(((Math.random()*99)+1)),(int)(Math.random()*99)+1,
    		(int)(Math.random()*99)+1,(int)(Math.random()*99)+1,(int)(Math.random()*99)+1,
    		(int)(Math.random()*99)+1,(int)(Math.random()*99)+1,(int)(Math.random()*99)+1,
    		(int)(Math.random()*99)+1,(int)(Math.random()*99)+1};
    int suma = 0;
    
	for (int i=0;i<10;i++) {
		
		System.out.print(aleatorio[i]+ " ");
		suma +=aleatorio[i];
	}
	System.out.println();
	
	System.out.print(suma);
  
	
  
	
 
 
 
 
 
 }
	
	
	
	}


