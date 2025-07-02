package exam_While;

public class WhileExample {
	public static void main(String[] args) {
		
		System.out.println("1에서 부터 5까지 출력");
		int i = 1;
		System.out.println("1. 정수  : ");
		while ( i <= 5 ) {
			System.out.print(i+ " ");
			i++	;
		}
		System.out.println();
		
		i = 1;
		System.out.print("2. 정수: ");
		while (true) {
			System.out.print(i + " ");
			i++;
			if (i > 5) {
				break;
			}	
							
		}
	
		System.out.println("\n5에서 부터 1출력");
		i = 5;
		System.out.print("1. 정수:");
		while(i > 0) {
			System.out.print(i + "");
			i--;
			
		}
		System.out.println();
		
		i = 5;
		System.out.println("2. 정수: ");
		while (true) {   // 조건식이 무도건 참이므로 무한반복 (무한루프)
			System.out.print(i + " "); //5 2 3 2 1 
			i--;
			if (i < 1)  { // 반복문을 벗어날 수 있는 조건식을 반드시 명시
				break;    // 반복문을 벗어나는 명령문 
				
			}
				
		}
		System.out.println();
		
		
		int num = 1, sum = 0;
		while (num <= 5) {
			sum = sum +num;
			num = num +1;
			
			
		//sum = 0 = 1 => sum 1
	       //   1	2	
            //  3	3		
			
		}	
			System.out.println("1부터 5까지의 합은 = " + sum + "입니다");
		
	}	
}
