import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		Integer primeiroNumero = scanner.nextInt();
		
		System.out.println("Informe o calculo que deseja realizar: + , - , / , * ");
		String operador = scanner.next();
		
		System.out.println("Insira o segundo numero: ");
		Integer segundoNumero = scanner.nextInt();
				
		Integer soma = primeiroNumero + segundoNumero;
		Integer subtracao = primeiroNumero - segundoNumero;
		Integer divisao = primeiroNumero / segundoNumero;
		Integer multiplicacao = primeiroNumero * segundoNumero;
		
		Integer resultado;
		
		if("+".equals(operador)){
			
			resultado = soma;
			System.out.print("Resultado: " + resultado);
			
		}else if ("-".equals(operador)) {
			
			resultado = subtracao;
			System.out.print("Resultado: " + resultado);
			
		}else if("/".equals(operador)){
			
			resultado = divisao;
			System.out.print("Resultado: " + resultado);
			
		}else if("*".equals(operador)) {
			
			resultado = multiplicacao;
			System.out.print("Resultado: " + resultado);
		}
				
		scanner.close();
	}
}
