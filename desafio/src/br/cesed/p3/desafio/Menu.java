package br.cesed.p3.desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	static ArrayList<Produto> produtos = new ArrayList<Produto>();

	public static void listaDeProdutos() {

		Produto produto1 = new Produto("Bolacha Oreo", 2.25);
		Produto produto2 = new Produto("Oleo", 4.0);
		Produto produto3 = new Produto("Detergente", 1.50);
		Produto produto4 = new Produto("Sabão em pó", 2);
		Produto produto5 = new Produto("Cream Craker", 2);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);

	}

	public static void main(String[] args) {

		int codigo = 0;
		Scanner teclado = new Scanner(System.in);
		Carrinho carrinho = new Carrinho();
		listaDeProdutos();

		do {
			System.out.println("::Sistema Assai de Vendas - Powered by SI::"
					+ "\nOpções : \n1)Adicionar um produto específico ao carrinho"
					+ "\n2)Encerrar Compra \n3)Sair do Sistema");
			codigo = teclado.nextInt();
			switch (codigo) {

			case 1:
				System.out.println("::Listagem de Produtos::\n");
				carrinho.lista();
				System.out.println("\nDigite o código o produto (ou 0 para sair deste menu)");
				codigo = teclado.nextInt();
				if (codigo != 0) {
					if (produtos.get(codigo - 1) == carrinho.buscaProduto(produtos.get(codigo - 1))) {
						int qtd = carrinho.buscaProduto(produtos.get(codigo - 1)).getQuantidade();
						carrinho.buscaProduto(produtos.get(codigo - 1)).setQuantidade(qtd + 1);
					} else {
						carrinho.add(produtos.get(codigo - 1));
					}
					codigo = 2;
				}
				break;
			case 2:
				System.out.println("::Listagem de produtos Adquiridos::\n");
				carrinho.lista();
				System.out.println("\nTotal : R$" + carrinho.getTotal());
				System.out.println("\nDigite 1 para encerrar ou  2 para voltar ao menu inicial");
				codigo = teclado.nextInt();
				break;
			}
		} while (codigo == 0 || codigo == 2);
		teclado.close();
	}

}
