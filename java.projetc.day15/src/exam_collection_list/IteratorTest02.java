package exam_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("닛뽄");
		list.add("베징");
		list.add("우리집");
		list.add("서울집");
		list.add("성남집");
		
		//ArrayLis의  원소를 인덱스로 접근하고자 할때
		
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=========================");
		
		
		Iterator<String> iter =  list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("=============================");
		
		for(String city : list) {
			System.out.println(city);
		}
		
		
	}

}
