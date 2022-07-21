package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/bsm")

public class BSMController {
	@GetMapping
	public String bsm() {
		return "BSM's Generation Brasil:\n\n"
				+ "BSM-0 - Sessão 1: Introdução às Competências Comportamentais e Mentalidades.\n\n"
				+ "BSM-GM - Sessão 1: Introdução à Mentalidade de Crescimento.\n\n"
				+ "BSM-GM - Sessão 2: A Mentalidade de Crescimento e o Cérebro.\n\n"
				+ "BSM-GM - Sessão 3: Praticando e Refletindo a Respeito da Mentalidade de Crescimento.\n\n"
				+ "BSM-P - Sessão 1: Introdução à Persistência.\n\n"
				+ "BSM-P - Sessão 2: Persistência e Sua Zona de Conforto. \n\n"
				+ "BSM-PR - Sessão 1: O Poder da Responsabilidade Pessoal. \n\n"
				+ "BSM-PR - Sessão 2: Colocando em Prática a Responsabilidade Pessoal. \n\n"
				+ "BSM-FO - Sessão 1: Introdução à Orientação ao Futuro.\n\n"
				+ "BSM-FO - Sessão 2: Praticando a Orientação ao Futuro.\n\n"
				+ "BSM-C - Sessão 1: Introdução à Comunicação.\n\n"
				+ "BSM-C - Sessão 2: Seja um Bom Comunicador/a.\n\n"
				+ "BSM-OD - Sessão 1: Introdução à Orientação ao Detalhe.\n\n"
				+ "BSM-OD - Sessão 2: Demonstrando Orientação ao Detalhe.\n\n"
				+ "BSM-PA - Sessão 1: Introdução à Proatividade.\n\n"
				+ "BSM-PA - Sessão 2: Seja Proativo!\n\n"
				+ "BSM-T - Sessão 1: Introdução ao Trabalho em Equipe. \n\n"
				+ "BSM-T - Sessão 2: Trabalho em Equipe na Prática.\n\n"
				+ "C-GG -Sessão 1: Dar e Receber.\n\n"
				+ "SA-CS1 - Sessão 1: Força de Trabalho Distribuída.\n\n"
				+ "SA-CS1 - Sessão 1: Entregável Urgente.\n\n"
				+ "SA-CS3 - Sessão 1: Novas Habilidades Necessárias.\n\n"
				+ "SA-CS4 - Sessão 1: Aprender e Compartilhar.\n\n"
				+ "SSM-TM -Sessão 1: Introdução à Gestão do Tempo. \n\n"
				+ "SSM-TM - Sessão 2: Aplicando Estratégias Eficazes de Gestão do Tempo.\n\n"
				+ "SSM-IV - Sessão 1: Introdução à Forças de Caráter VIA.\n\n"
				+ "SSM-IV - Sessão 2: Maximizar Suas Forças.\n\n"
				+ "SSM-RLW - Sessão 1: Introdução à Aprendizagem Online.\n\n"
				+ "SSM-RLW - Sessão 2: Mantendo-se Conectado Enquanto Trabalha À Distância.\n\n"
				+ "SSM-RLW - Sessão 3: Planejando para Vencer.\n\n"
				+ "SSM-RLW - Sessão 4: Vencendo juntos.\n\n";
	}
}