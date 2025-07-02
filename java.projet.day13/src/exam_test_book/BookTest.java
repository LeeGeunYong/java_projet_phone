package exam_test_book;

public class BookTest {
	public static void main(String[] args) {
		
		Book b = new Book();
		Author a = new Author();
		Publisher p = new Publisher();
		
//		System.out.println(b.getBookName());
//		System.out.println(b.getPage());

		b.setBookName("Do!it!자바");
		b.setPage(700);
		b.setAuthorInformation("저자정보");
		b.setPublisherInformation("출판사정보");
		a.setAuthorName("홍길동");
		a.setAuthorAge(25);
		p.setPublisherName("korea"); //국가명
		p.setCountryName("Infinity"); //푸판사명명
		
		
		
		String page = " ("+"총페이지 수 는: " + b.getPage() + ")";
		String authorInfor =   "(" + a.getAuthorAge() + ", "  +p.getPublisherName() + ") / ";
		String countryName =  p.getCountryName() + "(" + p.getPublisherName() + ")";
		
		
				
				
		System.out.println("책정보는 다음과 같다");
		System.out.println("==============================");
		
		System.out.print(b.getBookName());
		System.out.println(page);
		System.out.print(a.getAuthorName());
		System.out.print(authorInfor); 
		System.out.println(countryName);
		
		
		
		
		
	}

}
