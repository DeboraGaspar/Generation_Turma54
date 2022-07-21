package br.com.generation.exercicios03;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

public class IdadePessoas {
	 public static void main(String[] arg) {
		 
		 int idade = 0, valor, pessoas1 = 0, pessoas2 = 0;
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println(" || VERIFICANDO IDADES || ");
		 
	
		 while(idade <= 99) {
			 System.out.println("Digite sua idade: ");
			 valor = leia.nextInt();	
			 idade = valor;
			 if(valor <= 21) {
				 pessoas1++;
			 }	 
			 if(valor >= 50) {
				 pessoas2++;
			 }
				
		} 
			
		 System.out.println(pessoas1 + " Pessoas com menos de 21 anos.");
		 System.out.println(pessoas2 + " Pessoas com mais de 50 anos.");
	 }

}
