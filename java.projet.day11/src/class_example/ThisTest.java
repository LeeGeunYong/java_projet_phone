package class_example;

public class ThisTest {
	private int i ; // 필드이지만 생성자가 가리키는 또는 인스턴스 변수 )
	public ThisTest (int i) {
		this.i = i;
	}
	
	public void first() {
		int i = 2;
		int j = 3;
		this.i = i + j;
		second (4);
		System.out.println(i);
		System.out.println(this.i);
		
				
				
	}
	public void second(int i) {
		int j = 5;
		this.i = i + j;  // this.i  는 외부에 생성자 참조변수인 obj 를 가리킨다 서로 스택영역에서 힙영역에 있는 i위치를 가리킨다 
	}
	public static void main(String[] args) {
	    ThisTest obj = new ThisTest(10); // 외부에서  생성자에 값을 넣으면  내부에서도 생성자 메서드를 만들어야함
	    								//리턴값은 없고 제어관리자 메서드명(클래스명)같지만 다른거 (매개변수)
	    obj.first();  // 여기다가 obj.second(); 를 호출하게되면 내부에 cecond 부터 시작되어 메서드를 실행함  
	}
}
