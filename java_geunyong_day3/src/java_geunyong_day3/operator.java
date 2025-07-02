package java_geunyong_day3;

public class operator {
	public static void main(String[] args) {
		int i = 1;
		int ii = 2;
		String s = "asd";
		System.out.println(s+ (i+ii));
		
		
		//대입연산자
		
		int mathCore = 100;
		int engCore = 20 ;
		int korCore = 30 ;
		
		int total = mathCore + engCore + korCore;
		System.out.println(total);
		
		double average = total / 3.5;
		
		System.out.printf("%.2f",average);
		
		//증강 연산자
	
		int gameScore = 10;
		int num = gameScore++;
		int num1 = num++;
		int num2 = num1++;
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num1);
		System.out.println(num2);
		
		
		//논리 연산자
		
		
		int age = 32;
		boolean value = (age >= 40);
		System.out.println(value);
		
		
		int num11 = 10;
		int num22 = 2;
		num11 = num11 + 10;
		boolean value1 = (num11 < 10) && ((num22 = num22 + 2) < 10); // 가독성을위해서는 한칸위처럼 지정후 프린트부분에 저렇게 해도무방
		System.out.println(value1); // 보여주시식으로 하기떄문에 한거임 헷갈림 주의
		System.out.println(num11);
		System.out.println(num22);
		
		//조건 연산자
		int age1 = 3;
		
		age1 += num2;
		
		age1 += num1;
		
		System.out.println(age1);
		
		//조건연산자
		
		int father = 55;
		int mother = 40;
		
		boolean b1 ;
		
		b1 = (father > mother) ? true : false;
		
		System.out.println(b1);
		
		//  짝수가 맞는지  ture, false 로 표현
		int i1 = 10;
		
		boolean b2 ;
		
		b2 = (i1 %3 == 1) ? true : false;
		
		System.out.println(b2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		

		
		
		
	}

}
