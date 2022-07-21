package br.com.generation.exercicios01;

import java.util.Random;

/* Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.
 */

public class JogoDado {

	public static void main(String[] args) {
		
		System.out.println(" || VAMOS SORTEAR OS DADOS || ");
		System.out.println("... S O R T E A N D O ...");
		
		int[] vetor = new int[10];
		int soma = 0, valorMaior = 0, quant = 0;
		double media;
		
		Random jogaDado = new Random();
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = jogaDado.nextInt(7);
			soma += vetor[i];
			
			if(vetor[i] > valorMaior) {
				valorMaior = vetor[i];
			}
			if(vetor[i] == valorMaior) {
				quant++;
			}
		}System.out.println("Com base nos valores sorteados: ");
		for(int i = 0; i < vetor.length; i++) {
			
			System.out.print(vetor[i] + " | ");
		}
		media = soma / vetor.length;
		System.out.println("\nA média foi de: " + media);
		System.out.println("E a maior pontuação foi: " + valorMaior + ", que apareceu " + quant + " vezes !!!" );

	}

}
