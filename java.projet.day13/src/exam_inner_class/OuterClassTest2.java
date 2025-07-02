package exam_inner_class;
class OuterClass2{
	private int num;// OuterClass2 클래스의 필드
	private InnerClass2 inner;
	
	public OuterClass2(){
		this.num =100;
		inner = new InnerClass2();
	}
	
	public void print() {
		inner.method();
}

class InnerClass2{
private int num = 200; // InnerClass2 클래스의 필드
	
	public void method() {
		int num = 300;//  지역변수
		
		int LocalNum = num ; 
		System.out.println("LocalNum = "+ LocalNum);
		
		int innerNum = this.num;
		System.out.println("innerNum=" + innerNum);
		
		int outerNum = OuterClass2.this.num;
		System.out.println("outerNum = " + outerNum);

	}
}
public class OuterClassTest2 {
	public static void main(String[] args) {
		
	
		OuterClass2 out = new OuterClass2();
		out.print();
	}
	
}
}
