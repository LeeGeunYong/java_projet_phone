package exam_network;

import java.net.InetAddress;

import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress  itan = InetAddress.getByName("www.naver.com");
		InetAddress  itad = InetAddress.getByName("www.daum.net");
		
		System.out.println("호스트먕고과 IP :" + itan.toString());
		System.out.println("호스트명과: " + itad.getHostName()); //호스트의 이름을 문자열로 반환
		System.err.println("IP:" + itad.getHostAddress());//IP 주소를 나타내는 4개의 
		System.err.println();
		
		InetAddress ina [] = InetAddress.getAllByName("www.naver.com");
		// getAllByName("www.naver.com"); 하나의 도메인에 여러IP가 있을수있어  전부다 가여오는 메서드
		for(int i = 0; i <ina.length; i++) {
			System.out.println(ina[i]);
		}
		
		System.out.println();
		
		InetAddress ital = InetAddress.getLocalHost();// 현재 컴퓨터 의  InetAddress 객체를 반환한다  
		System.out.println("로컬 호슽으명과  IP:" + ital); // 호스트명과 IP 주소를 반환
		
		System.out.println("로컬 컴퓨터 이름 " + ital.getHostName());// 호스트의 이름을 문자열로 반환
		System.out.println("로컬컴퓨터 IP 주소: " + ital.getHostAddress()); // IP 주소를 나타내는 4개의 
		
		
		
		
	}

}
