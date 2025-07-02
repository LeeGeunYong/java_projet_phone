package if_;

import java.util.Scanner;

public class ifififif {//스캐너 
	 public static void main(String[] args) {
	//숫자 짝/홀수 판별 (if문 사용)
		 Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("t숫자를 입려가세요 종료는 0");
			int num = sc.nextInt();
			sc.close();
			
			
			if(num ==0) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(num %2 ==0) {
				System.out.println("입력한 짝수입니다");
				
			}
			else 
				System.out.println("홀수 입력해주세요");
				
		
		}	System.out.println();
			
	 }
		
}
