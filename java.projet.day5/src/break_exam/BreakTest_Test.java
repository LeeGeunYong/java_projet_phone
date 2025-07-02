package break_exam;

import java.util.Scanner;

public class BreakTest_Test {
	
	public static void main(String[] args) {
		
//		사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성
//		단 종료는 0~에서 100 사이가 아닌 값 입력하면
//		
// 		처음에는 문제를 읽고 변수가 몇개 가 필요할것인지 예상할것
		//문제에 맞게 변수를 선언 
		int total=0  , num, count = 0; 
		
		double aver;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("숫자를 입력해주세요");
			num = sc.nextInt();
			
			
			if (num < 0 || num>100) {
				
				break;
				
			}total += num; 
			count++;
			
		}
		aver = (double)total/count;
		System.out.println("합계" + total);
		System.out.println("카운트" + count);
		System.out.printf("평균값 = %.2f" , aver);
		
		sc.close();
		
	}	
	
	
	

}
