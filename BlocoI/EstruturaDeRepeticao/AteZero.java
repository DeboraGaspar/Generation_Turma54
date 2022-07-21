package br.com.generation.exercicios03;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

public class AteZero {

	public static void main(String[] args) {
		
		System.out.println("  || SOMANDO VALORES ATÉ ACERTAR O NÚMERO QUE PARA O PROGRAMA ||");
		
		int num, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.println("Insira um valor: ");
			
			num = leia.nextInt();
			if(num != 0) {
				soma += num;
			}
		}while(num != 0);
		
		System.out.println("A soma dos  valores inseridos é de : "+ soma);
	}

}
