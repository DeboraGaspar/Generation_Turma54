package br.com.geneneration.exercicios02;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

public class parOuImpar {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Insira um valor a seguir: ");
		
		double n = numero.nextDouble();
		
		if(n % 2 == 0) {
			double raiz = Math.sqrt(n);
			System.out.println("Seu valor: "+n+ "\nÉ um número PAR...\nE sua raiz quadrada é: "+ raiz);
		}
		else {
			double elevado = Math.pow(n, 2);
			System.out.println("Seu valor: "+n+ "\nÉ um número ÍMPAR...\nE seu valor, elevado ao quadrado é: "+elevado);
		}

	}

}
