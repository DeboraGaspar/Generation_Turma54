package br.com.generation.exercicios04;
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

import java.util.Scanner;

public class SomaMatrizes {
	
	public static void main(String[] args) {
		
		System.out.println( "==== SOMA MATRIZ 3 x 3 ====");
		
		int matriz[][] = new int[3][3];
		int soma = 0, somaDiagonal = 0, l, c, num;
		
		Scanner leia = new Scanner(System.in);
		
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) {
				System.out.print("Digite o valor na posição da Matriz " + (l+1)+"." +(c+1)+" :");;
				matriz [l][c] = leia.nextInt();
				soma += matriz[l][c];
				
				if(c == l) {
					somaDiagonal += matriz[l][c];
				}
			}
			System.out.println();
		}
		System.out.println("  || TABELA ||  ");
			
		for(l = 0; l < matriz.length; l++) {
			for(c = 0; c < matriz.length; c++) {
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("\n || SOMANDO || \n");
		System.out.println("A soma da diagonal será de: " + somaDiagonal);
		System.out.println("A soma dos valores será de: "+ soma);

	}
}
