package exam_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample0 {
	public static void main(String[] args) {
		
		HashMap<String , String> dic = new HashMap<String , String>();
		
		//put(key , value) : 원소추가
		dic.put("고진감래", " 고생끝에 즐거움이 옴");
		dic.put("분골쇄신", "몸이 부서질정도록 노력을 다함");
		dic.put("권토중래 " , "실패를 발판삼아 재기함");
		dic.put("교학상자" ,"가르치고 배우면서 서로 설장함"); // Entry 4개 
		//dic.put(null,null) // HashMap 은 null 값이 저장 가능
		
		//get(key) :  특정키의  value를 반환하는 메소드
		System.out.println(dic.get("고진감래"));
		System.out.println();
		
		System.out.println("총 Entry 수" + dic.size());
		
		//객체 삭제
		dic.remove("교학상자");
		System.out.println("총 Entry 의 수" + dic.size());
		
		
		System.out.println(dic.toString());
		
		System.out.println("=========================================================");
		
		
		//방법 1 = 객체를 하나씩 처리
		Set<String> keySet= dic.keySet(); // keySet()은 모든키를 Set 객체 담아서 리턴
		Iterator<String> keys = keySet.iterator();
		while (keys.hasNext()){
		String key = keys.next();
		System.out.println(String.format("%s : %s" ,key , dic.get(key)));
		}
		
		
		System.out.println("=========================================================");		
		
		
		//방법2
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s : %s" ,key , dic.get(key)));
		
		}
		System.out.println("===============================================");
		
		
		
		//방법3 = 키오 ㅏ값을 한쌍으로  구성되 ㄴ객체를 set 에 담아서 리턴
		Set<Map.Entry<String,String>> entrySet = dic.entrySet(); 
		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
		
		// entrySet() 메서드는 키와 값의 한 쌍으로 구성된 객체(Map.Entry)를 Set에 담아서 리턴.
		while(entryIterator.hasNext()) {
			 Map.Entry<String, String> entry = entryIterator.next();
			 String key = entry.getKey();
			 String value = entry.getValue();
			 System.out.println(key + " : " + value);
			
		}
		
		System.out.println("======================================================");
		//방법 4
		
		for(Map.Entry<String,String> elem : dic.entrySet()) {
			System.out.printf("%s : %s \n" , elem.getKey(),elem.getValue());
		}
	}
}
//////////1,2번 은  키값만 가져와서 데이터값을 찾으러간다 
///3,4번은  키값 데이터값을  다 가져와서  키값은 이거   데이터 값은 이거  이걸 표현 해준다
//  2,4 은  각 1,3 번에 대해 ㅇ요약 출력문ㅇ니다 