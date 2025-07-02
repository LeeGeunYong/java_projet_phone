package exam_map;

import java.util.*;

public class HashMapExample2 {
	
	// Student라는 이름으로 클래스를 생성해 주세요 . 필드는 학번 , 이름을 가진다
	
	public static void main(String[] args) {
		// key =  번호  , value = 학생정보
		
		HashMap<Integer,Student> st = new HashMap<Integer , Student>();
		st.put(1, new Student(99030001 , "홍길동"));
		st.put(2, new Student(99030002 , "김도훈"));
		st.put(3, new Student(99030003 , "윤도희")); // 출력시 윤도희 안나오는건  
		st.put(3, new Student(99030004 , "김희진"));//중복될시 앞에 꺼가 뒤에 값으로 덮어짐
		
		System.out.println(st.toString());
		System.out.println("=================================================");
		
		
		
		Iterator<Integer> it = st.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			
			Student sst = st.get(key);
			System.out.println(key + " " + sst.toString());  
			// 벨류값만 가져오기 렛츠고 
		}
		
		System.out.println("=======================================================");
		
		
		 // 키와 값의 한 쌍으로 구성된 객체를 Set에 담아서 리턴
		
		for(Map.Entry<Integer , Student> s : st.entrySet()) {
			Integer key = s.getKey();
			Student value = s.getValue();
			
			System.out.println("key" + key + " value" + value);
			
		}
		System.out.println("=-=========================================================");
		
			
		 Map<Student, Integer> map = new HashMap<Student, Integer>();
	        map.put(new Student(70010001, "홍길동"), 95);
	        map.put(new Student(70010001, "홍길동"), 89);

	        System.out.println("총 Entry 수: " + map.size());
	        System.out.println(map.toString());
	        System.out.println();
	        
	        for(Student student : map.keySet()) {
	        	System.out.println(student + " => " + map.get(student));
	        }
	        System.out.println();

			
	        
	        TreeMap<String , Student> tMap = new TreeMap<>();
	        tMap.put("1", new Student(9401001, "홍길동"));
	        tMap.put("4", new Student(9401001, "김희진"));
	        tMap.put("2", new Student(9401001, "윤도희"));
	        tMap.put("3", new Student(9401001, "김철수"));
	        
	        for(String key : tMap.keySet()) {
	        	System.out.println( key + ", "+tMap.get(key));
	        }
	        
	        TreeMap<Student ,Integer> sMap = new TreeMap<Student , Integer>();
	        sMap.put(new Student(97010001, "윤도희"), 89);
	        sMap.put(new Student(95020001, "김희진"), 90);
	        sMap.put(new Student(94010001, "홍길동"), 99);
	        sMap.put(new Student(99030003, "김철수"), 79);

	        for (Map.Entry<Student, Integer> sd : sMap.entrySet()) { // 에러가
	        	// TreeMap이  기준점을 잡고 정렬을 해줘야하는데 기준점에 학번인지 이름이몰라서 오류가 발생
	        	// 이때  Student 에 가서 메서드를 만들어야함 compareTo 
	        	//public class Student implements Comparable<Student> 선언햊여함 
	        	
	            Student key = sd.getKey();
	            Integer value = sd.getValue();
	            System.out.println("key=" + key + ", value=" + value);
	        
	        }
	}
}


