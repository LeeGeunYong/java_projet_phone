package abstract_class_2;

public abstract class MessageSender { //메세지 발송

	private String title; // 제목
	private String senderName; // 발송자 이름
	
	
	
	//생성자 선언및 정의
	public MessageSender(String title , String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	//접근자 설정자 선언
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
		
	}
	// 추상메서드 선언 예시 실행문에 보면 받는사람이 있음 그걸 하위클래스에서 정의할수있게하자
	public abstract void sendMessage(String recipient ); // recipient 받는사람 발음 러시피언트

}
