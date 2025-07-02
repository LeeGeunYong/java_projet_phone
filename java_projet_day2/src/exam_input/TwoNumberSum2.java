package exam_input;

import java.util.Scanner;

//출력문 예시 
//홍길동님 안녕하세요 50살이네요
public class TwoNumberSum2 {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	String name, address;
	int age;
	
	
	System.out.println("이름을 입력하시오 : ");
	name = input.nextLine();
	
	System.out.println("나이를 적으시오 : ");
	age = input.nextInt();
	input.nextLine();
	
	System.out.println("사는곳을 적으시오 : ");
	address = input.nextLine();
	
	System.out.print("안녕하세요" + name +"님");
	System.out.println(age + "살이네요");
	System.out.println("주소는" + address + "입니다." );
	
	input.close();
	
	
		
	
		
	}

}
