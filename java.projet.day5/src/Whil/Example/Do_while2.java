package Whil.Example;



public class Do_while2 {
	public static void main(String[] args) {
		
//do while 문을 이용하여  a 부터 z 출력하는 프로그램 만드시오
		
		
		
		char a = 'a';
		
		do {
			System.out.print(a + " "); 
			a++;
			//a = (char) (a+1); // a 아스키 값이 97인건고 계속 플러스 1로 증가 로 해준다
			// a의 값이 문자이기때문에 a + 1 문자열로 바꿔주기 위해 앞에다가 (char) 붙인다 형변환
		}while ( a <= 'z');
		
		
		
		
	}

}
