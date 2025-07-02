package exam_test;

import java.util.Scanner;

public class Example4 {
	
	//100부터999숫자 (3자리수) 를 입력 받아 각 자리의 수를 합한 합계를 출력하는 프로그램을 작서하시오 
	public static void main(String[] arge) {
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("100부터 999 중 아무거나 적어");
		int number1 = input.nextInt();
		
		System.out.println("100부터 999 중 아무거나 적어");
		int number2 = input.nextInt();
		
		System.out.println("100부터 999 중 아무거나 적어");
		int number3 = input.nextInt();
	
		
		int total = number1 + number2 + number3;
		
		System.out.println("세자리수 합계 = " + total);
		
		
//1-----------------------------------------------------------------------		
	
		
		
		//3자리 숫자를 입력받아 각 자리의 수를 합한 합계를 출력
	      //ex) 입력값 123 > 1+2+3 이기때문에 출력값 : 6인 코드 만들기
	      int sum=0;
	      
	      System.out.print("100에서 999사이의 숫자를 입력해 주세요 : ");
	      String num=input.nextLine();
	      
	      for(int i=0; i<num.length();i++) {
	   
	      sum+= num.charAt(i)-'0' ;

	      /*num.charAt()로 출력되는 값은 숫자가 아닌 문자이기 때문에 숫자로 바꿔줘야함.
	      * 그래서 불러온 값에서 문자 0을 빼주면 숫자값으로 변환이 된다고 생각하면 된다!
	      * 123을 입력했을때 num.charAt(0)을 출력하면 결과값은 '1' (문자열)이며 이것을 숫자로 바꾸려면
	      * 문자열 1의 아스키코드는 49 , 문자열 0의 아스키코드는 48이기 때문에
	      * '1-'0'을 해주면 된다! ==> 해석하면 49-48 = 1
	      */

	      }
	      System.out.println("각 자리의 수 합계: "+sum);   
	      
	      input.close();
		
		
		
		
		
		
		
		
		
		
   		
		
		
	}
	
		
		
				
	
	
}
