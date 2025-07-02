package array_in_array;

import java.util.Scanner;

public class ArrayExampl1 {
	public static void main(String[] args) {
		//간단한 극장 예약 시스템을 작성하여 보자.
		//아주 작은 극장이라 자석이 10개박에 안된다.
		//사용자가 예약을 하려고 하면 먼저 좌석 배치룔 보여준다
		// 즉예약이 끝난 좌석은 1로 예약이 안된 조석은 0으로 나타낸다
		int[] seat1 = new int [10];
		int[] seatNumber = {1,2,3,4,5,6,7,8,9,10};
		int number ;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("\n---------------------");
		
		System.out.println();
		for(int i = 0 ; i <seatNumber.length; i++) {
			System.out.print(seatNumber[i]+ " ");
		}
	
		System.out.println("\n---------------------"); 
		
		for(int i = 0; i <seat1.length; i++) {
			
			System.out.print(seat1[i]+" ");
		}
		System.out.println("\n---------------------"); 
		System.out.println();
		
			
			
			System.out.println("원하는 좌석을 입력해주세요 (종료는 -1): ");
			number = sc.nextInt();
			
			if ( number == -1) {
				System.out.println("예약되었습니다");
			}	seat1[number-1] = 1;

			System.out.println("원하는 좌석을 입력하세요 (종료는-1): ");
			number = sc.nextInt();
			
			
				
			
		}
		
	}

}
