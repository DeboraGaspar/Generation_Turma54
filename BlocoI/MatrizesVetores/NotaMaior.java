package br.com.generation.exercicios04;
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

import java.util.Scanner;

public class NotaMaior {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		System.out.println(" --- INFORME SUAS 5 NOTAS PARA SABER QUAL FOI A MAIOR ---");
		double [] valores = new double [5];
		double maiorNota = 0;
		

		
		for(int i = 0; i < valores.length; i++) {
			System.out.println((i+1) + "º Nota da atividade: ");
			valores[i]  = leia.nextDouble();
			if(valores[i] > maiorNota) {
				maiorNota = valores[i];
			}
			
		}
		System.out.println("As notas foram: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(valores[i] + " | ");
		}
		System.out.println("\nSua maior nota foi: " + maiorNota);
		

	}

}
