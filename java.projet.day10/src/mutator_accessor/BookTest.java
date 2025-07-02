package mutator_accessor;

import java.util.Scanner;

public class BookTest {
	//직접 챙정보를 대입하여 출력 
	//사용자로 하여금 책정보를 입력 받아 출려 ㄱ매서드로 구현하여 출력
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		inputData("book1");
		
		System.out.println(book1.toString());
		
		Book book2 = new Book();
		inputData("book2");
		System.out.println(book2.toString());
		
		Book book3 = new Book();
		inputData("book3");
		System.out.println(book3.toString());
		

		
	}
	private static void inputData(String book) {
		System.out.println("책의 이름을 적어주세요");
		book = input.nextLine();
		
		System.out.println("책의 장르를 입력해주세요");
		book = input.nextLine();
		System.out.println("책의 판매량를 입력해주세요");
		book = input.nextLine();
				
	}

}
