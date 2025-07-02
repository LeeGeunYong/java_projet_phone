package java.projet.day13;

class ParentClass{
	protected int data;
	
	//protected 접근 제어자는 같은 패키지에 존재 하면 직접 접근 가능 
	//다른패키지에서는 상속
	

	
	public ParentClass () {
		data=100;
	
	}
	
	public void print( ) { // 프린트형 메서드 
		System.out.println("수퍼 클래스의 print()메소드"); 
		
	}
	

}
		//하위
class ChildClass extends ParentClass  {
	protected int data;
	
	public ChildClass() {
		data=200;
	}
//	@coreeid
	public void print() {//메소드 재정의
		int data =300;// 지역변수
		super.print();
		 System.out.println("서브 클래스의 print() 메소드 ");
	        System.out.println("data : " + data);
	        System.out.println("this.data : " + this.data);
	        System.out.println("super.data : " + super.data);
	 }
}

	public class ChildClassTest {
	
		public static void main(String[] args) {
           ChildClass obj = new ChildClass();
           obj.print();     
  }
}