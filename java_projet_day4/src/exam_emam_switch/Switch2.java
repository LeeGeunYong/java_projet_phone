package exam_emam_switch;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원등급 ");
		String member = input.next();
		
		String member1 = " ";
		
		input.close();
		
		
		switch (member) {
			case "관리자":
				member1 = "화원관리 " + "게시글관리 " + "게시글작성 " + "게시글 조회 " + "댓글작성";		
				
			case "회원":
				System.out.println("게시글 작성" + "계시글조회" + "댓글작성");
				break;
			case "비회원":
				System.out.println("게시글 조회");
				break;
		
			default:
				
				
				
				
				
				
		
		}
		
		System.out.println(member + "등급은 " + member1 + "가능합니다");
		
		
		//방법 2 카페에있음 확인하고 다시적기
		
		
		
		
		
	}
}
