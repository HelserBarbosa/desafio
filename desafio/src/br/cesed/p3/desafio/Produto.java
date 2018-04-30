package br.cesed.p3.desafio;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade = 1;
	private Produto prox;
	
	/**
	 * Construtor da classe Produtos
	 * 
	 * @param nome
	 * @param preco
	 */
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	/**
	 * retorna o nome dos produtos
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * modifica o nome dos produtos
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * retorna o preço dos produtos
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * modifica o preço dos produtos
	 * @param preco the preco to set
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	/**
	 * retorna o proximo da fila
	 * @return the prox
	 */
	public Produto getProx() {
		return prox;
	}
	/**
	 * modifica o proximo da lista
	 * @param prox the prox to set
	 */
	public void setProx(Produto prox) {
		this.prox = prox;
	}
	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	

}
