package lista2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeElementos = 0;
		int[] elementos;
		
		System.out.println("Quantos elementos você deseja inserir? ");
		quantidadeElementos = sc.nextInt();
		
		elementos = new int[quantidadeElementos];
		
		int nMaior = 0;
		int nMenor = 2;
		
		for(int i = 0; i<elementos.length; i++) {
			elementos[i] = (int)(Math.random()*100);
			
			
			
			if(elementos[i]>nMaior) {
				nMaior = elementos[i];
				
			}else if(elementos[i]<nMenor){
				nMenor = elementos[i];
			}
			
		}
		System.out.println("O maior número foi :"+nMaior+"; O menor número foi: "+nMenor);
		sc.close();
	}
	

}
