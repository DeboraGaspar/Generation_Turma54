package br.com.generaton.exercicios01;

import java.util.Scanner;

/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:

D = R + S / 2, onde R = (A + B)^2
                    S = (B + C)^2  */         

public class calculandoExpressoes {

	public static void main(String[] args) {
		
		int R, D, S;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Escreva a seguir três valores para calcular expressões: \n1º Valor: ");
		int a = leia.nextInt();
		
		System.out.println("2º Valor: ");
		int b = leia.nextInt();
		
		System.out.println("3º Valor: ");
		int c = leia.nextInt();
		
		R = (a + b) * (a + b);
		S = (b + c) * (b + c);
		D = (R+S) / 2;
		
		System.out.println("O valor de R é "+R+" o valor de S é "+S+" o valor de D é "+D);
		
		
		

	}

}
