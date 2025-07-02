package exam_lambda;

interface Verify2 {
	boolean check(int n, int d);
}

public class LambdaExample03 {
	public static void main(String[] args) {
					//new Verify2 무명클래스 주소값을 vf에참조변수에 넣는다
	
		Verify2 vf = new Verify2() {
			@Override
			public boolean check(int n, int d) {
				return (n % d) == 0;
			}
		};
		System.out.println("결과값: " + vf.check(5, 2));
		
				//vf에 무령클래스 주소값이 들어감 
				//	
		
		//-> :  이렇게 동작해라
		//람다식으로 익명함수 int가 없이 함수를 사용
		//(n, d) = >매개변수 
		//(n % d) => 실행내용 리턴값
		Verify2 vf1 = (n, d) -> (n % d) == 0;
		System.out.println("결과값: " + vf1.check(24, 3));
	}
}