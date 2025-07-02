package exam_inputstreamreader;

//import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
    public static void main(String[] args) throws Exception {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        
        int readCharNo;
        String data ;
        char[] cbuf = new char[10]; // 크기가 10칸이지 10바이트씩 출력  10개 넘어가도 음 다음줄에서 실해됨
        System.out.print("문자를 입력해 주세요1:");
        while ((readCharNo=reader.read(cbuf)) != -1) { //바이트에 마지막은  -1 이라서 끝까지 출력이라는뜻
            data = new String(cbuf, 0, readCharNo-2);  // 엔터가 -2 바이트를 가지고있어서 
            System.out.println(data);
        }
        
        /*BufferedReader br = new BufferedReader(reader);
        String str;
        System.out.print("문자를 입력해 주세요2:");
        while ((str=br.readLine()) != null) {
        	 System.out.println(str);
        }
        br.close();*/
        reader.close();
    }
}