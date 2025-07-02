package exam_collection_set;

import java.util.*;

public class HashSetExample02 {
	public static void main(String[] args) {
		//
		Set<Key> set = new HashSet<>();
		
		set.add(new Key(1));
		set.add(new Key(13));
		set.add(new Key(1));
		set.add(new Key(35));
		set.add(new Key(1));
		
		int size = set.size();
	    System.out.println("총 객체수: " + size);
	        

        Iterator<Key> iterator = set.iterator();
        while(iterator.hasNext()) {
            Key k = iterator.next();
            System.out.println("\t" + k.toString());
            
            
            
        }    
	}
}
