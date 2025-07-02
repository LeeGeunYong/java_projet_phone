package interface_example;

public class AppCDInfo extends CDInfo implements Lendable {

	private	String borrower;// 대출인		상태를 만드는 메서드 필요
	private	String	checkOutDate; //대출일  상태 만드는 메서드 필요
	private	int	state;  //대출 상태  를 만드는 메서드 필요
	
	
	
	
	public AppCDInfo(int registerNo, String title) {//관리번호 ,cd이름
		super(registerNo, title); //관리번호 cd이름
		
	}

	@Override//cd대출을 하려는 메서드 무엇을?? CD를
	public void chekOut(String borrower, String date) {
		if(state == 0) {
			System.out.println("대여중입니다.");
			return ;
			
		}
		System.out.println("Redgat Fedora " + getTitle()  + "CD 가 대출되었습니다");
		
		
	}

	@Override
	public void checkin() {
		if(state == 0)
		
	}

}
