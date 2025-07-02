package constructor;



public class Book {
	String title;
	String author;
	
	public Book() {//디폴트 
		this("","");
		//각필드의 값을 null이 아닌 ""빈문자로 초기화
	}
	public Book(String title) {
		this(title, "작자미상");
		System.out.println("매개변수가 하나인 생서장 \n");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		System.out.println("매개 변수가 두개인 생성자\n");
	}
	public String toString() {
		return  "책 제목= : " + title +" 책저자= : " + author;
	}
	
}
