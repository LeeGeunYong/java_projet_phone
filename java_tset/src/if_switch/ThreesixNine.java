package if_switch;

import java.util.Scanner;

public class ThreesixNine {
	public static void main(String[] args) {
		int num , num1=0, num2=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		num = sc.nextInt();
		sc.close();
		
		while (num <= 99) {
			
			num1 = num/10; // 10의자리가 뭔지
			
			num2 = num%10;//1의자리의  뭔지 
			
			
			switch (num1) { // 
				case 3: case 6: case 9: 
				System.out.println("짝");
				break;				
			}
			switch (num2) {
				case 3: case 6: case 9: 
				System.out.println("짝");
				break;
			}
			
		}
	}

}
