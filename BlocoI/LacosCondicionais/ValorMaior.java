package br.com.geneneration.exercicios02;

import java.util.Scanner;

/*Faça um programa que receba três inteiros e 
 * diga qual deles é o maior.*/

public class ValorMaior {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite 3 números inteiros em sequencia: \n1º Número: ");
		int numero1 = valor.nextInt();
		
		System.out.println("2º Número: ");
		int numero2 = valor.nextInt();
		
		System.out.println("3º Número: ");
		int numero3 = valor.nextInt();
		
		int maior = 0;
		
		if(numero1 > numero2) {
			if(numero1 > numero3)
				maior = numero1;
			else
				maior = numero3;
		}
		else {
			if(numero2 > numero3)
				maior = numero2;
			else
				maior = numero3;
		}
		
		System.out.println("O número maior entre os 3 é: " + maior);
		

	}

}
