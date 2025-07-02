package arry;

public class ArrayInArray {
	public static void main(String[] args) {
		//1.예제1
		//2차원배열
		//자료형 [][] 배열명 = new 자료형[행의 요소][열의요소];
		//행 , 열 의 크기가 몇인지 확인한 코드
		int[][] arr = new int[2][3];
		System.out.println("배열에 행의수" + arr.length);
		
		System.out.println("배열에 행에 열의 수 " +arr[1].length);
		
		System.out.println("===========예제2");
		//예제2
		//초기화 
		int[][] arr2 =new int[][] {{10,20,30,} , {40,50,60,}};
		//int[][]arr2 = {{10,20,30,} , {40,50,60,}};  이렇게도 가ㄴㅇ
//		/ 0열	1열 	  2열
//	ㅇ행	 10		20    30
//	1행   40     50   60
		
		
		for (int i = 0 ; i< arr2.length;i++) {
			for(int j = 0; j< arr2[i].length; j++) {
				System.out.printf("%5d" , arr2[i][j]);
				
			}
		}
		System.out.println();
		System.out.println("===========예제3");
		
		int[][] arr3 = new int [2][];
		arr3[0]	= new int[] {1,5};
		arr3[1] = new int[3];
		
		for(int i = 0; i<arr3.length; i++) {
			for(int j =0; j < arr3[i].length; j++) {
				
					System.out.print("arr3["+ i +"]["+ j +"]=" + arr3[i][j] + " ");
				}System.out.println();
		}
			System.out.println();
			
			System.out.println("===========예제4");
			//4.예4
			//5*5 2차원 배열에 1~25로 출력 하여 화면에 출력
			int[][] array = new int[5][5];
			//배열초기화
			for(int i = 0 ,num=0; i<array.length; i++) {//array.length행의 갯수
				for(int j = 0 ; j< array[i].length; j++) {//array[i].length 열의갯수
					array[i][j] = num++;
					
				}
				 
			}
			 System.out.println();
		
			 
			 
			 //2차원 2배열 데이터 출력하기
			 for (int i =0; i<array.length; i++) {
				 for(int j = 0; j < array[i].length; j++) {
					 System.out.printf("%2d" , array[i][j]);
 
				 }	 System.out.println();
			 }
			 System.out.println();
			 // 합구기
			 int total = 0;
			 for (int i =0; i <array.length; i++) {
				 for (int j =0; j <= i; j++) {
					 //System.out.println(array[i][j] + " ");
					 total = array[i][j];
		
				 }
				
			 }
			 System.out.println("합계 :" + total);
			 System.out.println();
	}
}
