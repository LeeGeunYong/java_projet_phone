package MethodOverridingExample;

class Shape{
	public void draw() {
		System.out.println("shape");
	}
}

class  Line extends Shape{//수퍼클래스 생성
	

	public void draw() {//메소드 오버라이딩
		System.out.println("Line");
	}


}


class Rect  extends Shape{

	@Override
	public void draw() {//메소드 오버라이딩 
		
		System.out.println("Rect");
	}
}
class Circle extends Shape {
		@Override
		public void draw() { // 메소드 오버라이딩
			System.out.println("Circle");
		}

}
public class MethodOverridingExample {

	public static void paint(Shape p) { 
		p.draw(); // p가 가리키는 객체 내에 오버라이딘한 draw() 호출 , 동적 바인딩
	
	}
	

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);  // = paint(new Line());
		
		
		paint(new Shape()); //Line 의 draw()실, "Line" 출력
		paint(new Line()); 
		paint(new Rect()); 
		paint(new Circle()); 
	}
}


