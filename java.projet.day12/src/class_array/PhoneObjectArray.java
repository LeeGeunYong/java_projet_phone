package class_array;

public class PhoneObjectArray {
	public static void main(String[] args) {
		//참조변수로 표현
		Phone p1,p2,p3; // 객체 선언
		p1 = new Phone("아이폰" , "애플");//객체생성 (인스턴스 생성)
		p2 = new Phone("갤럭시 s24", "삼성");
		p3 = new Phone("갤럭시 폴드5" , "삼성");
		
		p1.printData();
		p2.printData();
		p3.printData();
		System.out.println();
		
		//객체배열과 표현
		Phone[] p = new Phone[3];
		
		p[0] = new Phone("아이폰15 " , "애플");
		p[1] = new Phone("갤럭시 s24 " , "삼성");
		p[2] = new Phone("갤럭시 폴드5 " , "삼성");
		
		// 출력 구문
		for  (int i= 0 ; i<p.length; i++) {
			p[i].printData();
		}
		System.out.println();
		
		
		//for ~ each 출력구문 .for (자료형 변수명: 배열명){}
		for (Phone ph : p) { //Phone ph = p[0]
    		ph.printData();
    	}
    	System.out.println();
    	
    	// 객체배열의 초기화로 표현	
    	Phone[] ph = new Phone[] {
    				new Phone("아이폰15", "애플"),      //-> ph[0]
    				new Phone("갤럭시 S24", "삼성"),    //-> ph[1]
    				new Phone("갤럭시 폴드5", "삼성")    //-> ph[2]
    	};
    	
    	// 출력구문
    	for(int i=0; i<ph.length; i++) {
    		ph[i].printData();
    	}
    	System.out.println();
    	
    	Phone[] ph1 = {
				new Phone("아이폰15", "애플"),      //-> ph1[0]
				new Phone("갤럭시 S24", "삼성"),    //-> ph1[1]
				new Phone("갤럭시 폴드5", "삼성")     //-> ph1[2]
    	};
    	for(Phone phone : ph1) {
    		phone.printData();
    	}
    	
    }
}