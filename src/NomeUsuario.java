import java.util.Scanner;

public class NomeUsuario {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é seu primeiro nome? ");
		String primeiroNome = scanner.nextLine();
		
		System.out.println("Qual é seu segundo nome? ");
		String segundoNome = scanner.nextLine();
		
		System.out.println("Seja bem vindo: " + primeiroNome + " " + segundoNome);
		
		scanner.close();
	}
}
