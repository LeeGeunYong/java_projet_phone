package interface_example;

public interface Lendable  { //대여 빌려주다
	public abstract void chekOut(String borrower , String date);//대출 대여  관려메서드
 	void checkin();												//반납 관련 메서드
 	
}
