package exam_api_stringtokenizer.exam01_method;

import java.util.*;

public class StringSplitExample {
	public static void main(String[] args) {
		
	
	//방법1 String 클래스의 split() 메서드
	String text = "자바& 오라클 ,, 리눅스 , HTML-JAVASCRIPT-JQUERY";
	String[] names = text.split(",");
	//String[] names = text.split("&|,|-"); // (| :뜻 or ) 
	// 구분자가 연속으로 존재시 빈문자열로 간주하여 빈문자열 반환.
	
	System.out.println("배열의 수 : " + names.length);//요소가 들어간만큼 크기 인식
	// 크기가 4개가 나오는데  lnegth 는 빈공간도 인식해서 4개
	
	
	
	for(String name : names) {
		System.out.println(name);
		
	}
	
	System.out.println();
	
	
	
	// 방법2: 남아 있는 토큰를 확인하고 while문으로 반복
	// StringTokenizer(대상 문자열, 구분자) 생성자
	
	
	StringTokenizer st = new StringTokenizer(text, "," );
	//StringTokenizer st = new StringTokenizer(text, "&,-");
	int countTokens = st.countTokens(); // 토큰의 개수를 반환.
	System.out.println("전체 토큰 수 : " + countTokens);
	// countTokenizer 이 메서드는  빈공간을 없는걸로 인식한다 그래서 3개 로 나온다 헷갈리수잇음 

	while (st.hasMoreTokens()) { // 토큰이 더이상 존재하는 여부를 true/ false 반환.
		String token = st.nextToken(); // 다음 토큰을 리턴.
		System.out.println(token);
			}

		}
	}
