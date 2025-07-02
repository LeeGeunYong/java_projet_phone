package exam_test_car;

public class Car {
	
	private String color; //색
	private int account; //생산수량
	
	public Car() {}
	
	public Car(String color , int account) {
		this.color = color;
		this.account = account;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getAccount() {
		return account;
	}
	
	public String toString() {
		return "[색상]" + color + "[생산수량]" + account;
	}
	
	
}
