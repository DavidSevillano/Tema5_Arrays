package Ejercicios_Propios;

import java.util.*;

public class Buscar_Numero_Matriz {

	public static void Posicion (int matriz [][], int numero) {
		
		if(numero>9||numero<1) {
			System.out.println("El numero no existe en la matriz");
		}else {
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				
				if (matriz[i][j]==numero) {
					System.out.println("El numero se encuentra en la posicion i="+i+ " j="+ j);
				}
					
		
			}
		}	
		}
	}
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
	
	Scanner sc = new Scanner (System.in);	
	int matriz [][]= new int [3][3];
	int n=1;
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz.length;j++) {
			
			matriz[i][j]=n;
			n++;
			
			
		}
		
		
	} System.out.println("Que posicion ocupa elemento...");
	int p=sc.nextInt();
	
	for (int i=0;i<matriz.length;i++) {
		for (int j=0;j<matriz.length;j++) {
		
			System.out.print(matriz[i][j]+" ");
		}
		System.out.println();
	}
	Posicion(matriz,p);

	}

}
