package class_example;

public class CarStaticMethodTest {
	public static void main(String[] args) {
		CarStaticMethod c1 = new CarStaticMethod(90, 1, "blue");
		CarStaticMethod c2 = new CarStaticMethod(50, 0, "white");

		System.out.println(c1.toString());
		System.out.println(c2.toString());

		int number = CarStaticMethod.getNumberOfCars(); // 정적 메소드 호출그래서 클래스. 을기입해야함
		System.out.println("지금까지 생성된 자동차 수 = " + number);
	}

	
}
	
