package polymorphism;


class A {
		int a = 10;
		void b() {
			System.out.println("A");
		}
	

}

class AA extends A {
	int a = 20;
	void b() {
		System.out.println("AA");
	}
	void c() {
		System.out.println("c");
	}
}

class BB extends A{
	int a = 30;
	void b () {
		System.out.println("BB");
	}
	void d () {
		System.out.println("D");
	}
	
}

class ClassTest {
	public static void main(String[] args) {
		// A a1 = new A();
				// AA a2 = new AA();

		A z = new AA(); // AA객체를 ㄱ생성해서A타입의 레퍼런스에 할상한다. 업캐스팅 
							// 부모타입에 기능필만 접근가능
		System.out.println(z.a);//슈퍼 클래스의 필드접근
		z.b();//AA가 출력          //슈퍼 클래스의 메서드접근
								// 단 서브클래스에서 매서드 오버라이딩 되면 
		// A클래스가  AA클래스를 참조를 해서  //오버라이딩 메서드가 우선접근
		
		
		// z.c(); // 컴파일 오류 // a의 타입이라 다운캐스팅이 필요함

		((AA)z).c();   // A클래스 값을 AA를  형변환하여 c값 호출 // 이게 형변함 이게 다운캐스팅          
		
		System.out.println(((AA)z).a); //Azmffotmdptnhs

		AA a1 = (AA) z;  // 형변환을 위에서 하는것보다 이런식으로 하는게 낫다 ,다운캐스팅
		System.out.println(a1.a); 
		a1.c();                  

		z = new BB(); 
		System.out.println(z.a);
		z.b();
		
		//z.d();BB라는 클래스에서 직접적인 건불가능
		
		((BB) z).d();
		System.out.println( ((BB)z).a );
		
		BB b1 = (BB)z; 
		b1.d();
		System.out.println(b1.a);
	}
}