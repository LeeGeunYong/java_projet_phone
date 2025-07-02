package if_;

import java.util.Scanner;

public class dldldldldl {
	public static void main(String[] args) {
//달걀 456개를 12개씩 담을 수 있는 상자의 수를 삼항 연산자를 이용하여 
//실행결과와 같이 출력하도록 프로그램을 작성하시오.
//(그리고 달걀 수를 입력받아 처리하도록 수정해 주시면 됩니다)
// * 달걀 456개를 12개씩 담을 수 있는 상자의 수는  00개입니다.		
		int box =0;
		Scanner sc =new Scanner(System.in);
		System.out.println("달걀수를 입력해주세요");
		int agg = sc.nextInt();
		
		box = (agg==456) ? (agg/12) : 0;
		System.out.println("달걀" +agg+ "개를 담을수있는 상자 수 는" + box );
		sc.close();
	}

	
	
	
}
