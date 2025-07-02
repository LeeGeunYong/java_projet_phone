package if_;

import java.util.Scanner;

public class IF_Example {
	public static void main(String[] args) {
	/*놀이공원에 미취학아동(8세미만)1000, 초등학생(14세미만)2000,
	 * 중고등학생(20세미만)2500, 성인(20세이상)3000
	 *놀이공원입장료 계산프로그램을 나타내시오*/
		int age ;
		int money;
		
		System.out.println("나이를 입력하세요");
		Scanner input = new Scanner(System.in);
		age = input.nextInt();
		
		
		
		if(age < 8) {
			money =1000;
			System.out.println("아동 8세미만 입니다");
		}else if (age < 14) {
			money=2000;
			System.out.println("초등학생 14세미만 입니다");
		}else if (age < 20) {	
			money=3000;
			System.out.println("중.고등학생 20세만 입니다");
		}else  {
			money=3500;
			System.out.println("일반인 20세이상 입니다.");
		}
		
		System.out.println("입장료는 " + money + "입니다");

 
		input.close();				
	 
		
		
	}
}
