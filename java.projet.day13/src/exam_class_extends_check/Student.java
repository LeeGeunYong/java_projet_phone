package exam_class_extends_check;

public class Student extends Person {
	private String major;
	
	public Student(){
		super();
		System.out.println("Student 생성자 호출");
		
	}
	public Student(String name , int age , String major) {
		super(name , age);
		this.major = major;
		System.out.println("student(name , age , mojor)생성자 호출");
		
		
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
		return super.toString() + ":" + major;
	}
	

}
