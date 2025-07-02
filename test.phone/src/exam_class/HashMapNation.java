package exam_class;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class HashMapNation {
//	키보드로 10개의 나라 이름과 인굴르 입력받아 모드 HasgMap에 삽입한 뒤,
//	나라 이름을 키보드로 부터 입력 받아 그나라의 입구를 출력하는  프로그램을 작성하라
//	클래스명 HashMapNation
//	
//	[실행 예시 - 2개의 데이터 입력]
//	나라 이름과 인구를 10개를 입력 하세요 (예:대한민국 51833175)
//	나라 이름, 인구 >> 518331대한민국 75
//	나라 이름, 인구 >> 영국 66830229
//	
//	나라 이름을 입력 하면 인구를 검색할수 있습니니다  끝을 입력하면 종료합니다 
//	나라 이름 >> 대한민국
//	대한민국의 인구는 51,883,175
//	
//	나라 이름 >> 영국
//	영국의 인구는 66,830,229
//	
//	나라 이름 >> 끝
//	
//	프로그램을 종료합니다 
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		Map<String , Integer> m = new HashMap<>();
		
		
		
		
		for(int  i = 0; i<2; i++ ) {
			System.out.printf("%d번째 나라 이름 :" , i+1);
			String nation = sc.nextLine();
			
			System.out.printf("%d번째 나라 에 인구를 입력" ,i+1);
			int population = sc.nextInt();
			sc.nextLine();
			
			m.put(nation ,population );
				
			}
		
		
		//조건에 맞는정보 출력
        while (true) {
        	System.out.println("나라 이름을 검색해주세요");
        	String nation = sc.nextLine();
        	
        	Integer population = m.get(nation);
        	
        	
        	
        	if(nation.equals("끝")) {
        		System.out.println("프로그램 종료");
        		break;
        	}else
        		
        		System.out.println(nation +"인구 수는 : " + population + "입니다 "); // 
        	
        
           
//		int[] array = new  int[10];
		
		
		
        }
        }

}
