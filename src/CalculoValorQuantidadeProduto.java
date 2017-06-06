import java.util.Scanner;

public class CalculoValorQuantidadeProduto {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Insira a quantidade do produto: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double subtotal = valorProduto * quantidadeProduto;
		
		Boolean aplicaDesconto = quantidadeProduto >= 10;
		
		Double desconto;
		
		Double total;
			
		if(aplicaDesconto){
			desconto = subtotal * 10 / 100;	// Aplica 10% de desconto		
			total = subtotal - desconto;			
			System.out.println("O valor da compra é de: " + total + " com 10% de desconto acima de 10 itens!");
		}else{
			
			total = subtotal;
			System.out.println("O valor da compra é de: " + subtotal + " sem descontos.");
		}		
		
		scanner.close();
	}
}
