package if_switch;

import java.util.Scanner;

public class OperationExample {
	public static void main(String[] args) {
		double  result=0;
		int num1 , num2;
		char ch ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째숫자 를 입력하세요");
		num1 = sc.nextInt();
		
		System.out.println("두번째숫자 를 입력하세요");
		num2 = sc.nextInt();
		System.out.println("한문자를 입력하세요");
		ch = sc.next().charAt(0);
		
		sc.close();
		
		if (ch == '*') {
			 result = num1*num2;
			
		}else if (ch == '+') {
			result =num1+num2;
		}else if (ch == '-') {
			result =num1-num2;
		}else if (ch == '/') {
			
			if (num2 == 0) {
				System.out.println("0이면 나눌수 없습니다.");
				return;
			}result =(double) num1/num2;
		}System.out.printf("결과값 =%.3f " , result );
		
		
		
	}

}
