import java.util.Scanner;

public class CalculoConcursoPublico {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira a nota da prova de Portugues: ");
		Integer notaPortugues = scanner.nextInt();
		
		System.out.println("Insira a nota da prova de Matemática: ");
		Integer notaMatematica = scanner.nextInt();		
		
		Boolean pontuacaoTotalMinima = (notaPortugues + notaMatematica) >= 150;		
		
		Boolean pontuacaoMinina = (notaPortugues >= 60) && (notaMatematica >= 60);
		Boolean pontuacaoMaxima = (notaPortugues <= 100) && (notaMatematica <= 100);
		
						
		if(!pontuacaoMaxima){
			System.out.println("Os valores digitados ultrapassam os limites de avaliação! ");
		}else{			
			if((pontuacaoTotalMinima) && (pontuacaoMinina)){
				System.out.println("Parabéns cantidato com vaga selecionada!");
			}else{
				System.out.println("Candiato não atingiu a pontuação necessária!");
			}
		}
				
		scanner.close();			
				
	}

}
