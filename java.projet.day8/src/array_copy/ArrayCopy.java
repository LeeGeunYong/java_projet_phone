package array_copy;

public class ArrayCopy {
	public static void main(String[] args) {
		//1.예제
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray,0,newStrArray,0 ,(oldStrArray.length));
		
		for (int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]);
			if(i<newStrArray.length-1) {
				System.out.print(", ");
				
			}
			
		}System.out.println("\n");
		
		//2.예제
		int myArray[] = {100,200,300,400,500,};
		int array [] = {10,9,8,7,6,5,4,3,2,1,};
		
		
		System.out.println("<==myArray의 배열값==>");
		for(int i = 0; i<myArray.length; i++) {
			System.out.print(myArray[i] + " ");
			
		}
				
		System.out.println();
		System.arraycopy(myArray,0 , array,0, myArray.length);
		
		System.out.println("<==arracopy result ==>");
		for(int j =0; j < array.length;j++) {
			System.out.print(array[j] +  " ");
		}
		
	}

}
