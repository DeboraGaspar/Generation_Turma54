package br.com.generation.exercicios03;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/

public class PesquisaDeEmpresa {

	public static void main(String[] args) {
		
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0,
				nervososMais40 = 0, calmosMenos18 = 0, idade, totalPessoas = 0, sexo, caracteristica;
		System.out.println(" || VERIFICANDO EMOÇÕES || ");
		
		Scanner leia = new Scanner(System.in);
		
		while(totalPessoas <= 150) {
			System.out.println("Infome sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Informe seu sexo: 1 - (FEMININO)  2 - (MASCULINO)  3 - (OUTROS)");
			sexo = leia.nextInt();
			
			System.out.println("Selecione a opção que você se identifica: 1 - (CALMA) 2 - (NERVOSA) 3 - (AGRESSIVA)");
			caracteristica = leia.nextInt();
			
			
			if(caracteristica == 1) {
				pessoasCalmas++;
			}
			if(sexo == 1 && caracteristica == 2) {
				mulheresNervosas++;
			}
			if(sexo == 2 && caracteristica == 3) {
				homensAgressivos++;
			}
			if(sexo == 3 && caracteristica == 1) {
				outrosCalmos++;
			}
			if(idade > 40 && caracteristica == 2) {
				nervososMais40++;
			}
			if(idade < 18 && caracteristica == 1) {
				calmosMenos18++;
			}
			totalPessoas++;
		}
		
		System.out.println("O resultado de PESSOAS CALMAS : " + pessoasCalmas);
		System.out.println("O resultado de MULHERES NERVOSAS : " + mulheresNervosas);
		System.out.println("O resultado de HOMENS AGRESSIVOS : " + homensAgressivos);
		System.out.println("O resultado de OUTROS CALMOS : " + outrosCalmos);
		System.out.println("O resultado de PESSOAS NERVOSAS COM MAIS DE 40 ANOS : " + nervososMais40);
		System.out.println("O resultado de PESSOAS CALMAS COM MENOS DE 18 ANOS : "+ calmosMenos18);
	}

}
