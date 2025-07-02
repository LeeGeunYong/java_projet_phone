package array;

public class ArrayTransmission {
	public static void main(String[] args) {
		/*public static void main(String[] args) {
		// 배열 선언 및 생성  
		int[] array;
		array = new int[]{ 10, 20, 30, 40, 50 };
		// 배열의 값 출력\
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}*/
		
	
		
		int[] array;
		array = getData();
		printData(array);
	}
	private static int[] getData() { 
		int[] testData = new int[]{ 10, 20, 30, 40, 50 };
		return testData;
			//return new int[]{ 10, 20, 30, 40, 50 };
			//반환    배열의 참조값
	}
		
	private static void printData(int[] array) { // int[] array = array
			for (int i = 0; i < array.length; i++) 
				System.out.print(array[i] + " ");  
	}
}