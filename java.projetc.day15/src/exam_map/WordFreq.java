package exam_map;

import java.util.HashMap;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
/* 클래스명 : WordFreq
 * 문자열에 포함된 단어의 빈도를 계산하여 단어를 Key로, 빈도를 Value로 저장하여 출력해 보세요.
 * String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem"};
 *
 * [실행결과]
 * 총 단어 수 : 7개
 * {a=1, not=1, be=2, or=1, problem=1, is=1, to=2}
 */
		
		String[] sample = { "to", "be", "or", "not", "to", "be", "is", "a", "problem"};
		
		System.out.println("[실행결과]");
		
		HashMap<String , Integer> m = new HashMap<>();
		
		for(String word :sample) {
			Integer freq = m.get(word);
			m.put(word, (freq == null) ? 1 : freq +1);
			
		}
		System.out.println();
		
		 System.out.printf("총 단어 수 : %d개 \n", m.size());
	     System.out.println(m.toString());
	}
	

}
