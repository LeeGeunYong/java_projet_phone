package exam_emam_switch;

import java.util.Scanner;

public class Switch6 {
	public static void main(String[] args) {
		int score = 0;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("점수는 0 ~ 100 사이로 입력해주세요");
		score = input.nextInt();
		
		while(score<0 || score>100) {
			System.out.println("점수는 0~100 사이로 입력해주세요");
			score = input.nextInt();
			
			
			
		}
		
		char grade;
		System.out.printf("wjatn = %d " , score);
		switch(score / 10) {//조건식에는 비교새상 (변수,연산식)..89/10 =>8.9
		case 10:  case9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
		default:
			grade = 'F';
		}	
		
		System.out.printf("헉점 = %c" ,  grade);

		input.close();
	}

}
