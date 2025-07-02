package exam_try_with_resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		// try-with-resources 
		try (FileInputStream fi = new FileInputStream("file.txt")) {// Hello Java!!를 적어놓음 
			// FileInputStream 이건 자바 io 에 있는 기능이다  그안에 read(); 호출 메서드가 있다 1바이트만 읽는다 
			int c = fi.read();//read는 한바이트만 읽어 올수있어서 h 하나만 나오개된다 
			System.out.println((char) c);
		} catch (IOException e) {//IOException e 입출력 관련예외처리 // 큰범위가넚음 파일, 데이터 베이스 , 네트워크등  
			e.printStackTrace();//printStackTrace :예외가 발생하면 예외종류 원인발생위 콘솔에 알려주는거 
		}
		
		// try ~ catch ~ finally
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("file.txt");
			int c = fi.read();
			System.out.println((char) c);
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(fi != null) fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
	}
}