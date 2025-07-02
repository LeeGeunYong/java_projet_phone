package arry;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		int num ; 
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력해주시오:");
		num = sc.nextInt();
		
		
		while (num < 3 && num%2==0) {
			System.out.println("다시입력하세요");
			num = sc.nextInt();	
		}int[] arr = new int[num];
		for (int i=0; i<num/2+1; i++) {
			arr[i] = i+1;
			
			
		}for (int i =num/2+1; i <arr.length; i++ ) {
			 arr[i] = arr[i-1]-1;
			 
		}
		for(int o : arr) {
			System.out.print(+ " ");
		}
			
		
		
		
		
		
		
	
		
			
		
			
				
				
			
			
			
		
			
	}	
			
}


