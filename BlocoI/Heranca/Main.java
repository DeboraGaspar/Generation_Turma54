package br.com.generation.exerheranca;

public class Main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.especie();
		cachorro.setNome("Jujuba");
		cachorro.setIdade(4);
		cachorro.emiteSom("au au au");
		cachorro.movimento("correr");
		
		System.out.println("---------------------------------------");
		
		Cavalo cavalo = new Cavalo();
		cavalo.especie();
		cavalo.setNome("Pegasus");
		cavalo.setIdade(14);
		cavalo.emiteSom("hinn in in");
		cavalo.movimento("correr");
	
		System.out.println("---------------------------------------");
		
		Preguica preguica = new Preguica();
		preguica.especie();
		preguica.setNome("Flecha");
		preguica.setIdade(21);
		preguica.emiteSom("zzzZZzzzZZzzz");
		preguica.movimento("subir em árvores");
		
		
		

	}

}
