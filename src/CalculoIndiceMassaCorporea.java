import java.util.Scanner;

public class CalculoIndiceMassaCorporea {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu peso (em Kg): ");
		Double peso = scanner.nextDouble();
				
		System.out.print("Digite sua altura (em metros): ");
		Double altura = scanner.nextDouble();			
		
		Double imc = peso / (altura * altura); 		
		
		System.out.println("Seu IMC é de: " + imc);
		
		scanner.close();
	}
}
