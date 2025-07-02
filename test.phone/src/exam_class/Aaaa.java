package exam_class;

import java.util.*;

public class Aaaa {
	
	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        //TreeSet<String> set = new TreeSet<String>();
        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set.toString());
        
        
        System.out.println("========================================");
    
            String[] sample = { "단어", "의미", "구절", "의미", "단락" };
            Set<String> set1 = new HashSet<String>();
            // !(부정연산자)는 true -> false,  false -> true. 
            for (String word : sample) {
                if (!set1.add(word)) { // if(set.add(word) == false)와 동일.
                    System.out.println("중복된 단어: " + word);
                }
            }

            System.out.println("단어 수 : " + set1.size());
            System.out.println("중복되지 않은 단어: " + set1.toString());
        }
    }