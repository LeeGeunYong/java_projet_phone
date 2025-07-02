package if_;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		//국어, 영어, 수학 점수를 입력받아, 총점과 평균(소수 첫번째 자리)을 구해 출력하는 프로그램을 작성하시오.
		Scanner sc =new Scanner(System.in);
		int sum =0;
		double average = 0;
		
		System.out.println("국어를 입력해 주세요");
		int kor = sc.nextInt();
		System.out.println("영어를 입력해 주세요");
		int eng = sc.nextInt();
		System.out.println("수학를 입력해 주세요");
		int math = sc.nextInt();
		
		sum = kor + eng + math;
		
		average = (double)sum/3;
		
		System.out.printf("총점은=%d , 평균은=%.1f " , sum , average );
		sc.close();
	}

}
