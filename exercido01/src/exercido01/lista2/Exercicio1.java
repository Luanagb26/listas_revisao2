package lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double nota5;
		double mediaAri;
		
		System.out.println("Insira da primeira nota: ");
			nota1 = sc.nextDouble();
		System.out.println("Insira da segunda nota: ");
			nota2 = sc.nextDouble();
		System.out.println("Insira da terceira nota: ");
			nota3 = sc.nextDouble();
		System.out.println("Insira da quarta nota: ");
			nota4 = sc.nextDouble();
		System.out.println("Insira da quinta nota: ");
			nota5 = sc.nextDouble();
		
		mediaAri = ((nota1+nota2+nota3+nota4+nota5)/5);
		
		System.out.println("A média é: "+ mediaAri);
		sc.close();
	}

}
