package first;
// : 한라인 주석 (소스설명을 명시하는곳)
//example :  예시 코드나 샘플 코드
/*여러라인 주석
*/


public class Example {
	public static void main(String[] args) {
		
		String name = "이근용";
		String ment = "너무어려워서 포기";
		String area = "성남";
		int age = 32;
		
		System.out.println(name + ment + area + age);
		System.out.println(ment);
		System.out.println(area);
		System.out.println(age);
		
		
	}

}

/*
자료형(data type) 은 변수에 저장되는 자료의 타입을 의미한다 
기초형(primtive type) : 값을 다루는 자료향 (정수형, 살수형, 문자형, 논리형)
참조형(reference(참조) type):기초형 자료형 외 모든거

변수의 선언
선언이란: 컴파일러에게 어떤 변수를 사용하겠다고 미리 알리는것 다시말해 변수 선언이란 

메모리:주소 값 1비트 ->  8바이트 8바이트가 문자1개

변수의 이름은 식벽자(identifier)의 일종으로 다음과 같은 규칙을 따른다
영어 대소문자구분되며 길이 제한이 없다
예약어를 사용하면 안된다
숫자로 시작하면 안된다 
특수문자는'_'

다양한표기법

카멜 표기법:

파스칼표기법:변수명과 메서드는  

스테이크 표기법: _ 언더바

클래스명은 각단어의 첫글자는 대문자로 대표적예 (String)

변수명,메서드명 : 첫글자 소문자 2번째단어부터 첫글자 대문자 ()

static final 자료형변수 :변하지않는 숫자를 나타내는 변수, 모든글자를 대문자

변수의 사용범위 - 변수는 중괄호 블록{}내에서만 선언 되고사용

변수자체를 리터널이라고 부른다 (예. 정수리터널 문자리터널)
*/