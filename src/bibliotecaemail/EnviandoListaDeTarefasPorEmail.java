package bibliotecaemail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.mail.EmailException;

public class EnviandoListaDeTarefasPorEmail {

	public static void main(String[] args) throws IOException, EmailException {
		
		Path arquivo = Paths.get("C:/Users/andre/temp/arquivo-java.txt");
		
		List<String> listaComTarefas = Files.readAllLines(arquivo);

		String tarefas = "";
		
		for (int i = 0; i < listaComTarefas.size(); i++) {
			tarefas += listaComTarefas.get(i) + "\n";
		}
		
		String mensagem = "Minhas tarefas: \n" + tarefas;
		
		Carteiro.enviar("andresilvadev@hotmail.com", "Lista de tarefas", mensagem);
		
		System.out.println("Fim...");
	}
	

}
