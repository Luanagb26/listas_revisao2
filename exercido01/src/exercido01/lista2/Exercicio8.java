package lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeElementos = 0;
		int[] elementos;
		
		System.out.println("Quantos elementos você deseja inserir? ");
		quantidadeElementos = sc.nextInt();
		
		elementos = new int[quantidadeElementos];
		
		float soma = 0;
		
		for(int i = 0; i<elementos.length; i++) {
			elementos[i] = (int)(Math.random()*100);
			
			 soma = soma + elementos[i];
			 System.out.println(elementos[i]);
			
		}
		
		System.out.println(soma/elementos.length);
		sc.close();
	}
	

}
