package br.com.generation.exerheranca;

public class Animal {
	
	private String nome;
	private int idade;
	
	
	public void emiteSom(String som) {
		System.out.println( "Fa�o o som assim: " + som);
	}
	
	public void movimento(String movimento) {
		System.out.println("Meu movimento favorito �: " + movimento);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Meu nome �: "+ nome);
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		System.out.println("Tenho "+ idade + " anos de vida! ");
	}
	
	

}
