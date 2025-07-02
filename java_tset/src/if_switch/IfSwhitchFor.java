package if_switch;

import java.util.Scanner;

public class IfSwhitchFor {
	public static void main(String[] args) {
	//두수를 입력받아 홀수의 짝과 짝수의 합을 출력하시오
		//수의 크기가 상관없어야한다
		
		int num1, num2;
		int odd=0,even=0 ,total=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자입력");
		num1 = sc.nextInt();
		
		System.out.println("두번째 숫자 입력");
		num2 = sc.nextInt();
		
		for (int i= num1 ; i <  num2; i++) {
			
			if(i %2==0) {
				even+= i;    
			}else {
				odd+=i;
			}
				
		}System.out.println(even +" "+odd);
			
			
		
		
			
		
 }
}
