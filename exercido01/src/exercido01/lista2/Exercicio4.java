package lista2;

import java.util.Iterator;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[100];
		int contador = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*100);
			
			for(int j = numeros[i]; j>=1 ; j--){
				
				if(numeros[i] % j == 0) {
					contador ++;
				}
			}
			
		}
	}

}
