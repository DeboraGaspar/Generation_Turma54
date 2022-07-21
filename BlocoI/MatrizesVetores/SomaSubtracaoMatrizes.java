package br.com.generation.exercicios01;

import java.util.Scanner;

/*Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
 *	a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
 *	das matrizes N1 e N2;
 *	b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
 *	posi��o das matrizes N1 e N2.*/

public class SomaSubtracaoMatrizes {

	public static void main(String[] args) {
		
		System.out.println("  ||| SOMA E SUBTRA��O DAS MATRIZES ||| ");
		System.out.println("Insira os valores inteiros para realizar o soma e subtra��o: ");
		
		Scanner tecla = new Scanner(System.in);
		
		int[][] N1 = new int [4][6];
		int[][] N2 = new int [4][6];
		int[][] M1 = new int [4][6];
		int[][] M2 = new int [4][6];
		
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.println("Adicione um n�mero: ");
				N1[l][c] = tecla.nextInt();
			}
			System.out.println();
		}
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.println("Adicione um n�mero: ");
				N2[l][c] = tecla.nextInt();
			}
			System.out.println();
		}
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}System.out.println("A soma dos elementos N1 e N2: \n");
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.print(M1[l][c] + " | ");	
			}
			System.out.println();
		}
		System.out.println("A subtra��o entre os elementos N1 e N2: \n");
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.print(M2[l][c] + " | ");
			}
			System.out.println();
		}

	}

}
