package exam_runtime_exception;

public class RuntimeExceptionCase {
	
	public static void main(String[] args) {
		
		
		// RuntimeException 종류 - 비체크 예외.
		// ArrayIndexOutOfBoundsException 예외 발생
	
	try {
		int[] arr = new int[3];
		arr[4] = 20;
		// arr배열 크기가 3개인데 없는 4번째 자리에 20을 넣으라고 해서
		
	}catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		String s= (String) x;
	}
	// ClassCastException 예외 발생   클래스 변환에대한 예외발생
	try {
		Object x = Integer.valueOf(0);
		
		System.out.println((String)x);
		// 인티져가 오브젯 x에 들어가 x는 인티져라서 스트링으로 형변환이 안돼지
		
	}catch(ClassCastException  e) {
		e.printStackTrace();
	}
	
	
	//NegativeArraySizeException 예외 발생
	
	try {
		int[] arr = new int [-10];
		System.out.println(arr.toString());
		
	}catch (NegativeArraySizeException e) {
		e.printStackTrace();
		
	}// NullPointerException 예외 발생
	try {
		String str = null;
		@SuppressWarnings("null")
		int len = str.length();
		System.out.println(len);
	} catch (NullPointerException e) {
		e.printStackTrace();
	}

	// NumberFormatException 예외 발생
	try {
		String data1 = "100"; // -> 100
		String data2 = "a100";// -> X

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);

		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}


	
	}
	
	
}
