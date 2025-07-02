package exam_test;

public class Student extends Person {
	private int studentNumber;
	
	public Student () {}
	public Student (String name , int age , int studentNumber) {
		
		super(name , age);
		this.studentNumber = studentNumber;
	}
	

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("학번 : " + studentNumber );
	}
}

