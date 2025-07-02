package exam_file_stream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamExample {
	public static void main(String[] args) {
		

	
	InputStream in =null;
	OutputStream on = null;
	int i;
	
	try {
		in = new FileInputStream("C:/Temp/cat.jpg");
		on = new FileOutputStream("c:/Temp1/cat.jpg");
		
		byte[] b = new byte[100];
		while( ( i = in.read(b)) != -1)  {
			on.write(b , 0 , i);
			
		}
		
		}catch (IOException io) {
			System.out.println("입출력에 문제가 있습니다");
			
		}catch(Exception e){
			
			System.out.println("입출력시 오류발생으로 복사를 진행 할수없습니다");
			
			
		}
		finally {
			try {
				
				
			if(in == null)in.close();
			if(on == null)in.close();
		
			}catch(IOException io) {
				io.printStackTrace();
				
		}			
			
			System.out.println("복사 완료 ");
		}
	}

}
