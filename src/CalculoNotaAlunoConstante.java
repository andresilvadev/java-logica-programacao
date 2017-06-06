import java.util.Scanner;

public class CalculoNotaAlunoConstante {

	final static Integer NOTA_PARA_APROVACAO = 70;
	
	public static void main(String[] args) {
				
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Insira o nome do Aluno: ");
			String nomeAluno = scanner.nextLine();
			
			System.out.println("Insira o valor da nota do aluno: " + nomeAluno + " ");		
			Integer nota = scanner.nextInt();
			
			Boolean avaliacaoAluno = nota >= NOTA_PARA_APROVACAO;
			
			Integer notaMaxima = 100;
			
			if(nota == notaMaxima){
				System.out.println("Parabéns! O aluno: " + nomeAluno + " foi aprovado com nota máxima!");
			}
			else if (avaliacaoAluno) {
				System.out.println("Parabéns! O aluno: " + nomeAluno + " foi aprovado!");
			}	
			else{
				System.out.println("Infelizment o aluno: " + nomeAluno + " não foi aprovado!");
			}
			
			scanner.close();
		}
	}
