package arry;

import java.util.Scanner;

public class ArraymMonthExample {
	//사용자 로 하여금 1~12월을 입력 받아 일수를 출석 하도록 코드 작성
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int [] month = {31,28,31,30,31,30,31,31,30,31,30,31};
//		int su = 0;
//		System.out.println("각 월의 마지막 일을 출력 하고자 합니다.(1~12)");
//		do {
//			System.out.println("원하는 월 : ");
//			su = sc.nextInt();
//			
//		}while(su<1 || su>1);
//		
//		System.out.println(su + "월은 " + month[su-1] + "인니다 " );
//		sc.close();
		
		
		
		

		
		int[] responses = {1,2,1,2,3,1,2,2,3,1,3,3,1,1,1,2,3,1,3,2,};
		int dissatisfied =0;
		int neutral =0;
		int satisfied = 0;
		
		for  (int data : responses) {
			switch (data) {
			case 1 -> dissatisfied++;
			case 2 -> neutral++;
			case 3 -> satisfied++;
			
		   }
		}
		String printData = String.format(
			"""
			{	
				불만족(1) :%d
				만족 (2) :%d
				만족 (3) :%d			
			}""", dissatisfied,neutral,satisfied);	
		
		System.out.println(printData);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
