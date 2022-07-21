package br.com.generation.exercollections;

import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		
		Produtos produtos01 = new Produtos("Leite");
		Produtos produtos02 = new Produtos("Farinha");
		Produtos produtos03 = new Produtos("Arroz");
		Produtos produtos04 = new Produtos("Feijão");
		Produtos produtos05 = new Produtos("Macarrão");
		
		ArrayList<Produtos> produtos = new ArrayList<>();
		
		produtos.add(produtos01);
		produtos.add(produtos02);
		produtos.add(produtos03);
		produtos.add(produtos04);
		produtos.add(produtos05);
		
		System.out.println("-> Estoque de Produtos: " + produtos);
		
		produtos.remove(3);
		produtos.remove(1);
		
		System.out.println("\n...REMOVENDO PRODUTOS...\n");
		System.out.println("-> Estoque de Produtos: " + produtos);
		
		Produtos produtos06 = new Produtos("Tomate");
		Produtos produtos07 = new Produtos("Azeite");
		
		produtos.set(2, produtos06);
		produtos.set(0, produtos07);
		
		System.out.println("\n...SUBSTITUINDO PRODUTOS...\n");
		System.out.println("-> Estoque de Produtos: "+ produtos);
		
		produtos.add(produtos04);
		produtos.add(produtos02);
		produtos.add(produtos01);
		produtos.add(produtos05);
		
		System.out.println("\n     <*> DADOS DA LISTA: <*> \n \n" + produtos);
		
		
	}
}
