package if_;

import java.util.Scanner;

public class ififfor {
	
	//0 ~ 100 사이의 점수를 입력받아 다음과 같은 등급을 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int num = sc.nextInt();
		
		
		if (num >= 90) {
			System.out.println("점수를 입력해주세요");
			char ch ='A';
			System.out.println("90이상: "+ ch + "등급 입니다");
			
		}else if(num >=80) {
			char ch ='B';
			System.out.println("80이상: "+ch + "입니다");

		}else if(num >=70) {
			char ch ='C';
			System.out.println("70이상: "+ch + "입니다");
			
		}else if(num >=60) {
			char ch ='D';
			System.out.println("60이상: "+ ch + "입니다");
			
		}else if(num >=50) {
			char ch ='E';
			System.out.println("50이상: "+ ch + "입니다");
		}else 
			System.out.println("그외 F 등급입니다");
		sc.close();
	}
	

}
