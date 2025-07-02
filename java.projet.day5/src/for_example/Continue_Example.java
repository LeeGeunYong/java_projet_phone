package for_example;

public class Continue_Example {
	public static void main(String[] args) {
		/*문자열 "no news is good ne" 대상으로 
		 * 반복 문자 'n'이 아니면 continue문에 의하여 루프의
		 * 나머지 부분을 생략하고 다음문자를 처리하도록 코딩
		 *참고
		 *문자길이는 (.length()로) 얻을수있음
		 * 문자열변수명 .charAt(0)
		 **/
		String s = "no nesw is good news";
		int n = 0;
		
		for (int i = 0 ; i < s.length(); i++) {
			if (s.charAt(i) !='n') {
				continue;
			}
			n++; // n의개숫 하나 증가한다 
		}
		System.out.println("문장에서 발견된 n의개수 : " + n + "\n");
	}

}
