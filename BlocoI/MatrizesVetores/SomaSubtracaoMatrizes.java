package br.com.generation.exercicios01;

import java.util.Scanner;

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 *	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
 *	das matrizes N1 e N2;
 *	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
 *	posição das matrizes N1 e N2.*/

public class SomaSubtracaoMatrizes {

	public static void main(String[] args) {
		
		System.out.println("  ||| SOMA E SUBTRAÇÃO DAS MATRIZES ||| ");
		System.out.println("Insira os valores inteiros para realizar o soma e subtração: ");
		
		Scanner tecla = new Scanner(System.in);
		
		int[][] N1 = new int [4][6];
		int[][] N2 = new int [4][6];
		int[][] M1 = new int [4][6];
		int[][] M2 = new int [4][6];
		
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.println("Adicione um número: ");
				N1[l][c] = tecla.nextInt();
			}
			System.out.println();
		}
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.println("Adicione um némero: ");
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
		System.out.println("A subtração entre os elementos N1 e N2: \n");
		for(int l = 0; l <= 3; l++) {
			for(int c = 0; c <= 5; c++) {
				System.out.print(M2[l][c] + " | ");
			}
			System.out.println();
		}

	}

}
