package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
			
		Carteiro.enviar("andresilvadev@hotmail.com", "Aula sobre uso de bibliotecas de terceiros em Java", "Se estiver vendo isso é por que o envio funcionou ... :-)");
		
		System.out.println("Fim...");

	}

}
