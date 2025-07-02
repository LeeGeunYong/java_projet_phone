package dowhile_exam;

import java.util.Scanner;

public class dowhile {
	//random 
	public static void main(String[] args) {
		
		
		// 프로그램 은 1부터 10사이의 정수를 저장하고 사용자는 질문을 통히여 그 정수를 알아 맞히려고 노력한다 
		//사용자가 답을 제시 하면 프로그램은 자신이 저장한 정수와 비교하여 제시된 정수가 
		//더높은지 낮은지만을 알려준다.
		// 프로그램은 do ~while  루프로 사용하여 사용자가 정확하게 정수를 알아 맞힐때 까지 반복한다
		// 사용자가 정답을 알아 맞히면 몇 번 만에 알아맞혔는지 화면에 츨력한다 
		int  num1, num2, tmt=0;
		System.out.println("숫자 알아맞혀보세요 1 부터 10까지있어요");
		System.out.println((int) (Math .random()*10) +1);
		
		Scanner random = new Scanner(System.in);
		
		do {
			
			
			
		    num1 = random.nextInt();
			System.out.println("더 높은숫자" + num1);
			
		    num2 = random.nextInt();
			System.out.println("더낮은 숫자" + num2);
			
			tmt++;
			
		}while (num1 > num2 && num1 < num2);			
			
			
		
				
		
	    System.out.println("몇번만에 알아맞혀혔는지 출력" + tmt);
		
		
		
	}

}
