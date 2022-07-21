package br.com.generation.exercollections;

public class Produtos {

	String Estoque;
	
	public Produtos(String estoque) {
		Estoque = estoque;
	}

	public String getEstoque() {
		return Estoque;
	}

	public void setEstoque(String estoque) {
		Estoque = estoque;
	}
	
	@Override
	public String toString() {
		return Estoque;
	}


}
