package exam_test;

public class ForeignStudent extends Student{// 유학생
	private String nationality;
	
	public ForeignStudent() {
		
	}
	public ForeignStudent(String name , int age , int studentNumber , String nationality) {
		super(name , age ,studentNumber );
		this.nationality = nationality;
	}
	

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		
		this.nationality = nationality;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("국적은: " + nationality);
		
	}
	
	
}
