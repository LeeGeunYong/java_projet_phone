package class_array;

public class CarObjectArray {
	public static void main(String[] args) {
		
	
		//5개의 인스턴스 생성
		Car c1,c2,c3,c4,c5; // 객체 선언 (참조변수선언)
		
		c1 =new Car();		//객체생성(인스턴스 생성)
		c2 =new Car();
		c3 =new Car();
		c4 =new Car();
		c5 =new Car();
		
		//직접출력
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		
		
		//객체 배열생성
		final int NUM_CARS = 5; // 상수 선언
		Car[] cars = new Car[NUM_CARS];//객체배열선언
		
		for (int i =0; i<cars.length; i++){
			cars[i] = new Car();//객체생성
			//cars[i].carData();//
		
		}
		for	(int i  = 0; i<cars.length; i++) {
			cars[i].speedUp();  //메서드 호출
		}
		
		for (int i = 0 ; i<cars.length; i++) {
			System.out.println("자동차("+(i+1)+") " + cars[i].toString()); // 필드 출력
		}
	}
}
