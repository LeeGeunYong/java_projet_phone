package abstract_class;
//추상 클래스

abstract class Shape { //쉐이프 원형 도형
	int x , y; //필드 (= 멤버 변수 , 인스턴스 변수)선언
	
	public void move(int x , int y) {// 메서드(=인스턴스 메서드)선언
		this.x=x;
		this.y=y;
	}
	//추상메서드 (의미 : 메서드의 선언부분만 존재하고 정의부분{} 을 가지고 있지 않은메서드)
	public abstract void draw();
	//접근제어자 제어자 리턴 타입 메서드명(매개변수); 추상메서드 정의 하는방법

}

class Rectangle extends AbstractShapeTest{
	int width , heigth;  // 가로 길이.  세로길이 
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}

class Circle extends AbstractShapeTest{
	int redius;
	
	public void draw() {
		System.out.println("삼각형 그리기 메소드");
	}
	
}

public class AbstractShapeTest{
	public static void main(String[] args) {
		
		Rectangle r= new Rectangle();
		r.draw();
		
		Circle c = new Circle();
		c.draw();
		
		//Shape s = new Shape(); // 추상 클래스는 인스턴스 생성이 불가능하다
		//Shap s; // 추상 클래스 참조변수; 선언가능
		//
	}
}