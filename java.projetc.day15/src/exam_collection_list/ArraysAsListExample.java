package exam_collection_list;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		String[] names = {"홍길동" + "김철수 " + "조미진"};
		
		List<String> list1 = Arrays.asList(names); 
		//  배열을 리스트로 변환하는 자바 제공메서드 Arrays.asList(names); 
		
		System.out.println("list1 리스트 개수" + list1.size());
		// length 는 배열의 크기를 가져오지만 list에 size는 저배열자체를 리스트에 넣기때문에 
		//names 배열참조변수에 이름3개가 들어가있고  그걸 list 에 names 자체가 
		
		for(String name : list1){// Lisr1.get(0)0
			System.out.println(name+" "); 
			// : 을 사용해서 배열에 있는값을 순차적으로 String 타입으로 들어감 
			//홍 김 조
			
			
		}
		
		System.out.println();
		
		Integer[] number= {10,23,30};
		List<Integer> list2 = Arrays.asList(number);
		//배열을 리스트로 바꿔주는 자바 제공메서드 Arrays.asList(names); 
		//배열: Integer[] number= {10,23,30};
		System.out.println("\nlist2 리스트개수 :" + list2.size());
		//Integer 객체이기때문에 주소값이 있음 그래서 size로 호출했을 안에 10,20,30이 각각 주소값이있음
		
		for(Integer value : list2) {
			System.out.println(value +" ");
		}
		
		int[] num = {10, 20, 30};
		//자료형 타입 배열 생성및 값정의
        List<int[]> list3 = Arrays.asList(num);
        //배열을 리스트에 담는 변환메서드  Arrays.asList(num);
        
        System.out.println("\nlist3 리스트 개수 " + list3.size());
        
       

        for(int[] value : list3) {
            System.out.print(Arrays.toString(value)+" ");
        }
        System.out.println();
        
        int[] intValue = list3.get(0);
        for(int i : intValue) {
        	System.out.println(i + "  ");
        }
    }
}
