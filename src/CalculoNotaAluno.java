import java.util.Scanner;

public class CalculoNotaAluno {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o nome do Aluno: ");
		String nomeAluno = scanner.nextLine();
		
		System.out.println("Insira o valor da nota do aluno: " + nomeAluno + " ");		
		Integer nota = scanner.nextInt();
		
		Boolean avaliacaoAluno = nota >= 70;
		
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