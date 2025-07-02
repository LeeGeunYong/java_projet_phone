package exam_variable;

public class VariableInitializationExample {
	public static void main(String[] args) {
		//변수 선언과 동시에 초기값 설정 10을 변수 value 초기값으로저장
		//int value = 10;
		int value ; //변수선언 =>자료형 변수
		value = 10; //변수에 값 대입(저장) =>변수명 =값
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과잢을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println("value = " + value + " result = " + result);
		System.out.print(" value = ");
		System.out.println(value);
		System.out.print(" result = ");
		System.out.println(result);
		
		
		//printf(fomat) 변수의 값을 출력하기 위해 변환문자(%)로 명시
		//정수: %d 문자: %c  문자열:%s 실수:%f
		//printf("출력문자" , 변수 , ...)
		System.out.printf("value = %d  result = %d\n" , value , result);
		
		double data = 4.9243;
		System.out.printf("data = %.15f " , data);
		
		float ada = 3.14f;
		System.out.printf("ada = %.1f" , ada);
		
		
		
		int num1 , num2 , num3;
		num1=3;
		num2=2;
		System.out.println(" \n교환전 num1 와 num2 의 값 ");
		System.out.println("num1 = " + num1 + "num2 = " + num2);		
		//두수를 교환(변수=값)
		num3 = num1;
		num1 = num2 ;
		num2 = num3;
		
		System.out.println("교환후 num1와 num2의 값");
		//System.out.println("num1 = " + num1 = "num2 = " +num2 );
		System.out.printf("num1 = %d num2 = %d" , num1, num2);
		
		
		//변수자체를 리터널이라고 부른다
	
	}
}
