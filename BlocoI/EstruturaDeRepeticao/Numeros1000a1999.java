package br.com.generation.exercicios03;

/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

public class Numeros1000a1999 {

	public static void main(String[] args) {
		
		for(int i = 1000; i <= 1999; i++) {
			if(i % 11 == 5) {
				System.out.println(i + " é um número divisível por 11 e tem o resto de 5!");
			}
		}

	}

}
