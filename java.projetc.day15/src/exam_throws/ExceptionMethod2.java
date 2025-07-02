package exam_throws;

import java.io.IOException;

public class ExceptionMethod2 {
	public static void main(String[] args) {
		try {
			System.out.println(readString());
		} catch (IOException e) {// 여기서 예외 처리 
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {// 여기서 예오;처리
			e.printStackTrace();
		}
		
	}
	
	public static String readString() throws IOException{
		//trinws를 호출할때 이메서드의 예외를 처리 하하겠다
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력해주세요 ");
		
		int readCount = System.in.read(buf);
		System.out.println();
		return new String(buf,0,readCount-2);// 엔터값 이 2 라서 -2 
	}

}
