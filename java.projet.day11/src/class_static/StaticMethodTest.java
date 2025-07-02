package class_static;

public class StaticMethodTest {
	private static int num1 = 5; //정적핖드. 클래스필드 선언.
	private int num2 = 3;        //인스턴스 필드
	
	
	public static void print1() {//정적메서드. 클래스 메서드
		int num3 = num1;
		//int num3 = this.num2;
		System.out.println(num3);
		System.out.println("print1() 호출");
	}
	
	public void print2() {//인스턴스 매서드 
		int num3 = num1;
		int num4 = num2;
		System.out.println(num3 +" "+num4);
		System.out.println("print2() 호출");
	}
	public static void main(String[] args) {
		
	
	StaticMethodTest.print1(); {// 클래스명.정적메서드()로 호출. 
	print1(); 
	}
	
	//StaticMethodTest.print2();     // 결과?
	//print2();
	
	StaticMethodTest method = new StaticMethodTest();
	method.print2();
	}
}
