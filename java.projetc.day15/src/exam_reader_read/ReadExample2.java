package exam_reader_read;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadExample2 {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"));){
			String str = null;
			while((str = reader.readLine())!=null) {
				System.out.println(str);
			}
		}catch(Exception e) {
			System.out.println("파일이 존재하지 않거나 파일 읽는 도중 문제가 있다 잠시 후에 다시 진행해 주세요.");
		}
	}
}