package exam_test;


import java.util.Scanner;

//x개의 사탕을 y명의 학생들에게 똑같이 나누어 주려고할때,
	//각 학생들이 받을 수 있는 사탕의 수와 남는 사탕의 수를 계산해 줄력하시오

public class Exmple2 {
	
		public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("사탕갯수");
			int candy = input.nextInt();
			
			System.out.println("학생수");
			int student = input.nextInt();
			
			int divide = candy / student;
			int result = candy % student;
			
		
			
			System.out.printf("각학생들이 받은 사탕수" + divide + "\n남은사탕수"+ result );
			
			
		input.close();	
			
			
		
			
	
		}
	

}
