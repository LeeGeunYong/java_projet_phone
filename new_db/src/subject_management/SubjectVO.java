package subject_management;

public class SubjectVO {
	// subjectVO (Value Object)
	// 이클래스는 데이터를 담는 Container
	//역할을  하는  클래스로 계층 간 데이터를 전달을 하기 위해 사용된다 
	// 다시말해 VO (Value Object) 클래스는 데이터를 저장하고 전달하기위해 
	// 사용 하는 객체 이다 필드, 생성자 , Setter 와 getter 로구성된다 
	
	// 값을 전달 하기위 해 만든클래스   로  그동안 클래스 만들떄 하던거 기본적으로 
	
	private int no; 
	private String subjectNumber;
	private String subjectName;
	
	
	
	
	
	public SubjectVO() {}





	public SubjectVO(int no, String subjectNumber, String subjectName) {
		this.no = no;
		this.subjectNumber = subjectNumber;
		this.subjectName = subjectName;
	}





	public int getNo() {
		return no;
	}





	public void setNo(int no) {
		this.no = no;
	}





	public String getSubjectNumber() {
		return subjectNumber;
	}





	public void setSubjectNumber(String subjectNumber) {
		this.subjectNumber = subjectNumber;
	}





	public String getSubjectName() {
		return subjectName;
	}





	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}





	@Override
	public String toString() {
		
		return String.format("%d \t%s\t%s" , no ,subjectNumber,subjectName);
	}
	
	
	
	
	

}
