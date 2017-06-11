import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu dia da semana preferido em número: ");
		Integer diaDaSemana = scanner.nextInt();
		
		
		switch (diaDaSemana) {
		case 1: System.out.println("Domingo");			
			break;
		case 2: System.out.println("Segunda-feira");			
			break;
		case 3: System.out.println("Terça-feira");			
			break;
		case 4: System.out.println("Quarta-feira");			
			break;
		case 5: System.out.println("Quinta-feira");			
			break;
		case 6: System.out.println("Sexta-feira");			
			break;
		case 7: System.out.println("Sabado");			
			break;

		default: System.err.println("Ops! Dia da semana inexistente!");;
			break;
		}
		
		scanner.close();
	}

}
