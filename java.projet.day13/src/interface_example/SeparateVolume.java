package interface_example;

public class SeparateVolume implements Lendable{
	private int requestNo; //청구 번호
	private String bookTitle;//책제목
	private	String writer; //저자
	private	String borrower;// 대출인		상태를 만드는 메서드 필요
	private	String	checkOutDate; //대출일  상태 만드는 메서드 필요
	private	int	state;  //대출 상태  를 만드는 메서드 필요
	
	
	public SeparateVolume(int requestNo,
						String bookTitle,			
						String writer) {
						
						
						 
		this.requestNo=requestNo; //청구 번호
		this.bookTitle = bookTitle; // 책제목
		this.writer = writer; // 책 저자
		
	}
	
		
	
	

	@Override
	public void chekOut(String borrower, String date) { //대출한다 메서드
		
		if(state == 0) {//대여중이라면
			System.out.println("대여중입니다."); 
			return;
		}
			
			this.borrower=borrower;   // 대출한 사람
			this.checkOutDate = date; // 대출한 낧짜 데이터 
			this.state= 1;// 대출했는지 안했는지 상태 데이터 
			
			System.out.println("*" + bookTitle + "("+ writer + ")  이(가) 대출되었습니다");
			System.out.println("대출인 : " + borrower );
			System.out.println(20240308);
	
		
	}

	@Override
	public void checkin() {// 반납하는 메서드
		if (state == 0)
			return;
		
			state = 0;
			
		System.out.println("*엄마를 부탁해" + bookTitle + "이("+"가) 반납되었습니다 " );
		
		
		
	}





	public int getRequestNo() {
		return requestNo;
	}





	public void setRequestNo(int requestNo) {
		this.requestNo = requestNo;
	}





	public String getBookTitle() {
		return bookTitle;
	}





	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}





	public String getWriter() {
		return writer;
	}





	public void setWriter(String writer) {
		this.writer = writer;
	}





	public String getBorrower() {
		return borrower;
	}





	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}





	public String getCheckOutDate() {
		return checkOutDate;
	}





	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}





	public int getState() {
		return state;
	}





	public void setState(int state) {
		this.state = state;
	}
	
	
	
		
	

}
