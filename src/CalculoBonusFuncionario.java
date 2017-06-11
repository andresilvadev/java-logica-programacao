import java.util.Scanner;

public class CalculoBonusFuncionario {

	static final Double META_FATURAMENTO_ANUAL = 80000.00;
	static final Double META_QUASE_ATINGIDA = (META_FATURAMENTO_ANUAL * 80) / 100;
	
	public static void main(String[] args) {
		
		Double bonusParaMetaAtingida = null;
		Double bonusParaMetaQuaseAtingida = null;
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Informe o valor do faturamento real da empresa: ");
		Double faturamentoReal = scanner.nextDouble();
		
		System.out.println("Informe o valor da media salárial do último ano do funcionario: ");
		Double mediaSalarialAnual = scanner.nextDouble();
		
		Boolean faturamentoAnualAtingido = (faturamentoReal >= META_FATURAMENTO_ANUAL);
		
		Boolean faturamentoQuaseAtingido = (faturamentoReal >= META_QUASE_ATINGIDA) && (faturamentoReal <= META_FATURAMENTO_ANUAL);
		
		Boolean faturamentoNaoAtingido = (faturamentoReal < META_QUASE_ATINGIDA);
			
		
		
		if(faturamentoAnualAtingido){
			bonusParaMetaAtingida = mediaSalarialAnual;
			System.out.println("O valor do bonus sobre a meta atingida é de: " + bonusParaMetaAtingida);
			
		} else if(faturamentoQuaseAtingido) {
			bonusParaMetaQuaseAtingida = (mediaSalarialAnual * 80) / 100;
			System.out.println("O valor do bonus sobre a meta quse atingida é de: " + bonusParaMetaQuaseAtingida);
			
		}else if(faturamentoNaoAtingido){
			System.out.println("Sem valor de bonus para receber, a meta mínima de: " + META_QUASE_ATINGIDA + " para ter direito ao benefico.");
		}
		
		scanner.close();
	}

}
