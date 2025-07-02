package exam_throws;

import java.io.IOException;

public class ExceptionMethod1 {
	public static void main(String[] args) {
		System.out.println(readString());
	}

	public static String readString() {
		byte[] buf = new byte[100];
		System.out.print("문자열을 입력하시오:");
		int readCount = 0;
		try {
			readCount = System.in.read(buf); // 자바 : 한글 한글자 2byte / 영문 한글자 1byte
			//읽어들인 바이트수 확인
			System.out.println(readCount);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		//배열값 확인 
				for(byte b : buf) {
					System.out.println(b + " ");
				}
				System.out.println();
//		      String(바이트배열, 위치정보, 길이수)  : byte배열의 값을 문자열로 생성
				return new String(buf, 0, readCount - 2);
	
	
		
	}
	
}