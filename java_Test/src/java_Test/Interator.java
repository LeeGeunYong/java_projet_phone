package java_Test;

import java.util.Scanner;

public class Interator {
	public static void main(String[] args) {
		
		
		
		
		

		
		

		Scanner sc = new Scanner(System.in);
		
		while (true ) {
			System.out.println("2~9 사이 정수 입력");
			int input = sc.nextInt(); // 정수값을 받아야  
			
			if(input >=2  &&  input <=9) {
				for(int num = 1; num <=9; num++) {
					System.out.printf("%d * %d = %d\n" ,input , num ,input*num);
					
				}
			}else {
				System.out.println("정수를 다시 입력해주세요");
				
			}	
				break;
			
		}
	}

}
