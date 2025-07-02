package arry;

import java.util.Scanner;
public class ArrayInArray_student {
	public static void main(String[] args) {
		//사용자로부터 3명 학생의 국어, 영어, 수학 성적을 입력받아
		//학생별 합계와 평균을 구하는 프로그램을 배열을 이용하여 작성

		// [출력예시]
		//학생명	국어	영어	수학	합계	평균
		//  1번	80	90	100	270	90
		// 2번	45	84	66	195	65
		// 3번	75	100	91	266	88.6
		
		
		int total=0;
		double  aver=0;
		String[] subjet = {"국어", "영어", "수학","총점","평균"};
		Scanner input = new Scanner (System.in);
		
		int [][] score = new int[3][3];
		
		for (int i =0; i <3; i++) {
			for(int j=0; j<3;j++) {
				System.out.println(i+1+"번 학생의 "+subjet[j] + "점수를 입력해주세요");	
				int op = input.nextInt();
				
				
		
			}
			
		}
		 
		
		
		
		
	}
	
	
}
