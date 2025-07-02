package exam_test;
import java.util.Scanner;

/*
달걀 456개를 12개씩 담을수있는 상자의 수를 삼항 연산자를 이용하여 결과와 같이 출력하도록
프로그램을 작성하시오(그리고 달걀수를 입력받아 처리하도록 수정해주시면 됩니다.)
*/
public class Example21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int box =12;
		int agg =456;
		System.out.println("달걀수");
		agg =input.nextInt();
		
		System.out.println("담을수있는 박스");
		box =input.nextInt();
		
		int boxCount = (agg % box ==0 ) ? (agg / box) :(agg / box +1);
		
		
		
		
		
		System.out.print("담을수 있는 상자수" + boxCount);
		
		input.close();	
				
		
	}
	

}
