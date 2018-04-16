package Dependency;

public class MyApp {

	private EmailService email = new EmailService();
	
	public void Messages(String message, String receiver){
		this.email.sendEmail(message,receiver);
	}
}