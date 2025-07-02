package for_example;

import java.util.Scanner;

public class For_Eaxmpl3 {
	public static void main(String[] args) {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출료가세요
		//제일먼저 문제를 보고 뭐가 필요하고 뭐를 먼저 확인해야하는지 적기 
		//
		
		int num, total = 0;      //  문제를보고 변수를 몇개 설정할지 정한다
		Scanner sc = new Scanner(System.in);// 
		
		System.out.println("정수를 입력해줴요");
		num = sc.nextInt();
		
		for (int i = 1; i <= num ; i++) {
			total +=i;
			if(i<num) {
				System.out.println(i + " ");
				
			}else {
				System.out.println(i + " ");
			}
				
		}	
		System.out.println("합계" + total);
	}

}
