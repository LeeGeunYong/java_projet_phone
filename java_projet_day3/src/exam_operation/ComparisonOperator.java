package exam_operation;

import java.util.Scanner;

public class ComparisonOperator {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		System.out.println("x == y: " + (x == y));
		System.out.println("x != u: " + (x != y ));
		System.out.println("x <= y: " + (x <= y));
		
		
		char char1 = 'A';//65.a:97
		char char2 = 'b';//66
		
		boolean result = (char1 <char2);
		System.out.println("result= " + result);
		
	
		
		
		
		String name1 = "홍길동";
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요");
		String name2 = input.nextLine();
		
		//if(name1 == name2) {
			if(name1.equals(name2)) {
			System.out.println("이름이 동일합니다 ");
		} else {//
			System.out.println("이름이 동일 하지않습니다.");
			
		}
		input.close();
		
		
		
		
	}

}
