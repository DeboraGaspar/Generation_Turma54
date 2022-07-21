package br.com.generaton.exercicios01;

import java.util.Scanner;

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

public class lerMedia {
	
	public static void main(String[] arg) {
		
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Insira as 3 notas do semestre para saber sua média: \n- 1º Nota: ");
		double nota1 = nota.nextDouble();
		
		System.out.println("- 2º Nota: ");
		double nota2 = nota.nextDouble();
		
		System.out.println("- 3º Nota: ");
		double nota3 = nota.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Sua média final será de: "+ media);
		}

}
