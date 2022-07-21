package br.com.generation.oop.exer01;

import java.util.Scanner;

public class TestaCliente {
	
static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Cliente cliente01 = new Cliente();
		
		cliente01.setCompra("FOGÃO");
		cliente01.setFormaPagamento("cartão");
		cliente01.setValorCompra(786.90);
		
		
		
		System.out.println(" --- VERICAÇÃO DE CLIENTE LOJA JAVASHOP ---");
		
		System.out.println("Insira nome do cliente para acessar informações: ");
		
		cliente01.setNome(leia.next());
		
		System.out.println("   ||| INFORMAÇÕES DO CLIENTE: ");
		System.out.println("Nome: " + cliente01.getNome());
		System.out.println("Produto comprado: " + cliente01.getCompra());
		System.out.println("Forma de pagamento: " + cliente01.getFormaPagamento());
		System.out.println("Valor da compra: "+ cliente01.getValorCompra());
	}

}
