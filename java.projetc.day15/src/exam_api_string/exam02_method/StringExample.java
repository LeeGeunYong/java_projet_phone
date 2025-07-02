package exam_api_string.exam02_method;

import java.lang.reflect.Array;

public class StringExample {
	public static void main(String[] args) {
		
	
	String a =  new String("c#");
	String b = new String (" c++");
	
	
	
	System.out.println(a + "의 길이는" + a.length());
	System.out.println(a.contains("#"));//contains //특정 값이 있는지 확인할 때 사용하는 메서드이지만 
	//포함되어있냐라고 생각해된다 저기에 c , # 둘중하나만 있어도 괜찮다
	// 논리형 참 거짓으로 ㅍ표현 됨
	
	
	
	
	
	a = a.concat(b); //문자를연결해주는 단어 콤캣
	System.out.println(a);
	
	a = a.trim(); // 문자열 앞 뒤의 공백 제거
	System.out.println(a);
	
	a = a.replace("c#","java"); //문자열대체
	System.out.println(a);
	System.out.println();
	
	String s[] = a.split(" ");// 문자열 분리
	
	for(int i = 0; i<s.length; i++) {
		System.out.println("분리된 문자열 : " + s[i]);
		
	//a = a.substring(5);   //인덱스 5부터 끝까지 리턴 // 인텍스는 0~부터 시작
	
	a = a.substring(0,4); // substring = 0~4번쨰까지 출력을 하겠다 라는말
	System.out.println(a);
	
	
	String subject = "JAVA 프로그래밍";
	System.out.println(subject.indexOf("프로그래밍")); // 인덱스
	
	
	
	//자바 관련 책인지 아닌지를 판별 할 수 있도록 족ㄴ식 작성
	if(subject.indexOf("JAVA")!= -1) {
		System.out.println("자바와 관련된책이군요");
	}else {
		System.out.println("자바와 관련없는 책이군요");
		
	}
	
	
	String country = "한국,일본,일본,중국,미국,독일,프랑스";
	
	//지정된  구분자로 자른후 문자열 배열로 반환
	String[] list = country .split(",");//split ==스플릿  구분자
	
	//분리하는 구분자 , 분리하는 문자열의 개수 (전체 문자열 개수는 3개로한정)
	String[] list2 = country.split("," ,3);
	
	for(String item : list) {
		System.out.println(item);
	}
	
	System.out.println("=============================================");
	
	for(String item : list2 ) {
		System.out.println(item);
	}
	System.out.println("================================");
	
	

	String email = "purum@rubypaper.co.kr";
	//split() 메서드를 사용하지 않고 아래와 같이 결과가 출력되도록 코드를 작성 id와 company 정의.
	
	
	String id = email.substring(0 , 5);// substring  문자열에서인덱스 0번부터 몇번 전까지 출력을 보여주는 메서드외워롸
	
	
	String company = email.substring(6);
	
	System.out.println(id);
	System.out.println(company);
	

	
	}
	System.out.println("==================================================");
	
	
	
	int number = 10;// "10"
	String value = String.valueOf(number);
	System.out.println(value);
	
	
	

	
	}
}
			


