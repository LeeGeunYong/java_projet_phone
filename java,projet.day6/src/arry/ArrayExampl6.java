package arry;

public class ArrayExampl6 {
	public static void main(String[] args) {
		
//		//q배열에 대입된 점수에 해당하는 막대 그래프를 다음과 같이 출력 
//		//참고 ■ 
		
//		실행경과
//		90점 : ■ ■ ■ ■ ■ ■ ■ ■ ■ 9
//		20점 : ■ ■ 
//		50점 : ■ ■ ■ ■ ■ 	
//		70점 : ■ ■ ■ ■ ■ ■ ■ 	
//		65점 : ■ ■ ■ ■ ■ ■
//		90점 : ■ ■ ■ ■ ■ ■ ■ ■ ■
//		100 : ■ ■ ■ ■ ■ ■ ■ ■ ■ ■
//		43점 : ■ ■ ■ ■
//		55잠 : ■ ■ ■ ■ ■ 
//		87점 : ■ ■ ■ ■ ■ ■ ■ ■	
		
//		int[] score = new int[] {90,20,50,70,65,90,100,43,55,87};
//		int graphSize = 0;
//		
//		
//		for (int i = 0; i <score.length; i++) {
//			
//			
//			graphSize = score[i]/10 ;
//			
//			System.out.printf("%3d점:\t", score[i]);
//			
//			for(int j = 0; j < graphSize; j++) {
//				System.out.print("■ ");
//			}
//			
//			System.out.println();
//			
//			
//			
//			 
//		}
//		
//		
//		System.out.println( );
		
		
		int[] score = new int[] {90,20,50,70,65,90,100,43,55,87};
		int graphSize = 0;
		
		
		for (int i = 0; i <score.length; i++) {
			
			
			graphSize = score[i]/10 ;
			
			System.out.printf("%3d점:\t", score[i]);
			
			for(int j = 0; j < graphSize; j++) {
				System.out.print("■ ");
			}
			
			System.out.println();
			
			
			
			 
		}
		
		
		System.out.println( );
		
	}	
}
