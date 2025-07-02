package java_Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookList {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Book> list = new ArrayList<Book>();
		
		
		list.add(new Book("아프다니까", 3000));
		list.add(new Book("우앙아" , 3043));
		list.add(new Book("아ㅈㄷㅈㄷ" ,3000));
		
		System.out.println("책제목 :");
		String name = sc.next();
		
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println(list.toString());
				return;
			}
		}
		System.out.println("책제목이 존재 하지않습니다");
		
		
		
		for(Book book :list) {
			System.out.println(book);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.toString());
		}
		
		sc.close();
		
		
	}

}
