import java.util.Scanner;

public class CadastrandoTarefasVetor {

	public static void main(String[] args) {				
				
		  Scanner leia = new Scanner(System.in);

	        System.out.print("Digite Seu Nome: ");
	        String nome = leia.nextLine();

	        String[] tarefas = new String[5];

	        for(int i = 0; i<tarefas.length; i++){
	            System.out.print("Informe a tarefa " + i + ": ");
	            tarefas[i] = leia.nextLine();
	        }

	        System.out.println("Sr(a):" + nome);
	        System.out.println("Suas tarefas são: ");

	        for (int i = 0; i<tarefas.length; i++){
	            System.out.println(i + ": " + tarefas[i]);
	        }

	        leia.close();
	}

}
