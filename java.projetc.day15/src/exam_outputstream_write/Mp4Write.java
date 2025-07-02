package exam_outputstream_write;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Mp4Write {
	public static void main(String[] args) {
		
	
		OutputStream os =null;
		InputStream in = null;
		try {
			os = new FileOutputStream("C:/Temp1/dokdo.mp4");
			in = new FileInputStream("C:/Temp//dokdo.mp4");
			
			int data = -1;
			
		
			
			
			
			while((data = in.read()) != -1) {
				os.write(data);
			} 
			
			System.out.println("파일이 복사 완료 ");
				
			
			
			
			
		
		
		
			}catch(FileNotFoundException f) {
				System.out.println("파일 경로가 없습니다 " + f.getMessage());
			}catch(IOException io) {
				System.out.println("파일이 입출력에 문제 가 있어서 더이상 작엊 x");
			}catch(Exception e) {
				System.out.println("파일에 오류가 있어서 작업 안되요");
			}finally {
				try {
					if(os == null)os.close();
					if(in == null)in.close();
					
				}catch(Exception e ) {
					e.printStackTrace();
					
				}
			}
		
	
	}

}
