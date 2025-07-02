package exam_collection_set;

import java.util.HashSet;

public class FindDupplication {
	/* 전체 문자에서 중복된 단어를 검출하는 프로그램을 작성하여 보자.
	 * 이 예제 HashSet을 이용하여 코딩해 보세요.
	 * String[] sample = { "단어", "의미", "구절", "의미", "단락"};
	 *
	 * [출력 결과]
	 * 중복된 단어: 의미
	 * 단어 수 : 4
	 * 중복되지 않은 단어: [단락, 의미, 구절, 단어]
	 */
	
	public static void main(String[] args) {
		String [] sample = {"단어","의미","구절","의미","단락"};
		
		HashSet<String> set = new HashSet<String>();
		
		//!(부정연산자)는 ture -> false, false-> ture;
		
		for(String word : sample) {
			if(!set.add(word)) {// if(set.add(word) == false) 와 동일
				System.out.println("중복된 단어 : " + word);
				//set 은 중복된 단어가있으면 false 로 인식한다고함 
				//그래서 ! 부정연산자로 true 로 만들어서 동등한객체 로 인식 (중복)된단어
				// 찾는 문법  헷갈림주의  
			}
		}
		System.out.println("단어수" + set.size());
		System.out.println("중복되지 않은 단어 : " + set.toString());
		
	}
	
	
	

}
