package controller;

import model.Produto;

public class ProdutosController {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.00;
		produto.quantidadeEstoque = 9;		
		
		System.out.println("Necessário repor estoque do produto " + produto.nome + " ? " + verificaSaldoDoEstoque(produto));
		
	}
	
	
	static Boolean verificaSaldoDoEstoque(Produto produto) {
		if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			System.out.println("O saldo atual do produto " + produto.nome + " é de " +  produto.quantidadeEstoque);
			return true;
		}
		
		return false;
	}
	
	

}