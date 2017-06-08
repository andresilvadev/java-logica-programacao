import java.util.Scanner;

public class CalculoGastoFamiliar {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor da conta de luz: ");
		Double contaLuz = scanner.nextDouble();
		
		System.out.println("Informe o valor da conta de água: ");
		Double contaAgua = scanner.nextDouble();
		
		System.out.println("Informe o valor da conta de telefone: ");
		Double contaTelefone = scanner.nextDouble();
		
		System.out.println("Informe o valor da mensalidade de escolar: ");
		Double contaEscolar = scanner.nextDouble();
		
		System.out.println("Informe o valor do consume em supermercadoa: ");
		Double contaSupermercado = scanner.nextDouble();
		
		Double soma = contaLuz + contaAgua + contaTelefone + contaEscolar + contaSupermercado;
		
		System.out.println("O consumo familiar é de: " + soma );
		
		scanner.close();
	}
}
