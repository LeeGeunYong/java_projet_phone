package exam_collection_set;

import java.util.*;


public class SetInterfaceTest {
	public static void main(String[] args) {
		
	
		HashSet<String> set1 = new HashSet<>();//순서 없고 중복 없고 가장빠음
		//LinkedHashSet<String> set1 = new LinkedHashSet<String>();// 입ㅂ력한순서
		//TreeSet<String> set1 = new TreeSet<String>();//알파벳순 오름차순		
		
		set1.add("Milk");
		set1.add("Bread");
		set1.add("Butter");
		set1.add("cheese");
		set1.add("Ham");
		set1.add("Ham");
		set1.add("Ham");
		
		System.out.println(set1.toString());
		
		//반복자
		Iterator<String> it = set1.iterator();  //
		while(it.hasNext()) {//처음부터 값이 안나오는데까지 끝까지 라는뜻
			System.out.println(it.next());// 순자적으로 값을꺼낸다 
		}
				
		
		HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(Integer.valueOf(3));
        set2.add(5);
        set2.add(3);
        set2.add(4);

        System.out.println(set2.toString());
    }
}