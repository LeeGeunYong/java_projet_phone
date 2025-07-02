package class_basic;

public class CarMutatorAccessor {
	//필드 정의
	private int speed;
	private int gear;
	private	String color;
	
	//접근자 grtter : private 으로 선언된 필드의 값을 반환하는메서드
	//public 자료향 get필드명() {return필드명;}
	
	public int getSpeed() {
		return speed;
		
	}
	//설정 setter : private 으로 선언됨 필들값을 설정하는 메서드
	//public void set 필드명 (자료향 변수명) {필드명 = 변수명}
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed; 
		}else
				speed = 0;
		
	}
	public int getGear() {
		return gear;
		
	}
	public void setGear (int gear) {
		this.gear = gear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void carData (int speed, int gear, String color) {
		this.speed = speed;
		this.gear = gear;
		this.color = color;
		
	}
	public void speedUp(int s){// 속도 증가 메서드
		speed += s;
	}
	public void speedDown(int s){// 속도 rkath 메서드
		speed -= s;
	}
	public String toString() {// 객체의 상태를 문자열로 반환하느메소드
		return "자동차 상태정보 [속도: " + speed + "기어:"+ gear +"색상:" + color+"]"; 
	}
	
	
	
}
