import java.util.Scanner;

public class CalculoAposentadoria {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é a idade do contribuinte? : ");
		Integer idadeContribuinte = scanner.nextInt();
		
		System.out.println("Qual é o periodo de contribuição: (Informe o valor em anos): ");
		Integer tempoContribuicao = scanner.nextInt();
		
		Integer idadeMininaParaBeneficio = 55;
		Integer periodoMinimoDeContribuicao = 25;
		
		Boolean aplicarBeneficioDaPrevidencia = (idadeContribuinte >= idadeMininaParaBeneficio ) && (tempoContribuicao >= periodoMinimoDeContribuicao );
		
		
		if(aplicarBeneficioDaPrevidencia){
			System.out.println("Beneficio de aposentadoria liberado em seu cadastro!");
		}else{
			System.out.println("O contribuinte deve ter idade mínima de: " + idadeMininaParaBeneficio + " anos e um tempo mínimo de contribuição de: " + periodoMinimoDeContribuicao + " anos.");
		}
				
		scanner.close();
	}

}
