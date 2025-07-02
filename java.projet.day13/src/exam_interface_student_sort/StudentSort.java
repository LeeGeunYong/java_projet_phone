package exam_interface_student_sort;

import java.util.Arrays;

class Student{
	private String name; // 이름
	private int total ;// 총점 국어 영어 수학 점수의 총점=300점 가정)
	
	public Student(String name , int total) {
		this.name = name;
		this.total = total;
		
		
	}
	public String getName() {
		return name;
	}
	
	public int getTotal() {
		return total;
	}
	@Override
	public String toString() {
		return "이름=" + name + " 총점=" + total;
	}

}
	
	
public class StudentSort {
	public static void main(String[] args) {
		//[/연습]
		//5개의 숫자를 오름 차순으로 정렬하는 코드를 작성해주세요
		int [] number = {60,88,10,45,90}; // "정수형(int) 배열 number를 선언하고  60, 88, 10, 45, 90의 값으로 초기화한다."
		Arrays.sort(number);
		
		for(int num : number) {
			System.out.println(num+ " ");
		}
		System.out.println("\n");
	
	//3명의 학생 총점으로 오름차순으로 정렬 하여 출력하는 코드를 작성
	Student[] student = new Student[3];
	student[0]	= new Student("홍길동 " , 270);
	student[1]	= new Student("이한솔 " , 2900);
	student[2]	= new Student("김희진 " , 2100);
	
	}

}