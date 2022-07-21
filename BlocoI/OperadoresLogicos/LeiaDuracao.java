package br.com.generaton.exercicios01;

import java.util.Scanner;

/* Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

public class LeiaDuracao {

	public static void main(String[] args) {
		
		int segundos, horas, minutos;
		
		System.out.println("Informe o tempo do evento, expresso em segundo: ");
		Scanner leia = new Scanner(System.in);
		
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		
		System.out.println("O evento durou " + horas + " hora(s)\n" + 
		minutos + " minuto(s) e \n" + segundos + " segundo(s)" );
		

	}

}
