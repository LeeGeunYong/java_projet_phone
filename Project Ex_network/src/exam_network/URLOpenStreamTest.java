package exam_network;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
//웹사이트를 읽고 문자형으로 변경한후에  파일에 저장 한거임
public class URLOpenStreamTest {
    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
        	URI uri = new URI("https://www.hanbit.co.kr/");
        	URL url = uri.toURL();

            //url.openStream()의 반환형 
            // - InputStream => InputStreamReader로 바이트 스트림을 문자스트림으로 변환 => BufferedReader
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            
            //openStream // 데이터를 읽기 위해 스트림을 연다”**는 뜻이야. InputStream 이랑 비슷한거si

            out = new PrintWriter(new FileWriter("index.html"));
            String inLine;
            while ((inLine = in.readLine()) != null) {
                out.println(inLine);
            }
            System.out.println("파일 복사 완료되었습니다.");
        } catch (URISyntaxException |  MalformedURLException e) {
            System.out.println("URL ERROR");
        } catch (IOException i) {
            System.out.println("IO ERROR");
        } finally{
            try {
                if(in!=null) { in.close();}
            } catch(Exception e){
                System.out.println("CLOSE ERROR");
            }
        }
    }
}