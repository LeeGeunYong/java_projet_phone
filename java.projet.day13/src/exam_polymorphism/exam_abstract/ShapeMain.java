package exam_polymorphism.exam_abstract;


import java.util.Scanner;

abstract class Shape{
	protected  int x , y;
	
	public abstract double getArea(); // 넓이를 구하는 추상 메서드선언
	
	
}

class Circle extends Shape{
	private int redius;
	
	
	public Circle () {
		
	}
	public Circle(int redius) {
		this.redius = redius;
		
	}
	@Override
	public double getArea() {
		return redius * redius * 3.14;
	}
	

}

class Rectangle  extends Shape{
	private int width, height;
	
	public Rectangle() {}//윗쓰 // 하잇
	public Rectangle(int width ,int height) { // 너비 폭  , 케 세로길이
		this.width = width;
		this.height= height;
		
	}
	@Override
	public double getArea() {
	
		return (double) (width * height);
	}
	
	
}

public class ShapeMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
	
	Shape s = null; // 부모클래스의 참조변수 선언
	while (true) {
		System.out.print("\n***Shape Select***\n1. 원\n2. 사각형\n3. 종  료\n선택(1-3) : ");
		int no = scan.nextInt();
		switch (no) {
		case 1:
			s = new Circle(5); // 업캐스팅
			break;
		case 2:
			s = new Rectangle(4, 5); // 업캐스팅
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			System.exit(1);
		}
		if (s instanceof Circle) {
			System.out.printf("원의 넓이 : %.2f\n", s.getArea());
		} else {
			System.out.printf("사각형의 넓이 : %.0f\n", s.getArea());
		}
		
		}
	}
}