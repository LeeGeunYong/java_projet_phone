package java_Test;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class IOService {
	public static void main(String[] args) {
		
	// 시험문제 
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("test.txt");
			String str = "안녕하세요";
			
			fw.write(str);
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				if(fw != null) fw.close();
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}


