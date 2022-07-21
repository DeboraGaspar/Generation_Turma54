package br.com.generation.exercicios01;

import java.util.Random;

/* Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
	que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
	imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
	quantas foram as ocorr�ncias da maior pontua��o.
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
		System.out.println("\nA m�dia foi de: " + media);
		System.out.println("E a maior pontua��o foi: " + valorMaior + ", que apareceu " + quant + " vezes !!!" );

	}

}
