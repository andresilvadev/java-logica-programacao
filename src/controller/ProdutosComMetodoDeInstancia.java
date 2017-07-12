package controller;

import model.ProdutoComMetodoDeInstancia;

public class ProdutosComMetodoDeInstancia {

	public static void main(String[] args) {
		
		ProdutoComMetodoDeInstancia produto = new ProdutoComMetodoDeInstancia();
		produto.nome = "Notebook Dell Vostro";
		produto.quantidadeEstoque = 5;
		
		System.out.println("É necessário repor estoque do produto " + produto.nome + " ? " + produto.eNecessarioReporEstoque());
	}

}
