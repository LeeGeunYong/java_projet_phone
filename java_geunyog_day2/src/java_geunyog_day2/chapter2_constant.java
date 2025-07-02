package java_geunyog_day2;

public class chapter2_constant {
	
	public static void main(String[] args) {
		
		//constant :콘스탄트  상수 절대 변하지 않는값 final 을사용 자료형 앞에다
		final int ii = 10; //변수에 초기화,상수 선언
		
		//ii = 20; // 변수리터럴을 바꾸려고 할대오류뜨는 예시
		
		System.out.println(ii);
		
		
		
		byte bnum1=10;
		int  inum = bnum1;
		
		System.out.println(bnum1);
		System.out.println(inum);
		
		
		int inum1 = 10;		
		float fnum = inum1;
		
		System.out.println(inum1);
		System.out.println(fnum);
		
		double dnum = inum1 + fnum;
		
		System.out.println(dnum);
		
		
		int aii = 10;
		byte abb = (byte)aii;
		
		System.out.println(abb);
		
	
		int iii = 10; // 4byte 이고
		float fff = 10; //4byte
		
		double ddd = iii+fff; //double 8byte
		
		// 그래서 byte 크기에 맞게넣게 될경후 형변환이 가능함
	
		
		System.out.println(ddd);
		
		
		//형변환시 작은byte 에 큰byte 넣기
		/*
		double d =10;
		float ffff = d;  안되는예시 이럴땐 () 안에 넣은크기에 자료형을 적어야함
		*/
		double d =10;
		float ffff =(float)d;
		
		System.out.println(ffff);
		
		 //문자는 하나이기 떄문에 안된다
		
		float fNum = 0.9f; //변수에서 두개의단어가 생길경우 앞은무조건 소문자 두번째단어부턴 대문자
		double dNum = 1.2;//그리고 f로 적어줘야한다 double 같은경우는 사용해도되고 안해도됨
		
		System.out.println(fNum + dNum);  
		
		
		char c = 'z';
		
		
		System.out.println(c);
				
		char c1 = 38;
		int i1 = c1;
		
		System.out.println(i1);
		
		int i2 = 38;
		char c2 = ((char) i2);

		System.out.println(c2);
		
		int i3 = 90;
		char c3 = ((char)i3);
		
		System.out.println(c3);
		
		String s = ("\uD55C");
		
		char c4 = '글';
		unicode u = ((unicode)c4);
		System.out.println(s);
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
				
				
		
		
	}

}
