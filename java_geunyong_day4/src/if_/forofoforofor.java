package if_;

import java.util.Scanner;

public class forofoforofor {
	/*
	[요구사항]
	    100부터 999까지의 숫자(3자리수)를 입력 받아
	     각 자리의 수를 합한 합계를 출력하는 프로그램을 작성하시오.

	[예시]
	    입력값: 123
	    출력값: 6
	 */
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("3자리수를 입력해주새요");
			 num = sc.nextInt();
			
			
			if (num == -1 ) {
				System.out.println("조료");
				sc.close();
				break;
			
			}
			if(num >=100 && num <=999) {
				int plus =num /100;
				int plus1 = num /10 %10;
				int plus2 = num %10;
				int total = plus +(plus1 +plus2);
				System.out.println("각자리의수를 합한 합꼐는 =" + total);
			 
			}	else {
				System.out.println("세자리를 다시 입력해");
				
			}
			
		}
		
	}
}
