package exam_class;

class Book {
	/* 일반적인 책을 나타내는 Book 클래스를 상속받아서 잡지를 나타내는 Magazine 클래스를 작성하여 보자. 
	 * Book 클래스는 제목, 페이지수, 저자 등의 정보를 가진다. 
	 * Magazine 클래스는 추가로 발매일 정보를 가진다. 
	 * 생성자, 접근자, 설정자를 포함하여서 각각의 클래스를 작성한다. 
	 * 이들 클래스들의 객체를 만들고 각 객체의 모든 정보를 출력하는 실행 클래스를 작성하라. 
	 * 
	 * [출력 예시]
	 * 책 이름 : 재미있는 과학잡지 BBC사이언스
	 * 페이지 수 : 119
	 * 저자 : BBC사이언스
	 * 발매일 :2016.08.25
	 * 
	 * 책 이름 : 엘르 Elle 2023.02월호
	 * 페이지 수 : 250
	 * 저자 : Elle
	 * 발매일 :2023.01.08
	*/
	
	private String title; //제목
	private int page;  // 책페이지수
	private String author; // 저자
	
	public Book() {
		
	}
	
	public Book(String title , int page , String author) {
		this.title = title;
		this.page = page;
		this.author = author;
				
	}
	
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		
	}

	public String toString() {
		return "책 제목은 = " + title + "\n책 페이지수 는 = " + page + "\n책 저자는 = " + author;
	}
	

	

	
	
	

}

class Magazine extends Book {
	
	private String releaseDate;
	
	public Magazine () {}




	public Magazine (String title , int page , String author ,String releaseDate) {
		super(title ,page , author);
		this.releaseDate = releaseDate;
	}
	

	public String toString() {
		return super.toString() + "\n발매일은 = " +releaseDate  ;
	}
}


public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("해리포터" , 456 , "이근용");
		System.out.println(book.toString());
		
		System.out.println();
		
		Magazine ma = new Magazine("라이트형제" , 4556 , "삼식이" , "2015년10월17일");
		System.out.println(ma.toString());
	}
}