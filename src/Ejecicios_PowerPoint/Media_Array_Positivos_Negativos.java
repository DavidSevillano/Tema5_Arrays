package Ejecicios_PowerPoint;

import java.util.*;

public class Media_Array_Positivos_Negativos {

	public static void main(String[] args) {
	
	/* Introduce por teclado un número n; a continuación, solicita al usuario que teclee n
       números. Realiza la media de los números positivos, la media de los negativos y cuenta
       el número de ceros introducidos.*/
		
	Scanner sc = new Scanner (System.in);
	
	int n = 10, SumaP=0, SumaN=0,cCeros=0,cP=0, cN=0;
	
	int datos []= new int[n];
	
    for (int i=0; i<datos.length; i++) {
    	
    System.out.println("Introduce un numero positivo o negativo");
    datos[i] = sc.nextInt();
    
    if (datos[i]>0) {
    	SumaP+=datos[i];
    	cP++;
    }else if (datos[i]<0) {
    	SumaN+=datos[i];
    	cN++;
    }else{
    	cCeros++;
    }
   	
    }
    
    System.out.println("La media de los numeros positivos es: " + SumaP/cP);
    System.out.println("La media de los numeros negativos es: " + SumaN/cN);
    System.out.println("Has introducido : " + cCeros + " ceros");

	}
	
}
