package mutator_accessor;
//직접 챙정보를 대입하여 출력 
	//사용자로 하여금 책정보를 입력 받아 출려 ㄱ매서드로 구현하여 출력
public class Book2 {
	
	private String bookName;
	private String bookGenre;
	private String bookSales;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public String getBookSales() {
		return bookSales;
	}
	public void setBookSales(String bookSales) {
		this.bookSales = bookSales;
	}
	
	public void bookData(String name, String genre, String sales ) {
		bookName  = name;
		bookGenre = genre;
		bookSales = sales;
	}
	public String toString() {
		return "책제목은 = " +bookName+ "책의장르는 = "  + bookGenre + "책의 판매량 =" +bookSales;
		
		
	}
		
	

}
