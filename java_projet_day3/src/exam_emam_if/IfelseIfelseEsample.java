package exam_emam_if;

import java.util.Scanner;

public class IfelseIfelseEsample {
// 1. 사용자로 하여금 점수 (score) 입력받아 학점(grade)를 촐력하는 프로그램
//90~100 A
//80~ 89 B
//70~79 C
//60~69 D
//59이하 f
	
	
	
	public static void main(String[] args) {
		
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("점수를 입력해주세요");
	
		score = sc.nextInt();
		char gred ;
		
		if(score >= 90){
			gred = 'A';
		}else if(score >= 80) {
			gred = 'b';
		}else if(score >= 70) {
			gred = 'c';
		}else if(score >= 60) {
			gred = 'd';
		}else  {
			gred = 'f';
			System.out.println("점수는 0과 100 사이로 입력해주셔야합니다");
			
		}
		System.out.println("학점은 " + gred + "입니다");
	}
}
