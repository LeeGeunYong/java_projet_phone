package exam_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		
	
	
		
		
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		list.add("다섯");
		list.add("여섯");
		list.add("일곱");
		
		String str;
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str);
		}
		
	}
}
