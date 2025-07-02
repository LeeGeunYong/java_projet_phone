package exam_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		String[] sample = {"i","walk","the","apple"};
		
		List<String> list = Arrays.asList(sample);
		
		Collections.sort(list);// 오름차순
		System.err.println("오름 차순" + list.toString());
		
		
		
		Collections.sort(list, Collections.reverseOrder());
		//내림차순
		System.out.println("내림 차순" + list.toString());
		
		
		
		
		
		
				
		
		
	}

}
