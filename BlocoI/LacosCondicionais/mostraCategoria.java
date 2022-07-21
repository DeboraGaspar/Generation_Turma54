package br.com.geneneration.exercicios02;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

public class mostraCategoria {
	
	public static void main(String[]args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Digite sua idade para saber em qual categoria se encaixa: ");
		
		int idade = valor.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Sua categoria: INFANTIL");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Sua categoria: JUVENIL");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Sua categoria: ADULTO");
		}
		else {
			System.out.println("Idade fora da tabela de categoria! ");
		}
		
	}

}
