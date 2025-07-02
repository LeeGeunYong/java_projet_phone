package constructor;

public class CarConstructor {
	private int speed;   //속도
	private int gear;    // 기어
	private String color;  // 색상
	
	// 생성자 
	public CarConstructor() {
		//speed = 0;
		//gear = 1;
		//color = "red";
		this(0,1,"red"); // 하나의 클래스 내에서 다른생선자를 호출 하고자 할때
	}
	
	//생성자 오버로딩
	public CarConstructor(int speed, int gear, String color) {
		this.speed= speed;
		this.gear = gear;
		this.color = color;
		
	}

	//접근자 -접근 제한자 리턴 타입 get+필드명() {return 필드명;} 
	public int getSpeed() {
		return speed;
		
	}
	public int getGear() {
		return gear;
		
	}
	
	 public String getColor() {
		 return color;
	 }
	 public String toString () {
		 return "자동차 정보 [속도=" + speed+ ", 기어 =" + gear + ", 색상=" +color +"]";
		 
	 }
	 
	 
}