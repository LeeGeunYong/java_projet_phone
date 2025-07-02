package exam_emam_if;

import java.util.Scanner;

public class IfelseEsample {
	public static void main(String[] args) {
		
		System.out.println("[예제]");
		int score = 90;
		String result;
		
		if (score >=60) {
			result = "합격";
		
		}else {
			result = "불합격";
		}
		System.out.println(result);
		
		
		
		
		
		System.out.println("[예제2]");
		// 사용자로 하여금 하나의 숫자를 입력받아 짝수와 홀수를 출력해줘
		
		int su = 0;
		String data = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("짝수와 홀수를 구할 수를 입력해주세요");
		su = input.nextInt();
		
		System.out.println("su의 초기값 : " + su);
		
		if (su%2 == 0) {
			data = "짝수";
			
		}else {
			data ="홀수";
		}
		
		//System.out.println("입력한 " + su + "는" + data + "입니다.");
		
		System.out.printf("입력한 %d는%s 입니다." , su , data);
		
		input.close();
		
			
				
	}

}
