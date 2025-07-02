package exam_lambda;
interface Verify{ // 사실인지 확인
	
	boolean check(int n); // 진실거짓 체크 추상메서드 (매개변수 ) 정의
	
}

public class LambdaExample02 {
	public static void main(String[] args) {
		//				익명클래스 참조값이
		Verify isEven = new Verify() { // 익명클래스 선언및 값초기화

			@Override
			public boolean check(int n) {//
				
				return (n %2) == 0;
			}
			
		};
		System.out.println("결과값 : " + isEven.check(3));
		
		isEven = (n)->(n % 2) ==0; // 짝수를 표현하는 방법
		System.out.println("결과값" + isEven.check(10));
		
		Verify isOdd = (n)->(n % 2) ==1 ; // 홀수를 표현하는방법
		System.out.println("결과값" + isOdd.check(9));
		
		isOdd = new Verify() {
			
			public boolean check(int n ) {
				return (n % 2 ) ==1;
				
			}
		};
		System.out.println("결과값" + isOdd.check(8));
	}	
}
