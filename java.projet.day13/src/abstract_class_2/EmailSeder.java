package abstract_class_2;

public class EmailSeder extends MessageSender {
	private String senderAddr;
	private String emailBody;
	
	public EmailSeder(String title , String senderName , String senderAddr ,String emailBody) {
		super(title ,senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
		
		
		
	}

	public String getSenderAddr() {
		return senderAddr;
	}

	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
	
	
	

	@Override
	public void sendMessage(String recipient) {
		System.out.println("받는사람 :"+ recipient);
		
	}
	
	
	
	
	
	

}
