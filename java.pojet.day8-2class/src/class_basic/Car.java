package class_basic;

public class Car {
	
	// 자동차 (Car) 클래스 선언 //  
	//필드 정의
	public int speed; //속도  // 접근제어자 자료형 변수 
	public int gear; //기어 단수
	public String color; //색상
	
	//전체 필드의값대입
	public void carData(int s, int g, String c) {
		//전체필드의 값 대입
		speed = s;
		gear = g ;
		color = c;
		
	}
	
	public void speedUp (int s) {//속도 증가 메소드. s: 매개변수
		speed += s;
	}
	public void speedDown (int s) {//속도 다운 메소드. s: 매개변수
		speed -= s;
		
	}
	public void printData() {
		// 객체의 상태를 문자열로 출력하는 메소드
		
		System.out.println("속도" + speed + "기어" + gear + "색상" + color);
			
		
	}
	public String toString () {
		//객체의 상태를 문자열로 반환하는 메소드
		return "속도" + speed + "기어" + gear + "색상" + color;
		
		
		
	}

	
}

	
	


	
	
