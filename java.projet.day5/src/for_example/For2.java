package for_example;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {

		//10개의 숫자를 입력 받아 0보다 큰슛저애 대한 평균과 대수ㅠ를 출력하는 코드를 완성하시오
		double  avg;
		int num  ,  total = 0 ;
		int count = 0;
		Scanner sc = new Scanner(System.in);		
		
		for (int i = 0; i<10; i++) {
			
			
			num = sc.nextInt();
			System.out.println("숫자를 입력하세요");
			
			
					
			System.out.println();
			
			if (num >0) {
				total += num;
				count++;;
				
			}
			if (1==9) {
				sc.close();				
			
		}
		if (count != 0) {
			avg = (double) total / count;
			
		}

		
	}
	

}
