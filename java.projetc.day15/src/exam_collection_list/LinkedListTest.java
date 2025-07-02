package exam_collection_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		
	
		LinkedList<Character> list = new LinkedList<>();
		list.add('3');
		list.add('5');
		list.add('6');
		
		System.out.println(list.toString());
		System.out.println();
		
		Iterator<Character> it = list.iterator();
		while(it.hasNext()){// 다음값이 있는지 체크  맞으면 true
			System.out.println(it.next()); // 다음값꺼냄 출력
		}
	}
}



