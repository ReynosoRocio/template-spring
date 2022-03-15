package lat.hackademy.micro.services;

public interface EmailPort {
	public boolean sendEmail(EmailBody emailBody);
}