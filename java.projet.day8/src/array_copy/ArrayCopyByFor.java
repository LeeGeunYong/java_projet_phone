package array_copy;

import java.util.Arrays;

public class ArrayCopyByFor {
	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int [5];
		
		for(int i =0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; 
			
		}
		
		System.out.println("[Arrays.toString(newIntArray");
		System.out.println(Arrays.toString(newIntArray));
		
		System.out.println("\n[for문을 이용하여 출력]");
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
			
			if(i<newIntArray.length-1) {
				System.out.println(" ");
			}
		}
	}

}
