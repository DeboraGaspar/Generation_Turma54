package br.com.generaton.exercicios01;

import java.util.Scanner;

/*Um sistema de equações lineares do tipo:
 * ax + by = c
 * dx + ey = f
, pode ser resolvido segundo mostrado abaixo :

 
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/

public class equacaoLineares {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("|| Insira os valores a seguir para calcular as equações ||");
		System.out.println("Insira valor de A :");
		double a = leia.nextDouble();
		
		System.out.println("Insira valor de B : ");
		double b = leia.nextDouble();
		
		System.out.println("Insira valor de C : ");
		double c = leia.nextDouble();
		
		System.out.println("Insira valor de D : ");
		double d = leia.nextDouble();
		
		System.out.println("Insira valor de E : ");
		double e = leia.nextDouble();
		
		System.out.println("Insira valor de F : ");
		double f = leia.nextDouble();
		
		double x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		double y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		
		System.out.println("Com base nos valores inseridos, segue o resultado das equações: "
				+ "\n=> Valor de X = "+x+"\n=> Valor de Y = "+y);
		

	}

}
