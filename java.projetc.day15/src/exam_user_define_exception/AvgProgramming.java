package exam_user_define_exception;

import java.util.Scanner;


	
/* 사용자로부터 국어, 영어, 수학 점수를 입력 받아서 평균을 계산하는 프로그램을 작성하여 보자.(AvgProgramming)
 * 만약 사용자가 음수를 입력하면 NegativeNumberException(사용자 정의 예외 클래스)
*  사용자 정의 예외 객체를 생성한다.
 * 이 예외를 catch 블록으로 잡아서 처리하는 코드도 추가해야 합니다.
 * 또한 sum() 이라는 점수의 합을 반환 받도록 메서드를 정의하여 봅시다.
*/
/*
	[실행 예시]
	국어 입력 : 90
	영어 입력 : 81
	수학 입력 : 79
	평균은 83.33입니다.
	 
	국어 입력 : 97
	영어 입력 : -59
	음수는 입력할 수 없습니다.
*/

//class NegativeNumberException extends Exception{
//	private Scanner sc;
//	private int sum ;
//	private double aver;
//	
//	//사용자 정의 예외 클래스 생성 
//	public int getSum() {
//		return sum;
//	}
//	public void setSum(int sum) {
//		this.sum = sum;
//	}
//	public double getAver() {
//		return aver;
//	}
//	public void setAver(double aver) {
//		this.aver = aver;
//	}
//	
//	
//	
//	
//}
//
//
//
//public class AvgProgramming {
//	//* 사용자로부터 국어, 영어, 수학 점수를 입력 받아서 평균을 계산하는 프로그램을 작성하여 보자.(AvgProgramming)
//	
//	
//	
//	
//	static Scanner sc =  new Scanner(System.in);
//	
//
//	
//	//실행클래스 생성 
//	public static void main(String[] args) {
//		
//		
//		System.out.println("국어 점수 :");
//		int kor = sc.nextInt();
//		System.out.println("영어 점수 :");
//		int ent = sc.nextInt();
//		System.out.println("수학 점수 :");
//		int math = sc.nextInt();
//		sc.nextLine();
//		
//		
//	}
//	
//			
//	
//
//}

import java.util.Scanner;

//사용자 정의 예외 클래스
@SuppressWarnings("serial")  //  그 경고를 무시해도 되도록 컴파일러에게 말하는 것이야.
class NegativeNumberException extends Exception{
	public NegativeNumberException(){
		super("음수는 입력할 수 없습니다.");
	}
}

public class AvgProgramming {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] arg){
		int tot = 0;
		try{
			tot = sum();
			System.out.printf("평균은 %.2f입니다.", tot/3.0);
		}catch(NegativeNumberException e){
			System.out.println(e.getMessage());
		}catch(Exception et) {
			System.out.println("예외 발생.");
		}
	}

	public static int sum() throws NegativeNumberException{
		int score, tot = 0;
		String[] subject={"국어", "영어","수학"};

		for(int i = 0; i < subject.length; i++){
			System.out.print(subject[i]+" 입력 : ");
			score = scan.nextInt();
			if(score < 0) //예외상황
				throw new NegativeNumberException(); // 예외객체생성
			tot += score;
		} 
		return tot;
	}
}
