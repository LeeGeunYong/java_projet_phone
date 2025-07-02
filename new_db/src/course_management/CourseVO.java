package course_management;

public class CourseVO {
	private int no;
	private String courseNumber; // 과목번호
	private String courseName; // 과목명
	private String courseCredit;//학점
	private String courseCsection;// 과목 부군
	
	
	
	
	
	
	public CourseVO() {
		super();
		// TODO Auto-generated constructor stub
	}






	public CourseVO(int no, String courseNumber, String courseName, String courseCredit, String courseCsection) {
		super();
		this.no = no;
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.courseCredit = courseCredit;
		this.courseCsection = courseCsection;
	}






	public int getNo() {
		return no;
	}






	public void setNo(int no) {
		this.no = no;
	}






	public String getCourseNumber() {
		return courseNumber;
	}






	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}






	public String getCourseName() {
		return courseName;
	}






	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}






	public String getCourseCredit() {
		return courseCredit;
	}






	public void setCourseCredit(String courseCredit) {
		this.courseCredit = courseCredit;
	}






	public String getCourseCsection() {
		return courseCsection;
	}






	public void setCourseCsection(String courseCsection) {
		this.courseCsection = courseCsection;
	}






	@Override
	public String toString() {
		return "CourseVO [no=" + no + ", courseNumber=" + courseNumber + ", courseName=" + courseName
				+ ", courseCredit=" + courseCredit + ", courseCsection=" + courseCsection + "]";
	}
	
	
	
	

	
	
	
}
