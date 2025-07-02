package class_array;

public class Car {
	private int speed;
	private int gear;
	private String color;
	
	public Car() {
		speed = 80;
		gear= 1;
		color ="red";
	
	}
	/*public void carData() {
		speed = 80;
        gear = 1;
		color = "red";
	}*/
	
	public void speedUp () {// 속도 메서드 증가
		speed +=10;
	}
	
	public String toString() {//객체의상태를 문자열로 반환하는메소드
		return "속도:" +  speed + "기어" + gear +"색상:" + color;
		
	}
	
	
}
