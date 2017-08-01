package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
	
	static void enviar(String para, String assunto, String mensagem) throws EmailException {
		Email email = new SimpleEmail();
		
		email.setHostName("smtp.mailtrap.io");
		email.setSmtpPort(2525);
		email.setAuthenticator(new DefaultAuthenticator("ed16a88f4978f7", "28ea18c895b5f5"));
		email.setSSLOnConnect(false);
		
		email.setFrom("testedev-9f7c23@inbox.mailtrap.io");
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(para);
		
		email.send();
	}
}
