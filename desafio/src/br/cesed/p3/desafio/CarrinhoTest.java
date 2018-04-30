package br.cesed.p3.desafio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarrinhoTest {
	
	Carrinho carrinho = new Carrinho();
	
	Produto produto1 = new Produto("Bolacha Oreo", 2.25);
	Produto produto2 = new Produto("Oleo", 4.0);
	Produto produto3 = new Produto("Detergente", 1.50);
	Produto produto4 = new Produto("Sabão em pó", 2);
	Produto produto5 = new Produto("Cream Craker", 2);
	
	@Test
	public void Carrinhotest() {
		carrinho.add(produto1);
		carrinho.add(produto1);
		carrinho.add(produto2);
		carrinho.add(produto2);
		carrinho.add(produto2);
		carrinho.add(produto3);
		carrinho.lista();
	}

}
