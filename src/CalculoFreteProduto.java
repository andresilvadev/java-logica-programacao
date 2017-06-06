import java.util.Scanner;

public class CalculoFreteProduto {

	final static Double CUSTO_FRETE = 15.00; // Utilizando frete como uma constante
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Informe o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Informe a quantidade do produto: ");
		Integer quantidadeProduto = scanner.nextInt();
		
		Double valorDaCompra = quantidadeProduto * valorProduto;
		
		Boolean freteGratis = valorDaCompra >= 100;		
		
		Double total;
		
		if(freteGratis){
			
			total = valorDaCompra;
			System.out.println("Total em compras: " + total + " com frete grátis!");
			
		}else{
			
			total = valorDaCompra + CUSTO_FRETE;
			System.out.println("Total em compras: " + total + " reajuste de R$: 15,00 custo de frete!");
		}		
		
		scanner.close();
		
	}
}
