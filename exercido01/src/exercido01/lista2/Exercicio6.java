package lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeElementos = 0;
		int[] elementos;
		
		System.out.println("Quantos elementos você deseja inserir? ");
		quantidadeElementos = sc.nextInt();
		
		elementos = new int[quantidadeElementos];
		for(int i = 0; i<elementos.length; i++) {
			elementos[i] = (int)(Math.random()*100);
			
			if(elementos[i]%2==0) {
				System.out.println("Os números pares gerados foram: "+elementos[i]);
				}
		}
		
		sc.close();
	}
	
	

}
