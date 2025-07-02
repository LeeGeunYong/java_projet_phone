package Whil.Example;

import java.util.Scanner;

public class WhilEample {
	//사용자로부터 5개의 정수를 읽어서합과 평군값을 계산하여 출력하는  프로그램을 작성하
//	출력예시
//	1번째 1수 입력 :1
//	2번째 수  입력 :2
//	3번째 수  입력 :3
//	4번째 수  입력 :4
//	5번째 수  입력 :5
//	입력받은수 
//	합께 15 평균 3.0
	
// 3개를 
	// 입력 받을수 하나 
	//총 합을 입력 받을 수 하나
	// 
	
	public static void main(String[] args) {
		int num1 , su=1 , sum=0;
		Scanner sc = new Scanner(System.in);
		
		while (su <=5) {
			System.out.println(su+"번쨰 수 입력:");
			num1 = sc.nextInt();
			
			su++;
		}
		
		
	}
	
	

}
