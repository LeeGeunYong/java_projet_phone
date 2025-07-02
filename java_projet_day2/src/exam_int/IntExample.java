package exam_int;

import java.util.Scanner;

public class IntExample {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			int num1,  num2, num3;

			System.out.print("첫번째 숫자를 적어봐");
			num1 = input.nextInt();
			
			System.out.print("두번쟤 숫자를 적어봐");
			num2 = input.nextInt();
			
			num3 = num1;
			
			num1 = num2;
			
			num2 = num3;
			
			
			System.out.println("num1 :" + num1 + " num2 :"+  num2);
			
			
			
			
			int a = 3;
			int b = 5;
			
			System.out.print("첫번째 숫자를 적어봐");
			a = input.nextInt();
			
			System.out.print("두번쟤 숫자를 적어봐");
			b = input.nextInt();
			
			
			
			
			
			a++;
			b--;
			
			System.out.println(a + " "+b);
			
			input.close();
			
		}
		
}

