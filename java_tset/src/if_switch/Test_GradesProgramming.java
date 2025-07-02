package if_switch;

import java.util.Scanner;

public class Test_GradesProgramming {
	public static void main(String[] args) {
		int minTest , finTest , report,att  ;
		double score =0;
		char grade ;
		String ass = "";
		// 학점 평가
		//중간 기말 레포트 출석 성적
		
//		(중간고사+기말고사)/2 -> 60% 반영
//		=> ((중간+기말고사)/2)*0.6 = 60/100 =? 6/10 -? 0.6
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간고사 점수를 입력해주세요");
		minTest = sc.nextInt();
		
		System.out.println("기말고사 점수를 입력해주세욧");
		finTest = sc.nextInt();
		
		System.out.println("레포트  점수를 입력해주세욧");
		report = sc.nextInt();
		
		System.out.println("출석  점수를 입력해주세욧");
		att = sc.nextInt();
		
		sc.close();
		
		score =
		(double)((minTest+finTest)/2)*0.6 //그값에 60프로만 반영 // 나누기를 했기 했떄문에  실수로 변경
		+(report)*0.2 //갑에 20프로만 반영
		+(att)*0.2 ;//갑에 20프로만 반영
		  
	//이모든 값에 소수점 2자리 이하를 출력해라
		
		
		if (score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60) {
			grade = 'D';			
		}else  {
			grade = 'f';
		}
		
		//4평가기준
		switch (grade) {
		case 'A': case 'B':
			ass = "excellent"; 
			break;
		 
		case 'C': case 'd':
			ass = "good";
			break;
			
		case 'F': 
			ass = "poor";
			break;			
		}
		System.out.println("중간고사 =" + minTest );
		System.out.println("기말고사 =" + finTest );
		System.out.println("레포트 =" + report );
		System.out.println("출석점수 =" + att );
		
		System.out.println();
		
		System.out.printf("score = %.2f\n" , score);
		System.out.println("학점" + grade);
		System.out.println("평가" + ass);
	}

}
