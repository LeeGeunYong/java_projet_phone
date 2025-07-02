package exam_emam_if;

import java.util.Scanner;

public class IfTest4 {
	public static void main(String[] args) {
		
		//3개의 정수를 입력 받아서 최대값을 출력하도로 ㄱ프로그램 작성해주세요
		
		int num1, num2, num3;
		int maximumvalue;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력해 주세요");
		num1 = input.nextInt();
		
		System.out.println("두번째 정수를 입력해 주세요");
		num2 = input.nextInt();
		
		System.out.println("세번째 정수를 입력해 주세요");
		num3 = input.nextInt();
		
		input.close();
		//방법 1
		
		if (num1 > num2) {
		    maximumvalue = num1;
		}else {
			maximumvalue = num2;
		}
	
		if (num3 > maximumvalue);{
			maximumvalue = num3;
		}	
		//방법2
			
	    maximumvalue = num1; // 숫자가 크다는 전제
		if	(num2 > maximumvalue){
		     maximumvalue = num2;
		}           
		     
		if (num3 > maximumvalue) {    
			maximumvalue = num3;
		}	
		
		System.out.println(maximumvalue);
		
		
		
		
		
		
	}
}
