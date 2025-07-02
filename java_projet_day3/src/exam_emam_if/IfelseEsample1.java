package exam_emam_if;

import java.util.Scanner;

public class IfelseEsample1 {
	public static void main(String[] args) {
		//[예제1]  점수를 입력받아 80 기준으로 합격 불합격으로 표현한시오
		 //[예제2] 사용자로 하여금 하나의 숫자를 입력받아 짝수와 홀수 출력하기
		
		
		//[예제1]
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score =sc.nextInt();
		String gerd = "";
		if(score > 80) {
			gerd = "합격";
		}else {
			gerd = "불합격";
		}
		
		System.out.println("합격했나요?" + gerd +"입니다 ");
	
		
		
		 //[예제2] 사용자로 하여금 하나의 숫자를 입력받아 짝수와 홀수 출력하기
		
		
		
		System.out.println("숫자를 입력해주세요");
		int viwe = sc.nextInt();
		
		
		String str = "";
		
		if(viwe%2 == 0) {
			str = "짝수입니다";
		}else {
			str = "홀수입니다";
		}
		
		sc.close();
		
		System.out.println("찍수입니까 , 홀수입니까?" + str);
		
		
		
		
	}
	
	

}
