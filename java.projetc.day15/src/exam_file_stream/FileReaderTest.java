package exam_file_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


	/*"test.txt" 파일에 "가장 위대한 영광은 한 번도 실패하지 않음이 아니라 실패할 때마다 다시 일어서는 데에 있다."
	 * 라는 글을 저장하고 -> 문자 출력 스트림
	 * 이 파일의 내용을 읽어 -> 문자 입력 스트림
	 * 콘솔(화면)에 출력하도록 코딩해 보세요.*/
	
		
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader in = null;
        BufferedReader reader = null;

        FileWriter out = null;
        String s = "가장 위대한 영광은 한 번도 실패하지 않음이 아니라 실패할 때마다 다시 일어서는 데에 있다.";
        try {
            out = new FileWriter("test.txt"); // 문자 출력 스트림(프로그램으로부터 데이터를 내보내는 스트림)
            out.write(s);    // 문자열은 write()로 출력 가능
            out.append('.'); // 파일에 끝에 문자 추가
            out.flush();

            in = new FileReader("test.txt"); // 문자 입력 스트림(프로그램으로 데이터를 읽어 들이는 스트림)
            reader = new BufferedReader(in);
            String str = null;
            while((str = reader.readLine())!=null) { // readLine() : 파일로부터 한라인씩 읽어 반환하는 메서드
                System.out.println(str);
                
                
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("경로명을 다시 확인해 주세요.");
            fnf.printStackTrace();
        } catch (IOException io) {
            System.out.println("오류로 인하여 test.txt 파일을 읽지 못하였습니다.");
            io.printStackTrace();
        } catch (Exception e) {
            System.out.println("다시 확인해 주세요.");
            e.printStackTrace();
        } finally {
            try {
                if (out != null)
                    out.close();
                if (reader != null)
                    reader.close();
                if (in != null)
                    in.close();
            } catch (Exception ex) {
                System.out.println("연결 해제 오류.");
            }
        }
    }
}
