package br.com.generaton.exercicios01;
/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

import java.util.Locale;
import java.util.Scanner;

public class CustoConsumidor {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Informe qual será o custo de Fábrica: ");
		double custoFabrica = valor.nextDouble();
		
		double taxa = (custoFabrica * 0.28) + (custoFabrica * 0.45);
		double custoConsumidor = custoFabrica + taxa;
		
		System.out.println("O custo ao consumidor será de: " + custoConsumidor);
		
		

	}

}
