package class_basic;

public class CarMutatorAccessorTest {
	public static void main(String[] args) {
		CarMutatorAccessor myCar = new CarMutatorAccessor ();
		//myCar.Color= "red"; //private 명시 되어있지 않을 떄만
		
		myCar.setColor("red"); 
		myCar.setSpeed(-70);
		myCar.setGear(1);
	
		// 접근자 메소드 호출
		System.out.println("==== 접근자 메소드 호출로 필드 출력 ====");
		System.out.println("현재 자동차의 색상 : " + myCar.getColor());
		System.out.println("현재 자동차의 속도 : " + myCar.getSpeed());
		System.out.println("현재 자동차의 기어 : " + myCar.getGear());
		System.out.println();

		System.out.println("==== toString() 메서드로 전체 필드 출력 ====");
		System.out.println(myCar.toString());
		
	}
}
