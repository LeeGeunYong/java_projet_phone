package mutator_accessor;

import java.util.Scanner;

public class Score {
	
	
	
	/* 성적을 출력하는 Score 클래스를 정의하자.
	 * 이름 / 국어 / 영어 / 수학 / 총점을 저장하고자 한다.(필드 구현)
	 * 
	 * 필드에 값을 설정할 수 있는 기능
	 * 점수들의 합을 구하는 기능
	 * 평균을 구하는 기능, 학점을 구하는 기능
	 * 모든 필드를 출력할 수 있는 기능을 포함하도록 한다.(메서드 구현)
	*/

	// 필드 선언
	//접근제어자(제한자) 자료형 변수;   ==>필드선언
	private String name; //이름
	private int kor;
	private int eng;
	private int mat;
	private int totalScore;

	//                             매개변수
	//접근제어자(제한자) 리턴타입 메서드명(자료형 변수명, 자료형 변수명) ==>메서드선언
	//               void
	//               자료형(기초형/참조형)
	// {
	
	
	// } ==>메서드정의
	
	// 필드에 값을 대입하기 위한 메서드
	public void scoreData(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// 합을 구하는 메서드
	public void getTotal(){
		totalScore = kor + eng + mat;
	}
	// 평균을 구하는 메서드
	public double getAverage() {
		return (double)totalScore/3;
	}
	//학점 구하는 메서드
	char hakjum ='\0';
	public char getGrade() {
		if( > 0) {
			
		}
	}
	
	
		
}
