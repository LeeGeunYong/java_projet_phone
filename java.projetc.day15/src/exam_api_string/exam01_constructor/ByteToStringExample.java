package exam_api_string.exam01_constructor;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97,};
		// 바이트 배열을 선언 및 코드값이 들어간다 아스키코드값이다 72가 H를 향한다 
		//Hello java
		
		String str1 = new String(bytes);
		System.out.println(str1.toString());
		
		//
		String str2 = new String(bytes, 6 ,4);
		System.err.println(str2);
		
		byte[] byteArray = str2.getBytes();
		System.out.println(byteArray);
		
		char[] value = { 'H', 'e' , 'L' , 'L' , 'O'};
			String str = new String(value);
			System.out.println("배열을 이용한 문자 객채 생성" +  str); 
			
		
	
	}

}
