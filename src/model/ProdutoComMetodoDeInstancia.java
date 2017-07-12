package model;

public class ProdutoComMetodoDeInstancia {
	
	public static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
	
		public String nome;
		public Integer quantidadeEstoque;
		
		public Boolean eNecessarioReporEstoque(){
			if(quantidadeEstoque < ProdutoComMetodoDeInstancia.QUANTIDADE_MINIMA_ESTOQUE){
				return true;
			}
			return false;
		}

}
