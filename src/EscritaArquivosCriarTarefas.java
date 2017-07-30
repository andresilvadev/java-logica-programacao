import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivosCriarTarefas {

public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();		
		
		String tarefa;
		int i = 0;
		
		while(true) { //Condição true do laço, o que vai para-lo é o fato do usuário digitar "sair" no console
			System.out.print("Tarefa " + i + ": ");
			tarefa = scanner.nextLine();
			
			if("sair".equals(tarefa)) {
				break; // Essa é a única maneira de parar esse laço
			}
			
			linhas.add(tarefa);
			i++;
		}

		escreverNoArquivo("C:/Users/andre-silva/temp/arquivo-tarefas-java.txt", linhas);
		
		scanner.close();
		
		System.out.println("Fim do arquivo...");

	}

	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);		
		Files.write(path, linhas);
	}


}
