package exam_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomList {
	public static void main(String[] args) {
	//	List<Integer> list  = new ArrayList<>();
		
//		list.add(86);
//		list.add(34);
//		list.add(98);
//		list.add(31);
//		list.add(65);
//		list.add(98);
//		list.add(80);
//		list.add(92);
//		list.add(88);
//		list.add(13);
		
		
		
//		System.out.println("정렬전 List 데이터");
//		for(Integer num : list) {
//			System.out.print(num);
//		}
//		
//		
//		System.out.println("\n정렬후 List 데이터");
//		
//		 Collections.sort(list);
//		 System.out.println(list);
//	
		
		 
		 
		 
		 Random r  = new Random();
		 
		 
		// System.out.println(r.nextInt(100)+1); // 난수를 구하는 거임  난수:0~1  안에슈  0.0~ 0.9999999999~ 까지 거기에 ㄱ
		 // 
		 
		 List<Integer> list  = new ArrayList<>();
		 
		 for(int i = 0; i< 10; i++) {
			 list.add (r.nextInt(100)+1); // 랜덤 클래스만에 메서드 .nextInt  ,    
		 }
		 
		 System.out.println("정렬전 List 데이터 ");
		 for(int i= 0; i < list.size(); i++) {
			 System.out.print(list.get(i)+ " "); 
			 
		 }
		 
		 System.out.println("\n정렬후 List 데이터");
		 Collections.sort(list); //  Collections.sort(); >> 오름차순으로 정렬하해준느거임 
		 for(Integer i : list) {
			 System.out.print(i + " ");
		 }
		 System.out.println("\n정렬후 List 데이터 2");
		 for(int i= 0; i < list.size(); i++) {
			 System.out.print(list.get(i)+ " "); 
			 
			 
		 }
	}

}



