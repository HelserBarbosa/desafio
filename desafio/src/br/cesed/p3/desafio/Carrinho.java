package br.cesed.p3.desafio;

public class Carrinho {

	private Produto inicio;
	private int inseridos;
	private double total;

	public void add(Produto produto) {
		total += produto.getPreco();

			if (inicio == null) {

				inicio = produto;

			} else {

				Produto temp = inicio;
				while (temp.getProx() != null) {

					temp = temp.getProx();

				}
				temp.setProx(produto);
			}
		inseridos++;

	}

	public void lista() {

		if (inicio != null) {
			Produto temp = inicio;
			while (temp.getProx() != null) {
				System.out.println("Nome : " + temp.getNome() + "  qtd :  " + temp.getQuantidade());
				temp = temp.getProx();
			}
			System.out.println("Nome : " + temp.getNome() + "  qtd :  " + temp.getQuantidade());
		} else {
			System.out.println("vazio");
		}
	}

	public int inseridos() {

		return inseridos;

	}

	public double getTotal() {
		return total;
	}

	public Produto buscaProduto(Produto prod) {
		if (inicio == null) {

			return null;
		}

		Produto temp = inicio;
			while (temp.getProx() != prod && temp.getProx() != null) {
				temp = temp.getProx();
			}
		
		if (temp == null) {

			temp = inicio;

		}
		return temp;
	}

}
