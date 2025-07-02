package exam_class;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;







public class ArrayListExample {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
//		장기 자랑 프로그램에서 심사 위원들의 점수를 집계하는 프로그램을 작성하라. 점수는 0.0에서 10.0까지 가능하다. 
//
//		10명의 점수 입력받아 그 중에서 최고 점수(Collections.max(리스트의 참조변수))와 최저 점수(Collections.min(리스트의 참조변수)) 는 제외된다. 
//
//		​
//
//		[실행결과]
//
//		(1번째)심사위원의 점수: 1
//
//		(2번째)심사위원의 점수: 2
//
//		(3번째)심사위원의 점수: 3
//
//		(4번째)심사위원의 점수: 4
//
//		(5번째)심사위원의 점수: 5
//
//		(6번째)심사위원의 점수: 6
//
//		(7번째)심사위원의 점수: 7
//
//		(8번째)심사위원의 점수: 8
//
//		(9번째)심사위원의 점수: 9
//
//		(10번째)심사위원의 점수: 10
//
//		​
//
//		점수의 합: 44.0
		
		List<Double> list = new ArrayList<>();
		
		
		double sum = 0;
		
		for (int i= 0 ; i <10; i++) {
			
		System.out.printf("(%d번째) 심사위원에 점수 : " , i+1);	
		Double score = sc.nextDouble();
		
		list.add(score);       //0 ~ 9
		
		
		}
		
		
		
		
		list.remove(Collections.max(list)); 
		//remove 최대값을 뺀다 (list)안에서 
		
		
		
		
		
		list.remove(Collections.min(list));
		//remove 최초값을 뺀다 (list)안에서 
		
		for(double a : list ) {
			sum += a;
			
		}
		
		System.out.println("최대,최소 값을뺀 총합계는" + sum);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		//Collections.min
		
		
		
		
		
	}
	

}
