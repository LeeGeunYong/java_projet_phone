package exam_collection_list;

public class Movie {
	private String title; //제목
	private String grade; // 평점
	private String director; // 감독
	private String year; //개봉일
	
	
	public Movie() {
		
	}
	
	public Movie(String title , String grade , String director ,String year) {
		this.title = title;
		this. grade = grade;
		this.director = director;
		this.year= year;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
	public String toString() {
		return "movie [제목 :" + title + "평점:" + grade+ "감독:" + director + "개봉일" + year+"]";
		
	}
}
