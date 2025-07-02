package exam_throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMethod3 {
	public static void main(String[] args) {
		FileInputStream fi = null;

		byte[] readBytes = new byte[6];
		int readByteNo;
		String data = "";

		try {
			fi = new FileInputStream("test1.txt");
			//Java P/rogram/ming/   =  6바이트 /6바이트 /4바이트 / -1  // 파일에 끝은 무조건 -1을 반환 
			while (true) {
				readByteNo = fi.read(readBytes);
				System.out.println("읽어들인 바이트 수 : " + readByteNo);
				if (readByteNo == -1) 
					break;
				data += new String(readBytes, 0, readByteNo);
				//new String 로 바이트를 문자형으로 변환시켜준다 클래스안에 이런기능있다고함 
			}	// 형변환도 있지만  클래스로 변환시키는 법도 잇는거볼로 보임 
			System.out.println(data);
		} catch (FileNotFoundException fne) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException io) {
			System.out.println("파일을 읽는 도중에 문제가 발생하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fi != null)
					fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		
		data = "";
		try(FileInputStream fis = new FileInputStream("test1.txt");){
			while (true) {
				readByteNo = fis.read(readBytes);
				if (readByteNo == -1) 
					break;
				data += new String(readBytes, 0, readByteNo);
			}
			System.out.println(data);
		} catch (Exception e) {
			System.out.println("파일이 존재하지 않거나 파일을 읽는 중에 문제가 발생하였습니다");
			e.printStackTrace(); // 파일예외 위치를 콘솔에 알려줌
		} 
	}
}