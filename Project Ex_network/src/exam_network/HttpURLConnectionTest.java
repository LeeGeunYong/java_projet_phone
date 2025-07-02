package exam_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class HttpURLConnectionTest {
	public static void main(String[] args) throws Exception {
		 String site ="https://www.daegu.go.kr/icms/rss/feed.do?id=BBS_00064";
        /* URL 클래스의 openConnection()을 호출하게 되면,
         * URL 클래스가 사용하는 프로토콜에 따라 URLConnection을 상속한 알맞은 하위 클래스의 인스턴스를 얻게 된다.
         * 예를 들어, HTTP 프로토콜을 사용할 경우 openConnection()
         * 메소드는 java.net.HttpURLConnection 클래스의 인스턴스를 리턴하게 된다.*/
		
		URI uri = new URI(site);
		URL url =uri.toURL();
		HttpURLConnection	 conn	=	(HttpURLConnection)	url.openConnection(); // 
		
		System.out.println("문서의 타입: "+conn.getContentType());

        int resCode = conn.getResponseCode();
        System.out.println("응답코드: " + resCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream())); //
        //                                                             // conn 에있는걸 읽어서 
        String inputLine;
        StringBuffer output = new StringBuffer(); 
        // 스트링 버퍼객체 생성

        while ((inputLine = in.readLine()) != null) {
            output.append(inputLine);
            output.append("\n");
        }
        in.close();

        System.out.println("\n----------문서 내용-------------");
        System.out.println(output);
    }

}