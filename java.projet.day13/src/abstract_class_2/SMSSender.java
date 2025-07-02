package abstract_class_2;

public class SMSSender extends MessageSender {
	private String returnPhoneNo; //전화번호 반환번호
	private String message;
	
	public SMSSender (String title , String senderName ,String returnPhoneNo , String message) {
		super(title , senderName );
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

}
