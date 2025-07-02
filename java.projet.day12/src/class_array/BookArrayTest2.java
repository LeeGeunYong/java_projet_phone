package class_array;

public class BookArrayTest2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		/*for(int i=0; i<library.length; i++){
			library[i].showBookInfo();
		}
		*/
		
		/*Book[] library = new Book[] {
				new Book("태백산맥", "조정래"),
				new Book("데미안", "헤르만 헤세"),
				new Book("어떻게 살 것인가", "유시민"),
				new Book("토지", "박경리"),
				new Book("어린왕자", "생텍쥐페리")
		};*/
		
		/*Book[] library = {
				new Book("태백산맥", "조정래"),
				new Book("데미안", "헤르만 헤세"),
				new Book("어떻게 살 것인가", "유시민"),
				new Book("토지", "박경리"),
				new Book("어린왕자", "생텍쥐페리")
		};*/
		
		/*for( Book book : library) { // : 순차적으로한다는뜻 주소를 가리키는  
			book.showBookInfo();		//이거 자주쓰는거라서 좋음
		}*/
	}
}