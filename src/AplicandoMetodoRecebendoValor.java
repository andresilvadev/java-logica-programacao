import java.util.Scanner;

public class AplicandoMetodoRecebendoValor {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		
		String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};
		
		imprimir("Escolha dentre os cursos abaixo: ");
			
		
		iterarEExibirPosicoesDoVetorString(cursos);		
		
		Integer posicaoCursoEscolhido =  receberNumeroInteiroDoUsuario("O curso que vc deseja é o:" , scanner);		
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		
		if(!posicaoValida){
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		
		imprimirTraco();
		
		
		String[] formasPagamento = new String[]{"Cartão", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);		
		
		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento é: ", scanner);
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		if(!posicaoValida){
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();

	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner){
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor){
		Boolean valida =  posicao >= 0 && posicao < vetor.length;
		return valida;
	}

	static void imprimir(String texto){
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto){
		System.out.println(texto);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor){
		for(int i =0; i < vetor.length; i++){
			imprimir("[" + i + "]" + vetor[i]);
		}
	}
	
	private static void imprimirTraco() {
		System.out.println("----------------------------------------------");		
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida(){
		System.err.println("Posição inválida");
		System.exit(1);
	}

}
