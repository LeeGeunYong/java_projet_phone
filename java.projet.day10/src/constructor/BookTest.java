package constructor;

public class BookTest {
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자" ,"생테쥐페리");
		System.out.println(" " + littlePrince.author);
		System.out.println(littlePrince + " " +littlePrince );
		System.out.println(littlePrince.toString());
		
		Book loveStory = new Book("춘향전") ;
		System.out.println(loveStory.title + " " + loveStory.author);
		System.out.println(loveStory.toString());
		
	
		
	}
}
