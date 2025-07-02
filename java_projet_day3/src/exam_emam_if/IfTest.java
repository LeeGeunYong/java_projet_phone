package exam_emam_if;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		int  num1,num2,temp;
		
		Scanner input = new Scanner(System.in);
		System.out.println("두수를 입력해주세여");
		
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			
			System.out.println(num1 +""+ num2);
			
			
		}
		input.close();
	}
	
	
	

}
