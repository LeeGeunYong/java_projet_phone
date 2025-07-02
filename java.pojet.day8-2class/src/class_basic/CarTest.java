package class_basic;

public class CarTest {
	public static void main(String[] args) {
		// 실행 클래스 선언
		
		//클래스명 참조 변수 = new 클래스명();
		
		
		Car myCar = new Car();// 첫번째 객체 생성 / 인스턴스화 (클래스를 가지고 객체를 생성 그것을 인스턴스화)
		// 각각의 필드에 값을 설정해 주는 방법- 참조변수명.필드 =값
		
		myCar.speed = 0; // 객체의 필드 변경
		myCar.gear = 1; //객체의 필드 변경
		myCar.color = "red"; //객체의 필드 변경
		
		//필드값 에 대입 // 두번째 객체 필드대입 변경
		myCar.carData(0,1, "red");//data를 통해서  클래스서 선언한 data 에 s g c에 값을 넣어줌
		
		//객체의 메소드 호출 -참조변수명 .메서드()
		myCar.speedUp(20);
		myCar.printData();                   //출력방법1
		System.out.println(myCar.toString());// 출력방법2
		System.out.println();
		
		Car yourCar = new Car();// 두번째 객체 생성 // 메모리 할당받으려고
		
		
		// 필드에 값대입 [1
		yourCar.gear = 3 ;//
		yourCar.speed = 30;
		yourCar.color = "blue";
		
		//필드에 값 대입[2
		yourCar.carData(30, 3, "blud");// [1,2]랑 같은 출력문 아무거나써라
		
		
		yourCar.speedDown(15);  //객체의 메소드 호출
		yourCar.printData();  // 출력방법 1
		System.out.println(yourCar.toString()); // 두번째 방법
		
		
		
		
		
		
		
	
	}
}
