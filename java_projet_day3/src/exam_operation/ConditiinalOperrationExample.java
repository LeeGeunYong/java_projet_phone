package exam_operation;

import java.util.Scanner;


public class ConditiinalOperrationExample {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		//(조건식) ? 조건식이 참인 경우 실행할 식: 조건이 거짓일경우 실행할 식 ;
		System.out.println("두 수의 (100과 200 )중에서 최대값 :" + ((x > y) ? x : y));
		
		System.out.println("두 수의(100과 200) 중에서 최대값 :" + Math.max(x , y));
		
		
		
		
		
		
		
		
		
		
		
		
		///임의 의 수(키보드로 ㅇ입력받은 값)를 가진 변수를 선언하고 그 값이 짝수인지 홀수인지를 출력합니다
		///예를들어 "4는 짝수입니다."
		
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("입력받은값을 정하시오");
		number = input.nextInt();
		
		if(number %2 == 0) {
			System.out.print(number + "는짝수입니다");
		} else {
			System.out.println(number + "는홀수입니다,");
			
		
		}
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//두수의 차를 출력해주세요
		int num1, num2;
		
		System.out.print("두수를 공백단위로 구현하여 입력해주세요");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		int result = ((num1 > num2) ? num1 - num2 : num2 - num1);
		
		System.out.println("두수의 차 = " + result);
		
		input.close();
		
				
		
		
		
	} 
	
	
}	
	

	
	


	


//카페에올려놓음 삼항 연산자
	

