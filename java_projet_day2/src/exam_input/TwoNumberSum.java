package exam_input;

import java.util.Scanner;

public class TwoNumberSum {
	//메인메소드부터  실행이 된다 .
	public static void main (String[] args) {
		//추후설명 
		//클래스 참조 변수 = 메모리할당 연산자 생선자(초기값);
				Scanner input = new Scanner(System.in);
				int num1; //숫자를 젖아
				int num2;//두번째 숫자 저장
				int num3;// 합을 저장
				
				System.out.print("첫번째 숫자를 입력하시오: "); //입력안내출력
				num1 = input.nextInt(); // 시용자로부터 첫번째 숫자를 읽는다.
				
				System.out.print("두번째 숫자를 입력하시오: ");
				num2 = input.nextInt();
				
				num3 = num1 + num2;
				System.out.println("두 수의 합 : " + num3); 
				input.close();
				
	
	}

}
