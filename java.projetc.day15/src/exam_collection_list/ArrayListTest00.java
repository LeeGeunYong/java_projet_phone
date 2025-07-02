package exam_collection_list;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest00 {
	public static void print(int n, List<String> list) {
        System.out.println(n + " : " + list);
	}
	public static void main(String[] args) {
		
		 LinkedList<String> list = new LinkedList<String>();

	        list.add("서울");
	        list.add("북경");
	        list.add("상해");

	        Iterator<String> it = list.iterator();
	        while (it.hasNext()) {
	            System.out.print(it.next() + "\t"); // 서울 북경 상해
	        }
	        System.out.println();
	        
	        list.add(1, "LA"); // 1 : [서울, LA, 북경, 상해]
	        print(1, list);
		
	        list.addFirst("런던"); // 2 : [런던, 서울, LA, 북경, 상해]
	        print(2, list);
	        
	
	
		
	}
}
