package exam_test;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] arge){
//국어 영어 수학 점수를 입력받아, 총점과 평균(소수 첫번째 자리)를 구하시오	
		Scanner input = new Scanner(System.in);//객체생성코드
		
		
		System.out.print("수학점수는?");
		int math = input.nextInt();
		
		System.out.print("영어점수는?");
		int english = input.nextInt();
		
		System.out.print("국어점수는?");
		int korean = input.nextInt();
		
	    int	total = math + english + korean;
		double average = ( total  /4.0);
		
		System.out.println("총점은 " + total);
		System.out.printf("평균은" + "average  %.1f", average);
		
		input.close();
		
		
		
		
	
		
		
		
		
		
	
		
	}
}
