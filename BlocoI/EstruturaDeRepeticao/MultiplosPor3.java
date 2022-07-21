package br.com.generation.exercicios03;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

public class MultiplosPor3 {

	public static void main(String[] args) {
		
		System.out.println(" || MÉDIA DOS VALORES MÚLTIPLOS DE 3 || ");
		
		Scanner leia = new Scanner(System.in);
		int num, media, soma = 0, i = 0; 
		
		do {
			System.out.println("Insira um número inteiro: ");
			num = leia.nextInt();
			if(num != 0) {
				if(num % 3 == 0) {
					i++;
					soma += num;
				}
			}
			media = soma / i;
		}while(num != 0);
			
			System.out.println("A média dos valores múltiplos por 3 é de : "+ media);		

	}

}
