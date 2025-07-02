package if_;

import java.util.Scanner;

public class fifififi {
	/*
	 * 선택값에 따라 다음 문장을 출력:
	 * 
	 * 1 → "새 문서를 만듭니다."
	 * 
	 * 2 → "저장했습니다."
	 * 
	 * 3 → "프로그램을 종료합니다."
	 * 
	 * 그 외 → "올바른 번호를 선택하세요."
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택에따라 다음문장을 출력 :");
		
		int num = sc.nextInt();
		switch(num) {
		case 1: System.out.println("새문서를 만듭니다");
			break;
		case 2: System.out.println("저장했습니다");
			break;
		case 3:	System.out.println("프로그램을 종료합니다");
			break;
		case 4:	System.out.println("그외 ->올바른버호를 입력하세요");
		
			
		}sc.close();
	}

}
