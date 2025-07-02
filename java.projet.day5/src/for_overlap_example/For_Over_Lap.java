package for_overlap_example;

public class For_Over_Lap {
	public static void main(String[] args) {
		for (int x = 1; x <=5; x++) {//포문에 포문이 있다면 안에부터실행 
			for(int y = 1; y <=5; y++) {//안에 표문이 끝나면 바깥포문에 증감이되어 
				//증감후 다시 안으로 들어와 다시실행 그리고 끝나면 다시바깥포문에 나와 증감된다
				//이런식으로 안에 포문 5번  + 바깥포문도 5번 실행 = 총25개 개값이 나옴
				//예시 :1 2 3 4 5
				//예시 :1 2 3 4 5
				//예시 :1 2 3 4 5
				//예시 :1 2 3 4 5
				//예시 :1 2 3 4 5
				
				System.out.print(y + " ");
				
			}System.out.println();
			
		
		}
		
		

		/*예제3 [결과값]
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 */
		for (int i=5 ; i >=1; i--) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		/*예제4 [결과값]
		 * 1 
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		
		for(int i = 1; i <=5; i++) {
			for(int e =1; e<=i; e++) {
				System.out.print(e + " ");
			}
		 System.out.println();
		}	
		
		
		
		
		/*예제5 [결과값]
		 * 1 2 3 4 5
		 * 2 3 4 5 6
		 * 3 4 5 6 7
		 * 4 5 6 7 8
		 * 5 6 7 8 9
		 */
		
		 for
		 
		 for
	
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
