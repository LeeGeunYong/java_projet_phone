package exam_test_book;

public class Book {
	/*
	 * 도서 정보를 출력하고자 한다.
	 * 
	 * 도서는 책제목, 총페이지수, 저자 정보, 출판사 정보를 필드로 가진다.
	 * 
	 * 저자(Author)는 저자의 이름과 나이, 국적을 필드로 가진다
	 * 
	 * 출판사(Publisher)는 출판사명과 국가명을 필드로 가진다
	 * 
	 * 각각은 생성자, 접근자, 설정자를 가진다.
	 * 
	 * ​
	 * 
	 * 그래서 책제목, 페이지수, 저자명, 저자나이, 저자국적, 출판사명, 출판사국가명을 출력하면 된다.
	 * 
	 * ​
	 * 
	 * [실행결과]
	 */

	private String bookName;
	private int page;
	private String authorInformation;//저자정보
	
	private String publisherInformation; //출판사 정보
	
	public Book() {}
	
	public Book(String bookName , int page , String authorInformation, String publisherInformation) {
		this.bookName = bookName;
		this.page = page;
		this.authorInformation =authorInformation;
		this.publisherInformation = publisherInformation;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthorInformation() {
		return authorInformation;
	}
	public void setAuthorInformation(String authorInformation) {
		this.authorInformation = authorInformation;
	}
	public String getPublisherInformation() {
		return publisherInformation;
	}
	public void setPublisherInformation(String publisherInformation) {
		this.publisherInformation = publisherInformation;
	}
	
	
	

}
