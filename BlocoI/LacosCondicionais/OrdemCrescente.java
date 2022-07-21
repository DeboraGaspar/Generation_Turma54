package br.com.geneneration.exercicios02;
/*Faça um programa que entre com três números e coloque 
 * em ordem crescente.*/

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		System.out.println("Insira 3 valores, para serem colocados em ordem crescente: \n1º Valor: ");
		double numero1 = numero.nextDouble();
		
		System.out.println("2º Valor: ");
		double numero2 = numero.nextDouble();
		
		System.out.println("3º Valor: ");
		double numero3 = numero.nextDouble();
		
		if(numero1 <= numero2 && numero2 <= numero3) {
			System.out.println("A ordem crescente é: "+ numero1+ ", " +numero2+ ", "+numero3+ "!");
		}
		else if(numero1 <= numero3 && numero3 <= numero2) {
			System.out.printf("A ordem crescente é: "+numero1+", "+numero3+", "+numero2+ "!");
		}
		else if(numero2 <= numero1 && numero1 <= numero3) {
			System.out.println("A ordem crescente é: "+numero2+", "+numero1+", "+numero3+ "!");
		}
		else if(numero2 <= numero3 && numero3 <= numero1) {
			System.out.println("A ordem crescente é: " +numero2+", "+numero3+", "+numero1+"!");
		}
		else if(numero3 <= numero1 && numero1 <= numero2) {
			System.out.println("A ordem crescente é: "+numero3+", "+ numero1 +", "+ numero2+"!");
		}
		else { /* numero3 <= numero2 && numero2 < numero1*/
			System.out.println("A ordem crescente é: "+numero3 + ", "+numero2+ ", "+ numero1+"!");
		}

	}

}
