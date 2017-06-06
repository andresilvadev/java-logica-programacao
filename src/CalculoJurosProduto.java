import java.util.Scanner;

public class CalculoJurosProduto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Selecione o tipo do pagamento: 1 - Compra á vista e 2 - Compra a prazo");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros;
		
		if(pagamentoAVista){
			juros = 0.0;
		}else{
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double total = valorProduto + acrescimo;
		
		System.out.println("O valor total do produto é de: " + total + " ");
		
		scanner.close();
	}
}
