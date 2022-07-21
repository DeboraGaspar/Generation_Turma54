package br.com.generaton.exercicios01;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

public class LeiaIdade {
	
	public static void main(String[] args) {
		
		int idade, ano, mes, meses, dias;
		
		ano = 365;
		mes = 30;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		meses = (idade * ano) / mes;
		dias = idade * ano;
		System.out.println("Você tem, " + idade + " anos, e sua idade em dias é de " + dias +" dias.");
		
	}

}
