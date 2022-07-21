package br.com.generaton.exercicios01;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

public class LeiaAnosMesesDias {

	public static void main(String[] args) {
		
		int ano, mes, idade, meses, dias;
		
		ano = 365;
		mes = 30;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		dias = idade * ano;
		meses = idade * ano / mes;
		
		System.out.println("Você tem " + idade + " anos...");
		System.out.println("Sua idade em meses é de, " + meses + " meses!!!");
		System.out.println("Sua idade em dias é de, " + dias + " dias!!!");
		
		
		
				

	}

}
