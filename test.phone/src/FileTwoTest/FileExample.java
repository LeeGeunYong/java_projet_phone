package FileTwoTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
//	주어진 2개의 텍스트 파일(test.txt, result.txt)을 합하여 ->
//  result.txt 파일은 직접 생성하셔도 되고 코드로 생성하셔도 됩니다
//
//	하나의 파일(writer.txt)로 만드는 프로그램을 작성하시오.
//
//	test.txt 파일의 내용
//	가장 위대한 영광은 한 번도 실패하지 않음이 아니라 실패할 때마다 다시 일어서는 데에 있다..
//	result.txt 파일의 내용
//	행복은 성취의 기쁨과 창조적 노력이 주는 쾌감 속에 있다. (프랭클린 D. 루스벨트) 
//	우리가 할 수 있기 전에 배워야 하는 일들을, 우리는 하면서 배운다. (아리스토텔레스)
//	저는 미래가 어떻게 전개될지는 모르지만, 누가 그 미래를 결정하는지는 압니다. (오프라 윈프리)
	public static void main(String[] args) {  // 나는 리절트를 만들거야 
		
		FileWriter  wr = null;
		BufferedReader buff1 = null;
		BufferedReader buff2 = null;
		
		
		try {
			wr =  new FileWriter("result.txt");
			wr.append("늦을떄가 늦은건다  접어라 (하임스 리)");
			wr.append("늦었다고 생각할떄 시작해라 (제임스 리)");
			
			//pw = new PrintWriter("writer.txt") // 아웃에서  출력클래스도로 사용가능 
			
			wr.write(wr.toString());
			

			buff1 = new BufferedReader(new FileReader("test.txt" ));
			buff2 = new BufferedReader(new FileReader("resulte.txt" ));
			
			wr = new FileWriter("writer.txt");
			
			while (true) {
				String st = buff1.readLine();
				if((st == null))
					break;
				wr.write(st+"\r\n");
				//pw.print(st);
			}
				
				
			while (true) {
				String sts = buff2.readLine();
				if((sts == null)) 
					break;
				wr.write(sts + "\r\n");
				//pw.print(sts);
				
				}	
				wr.flush();
				
			
		
			

			System.out.println("파일을 서로 합 했습니다");
			
		}catch(FileNotFoundException fi) {
			System.out.println("test.txt 파일이 없습니다");
			
		}catch(IOException io) {
			System.out.println("입출력에 문제가 생겼습니다");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(wr == null) wr.close();
				if(buff1 == null) buff1.close();
				if(buff2 == null) buff2.close();
				
			}catch(IOException io) {
				io.printStackTrace();
			
			
		
			}
		}
			
	}
}

	