import java.util.Scanner;

public class CalcularQuadrado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		
		Integer numero = scanner.nextInt();
		
		Integer numeroAoQuadrado = numero * numero;
		
		System.out.println("O valor do numero: " + numero + " é " + numeroAoQuadrado + " elevado ao quadrado.");
		
		scanner.close();
		
	}
}
