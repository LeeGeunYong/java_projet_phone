package arry;

import java.util.Scanner;

public class ScoreArray {
	public static void main(String[] args) {
		String cou [] = {"Java" ,"c++","HTNK5 ","컴퓬터구조","데이터벵스"};
		int score[] = {95,88,76,62,55};
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("[과목정보 - 과목명을 대소문자 정확하게 입력해주세요");
		for(int i=0; i < cou.length; i++) {
			System.out.println(cou[i]);
			if(i<cou.length-1) {
				System.out.println(", ");
			}else {
				System.out.println();
			}
		}
		
		while(true) {
			System.out.println("과목이름>>");;
			String name = sc.next();
			if(name.equals("종료")) {
				break;
			//과목 을 배열을 찾아 점수 출력하는 코드 오나성
			}
			int i;
			for(i=0; i<score.length;i++) {
				if(cou[i].equals(name)) {
					System.out.println(name + "의 점수는 " + score[i]);
				}
			}
			
			if(i==score.length); // 과목이 잘못될경우
				System.out.println("없는 과목 입니다");
		}
		System.out.println("프로그램을 종료합니다");
		sc.close();
				
				
	}
}
