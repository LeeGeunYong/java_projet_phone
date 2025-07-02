package exam_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class DownloadImage {
	public static void main(String[] args) {
		/* 웹에서 이미지 파일을 다운로드할 수 있도록 코드 작성해 주세요. */
		InputStream in = null;
		OutputStream out = null;
		int readByteNo;
		String website = "https://mblogthumb-phinf.pstatic.net/MjAyMDA1MTVfMjg2/MDAxNTg5NTE5MjI0NDMy.nijqfUywcoQ3wqTA_DZx6HaLpTGQu7YN9e4-NcXEZsEg.cCJZ-5yGjaIgaLMQ-0Ni4lIHbe8JgO7CYzVOKPi2-LAg.JPEG.finky04/0.jpg?type=w800";
		
		try {
			URI uri = new URI(website);
			URL url = uri.toURL();
			
			URLConnection con =url.openConnection();
			in = new BufferedInputStream(con.getInputStream());
			
			out  = new BufferedOutputStream(new FileOutputStream("C:/Temp/snoopy.jpg"));
			
			byte [] data = new byte [2048];
			while ((readByteNo = in.read(data)) != -1) {
				out.write(data , 0 , readByteNo);
			}
		
			System.out.println(website + "에서 이미지를 다운로드 완료 합니다 ");
			
			}catch (URISyntaxException | MalformedURLException e) {
				//                      |
				System.out.println("URL ERROR");
	
			
			}catch(IOException io) {
				System.out.println("IO ERROR");
			}finally {
				try {
					if (out != null)
						out.close();
					if(in != null)
						in.close();
					
				}catch(Exception e) {
					System.out.println("CLOSE ERROR");
				}
			}
			
		}

}
