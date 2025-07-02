package exam_interface;

			//인터페이스명
interface MyInterface {
	public void print();  // 추상메서드  인터페이스
}
		//구현클래스생성1		1	인터페이스명
class MyClass1 implements MyInterface{

	@Override
	public void print() {//인터페이스가 가진 추상메서드 ㅐ저즈의
		System.out.println("MyClass1");
		
	}
	
}
//구현 클래스 생성2
class MyClass2 implements MyInterface{

	@Override
	public void print() {
		System.out.println("MyClass2");
		
	}
	
}

public class Example01 {
    //                            매개변수: 인터페이스 참조변수 = 구현클래스의 주솟값 대입
	public static void test(MyInterface mi) { 
		mi.print();
	}

	public static MyInterface test2() {
		MyInterface mi = new MyInterface() { // 이게 익명클래스 정의 {}가생겼다는게 특징
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		return mi;
	}
	
	public static MyInterface test3() {
		return new MyInterface() {

			@Override
			public void print() {
				System.out.println("Hello");
				
			
			}
	
	};	
}
		
//	public static MyInterface test2() { 여기서 람다식 변경으로 해보자!!!!!!!!!!!!
	//MyInterface mi = new MyInterface() { // 이게 익명클래스 정의 {}가생겼다는게 특징
//			@Override
//			public void print() {
//				System.out.println("test2()메서드에서 반환된 MyInterface");
//			}
//		};
//		return mi;
//	}

	public static void main(String[] args) {

		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print(); // MyClass1
		mc2.print(); // MyClass2
		System.out.println("===============================================");

		//리턴	//공간에		//익명클래스의 주소값을 ㅡmi에 넣어주는거  
		MyInterface mi = new MyInterface() { // 클래스를 정의 하려고 중콸호   /익명클래스를 저주솟값에넣음
			@Override
			public void print() {// 
				System.out.println("익명 클래스로 구현");
			}
		};
		test(mc1); // MyClass1
		test(mi); // 익명 클래스로 구현
		mi.print(); // 익명 클래스로 구현
		
		System.out.println("===============================================");
		
		//마이인터페이스를 구현해 클래스 만든것
		(new MyInterface() {
			@Override //공간 받자마자 바로 호출 해하는것
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print(); // 선언, 생성, 호출을 한번에 처리
							//다향성의 의해서 마이인터페이스의 주소값을 반환받는다
		MyInterface mi2 = test2();
		mi2.print(); // test2() 메서드에서 반환된 MyInterface
		
		MyInterface m  = test3();
		m.print();//test 3() 메서드에서 반환된 MyInterface
		
		System.out.println("==================");
		System.out.println("람다식으로변경하면");
		MyInterface mf = ()->System.out.println("Hello  람다식");
		mf.print();
	}
}







