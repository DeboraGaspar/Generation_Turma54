package br.com.generation.exercicios03;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares 
 * e quantos são ímpares. (FOR)
 */

public class ParImpar {
	public static void main(String[] args) {
		
		int par = 0, impar = 0, i;
		Scanner leia = new Scanner(System.in);

		for(i = 1; i <= 10; i++) {
	
			System.out.println("Insira um número: ");
			double n = leia.nextDouble();
			
			if(n % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}System.out.println("Resultado de número(s) PAR(ES): "+ par);
		System.out.println("Resultado de número(s) ÍMPAR(ES): "+ impar);
		
	}
}