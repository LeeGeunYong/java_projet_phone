package method;

public class Calculator {
	public int plus(int x , int y) {
		int result = x + y;
		return result;
		
		
	}
	public int minus(int x , int y) {
		int result = x - y;
		return result;
		
	}
	public int multiply (int x, int y) {
		int result = x * y;
		return result;
	}
		
	public int divide(int x ,int y ) {
		int result = x / y ;
		return result;
		
	}
	public int plus(int x, int y, int z) {
		int result = x + y + z;
		return result;
	}
	public int plus(int x , int y ,int a, int b){
		int result = x+y+a+b;
		return result;
		
	}
	public int plus(int x , int y ,int a, int b ,int c) {
		int result = x + y + a + b + c;
		return result;
	}
	public int plus(int[] numBers) {// int[] numBers = num2
		int sum =0; // 지역변수
		for (int i = 0; i< numBers.length; i++) {
			sum+= numBers[i];
		}
		return sum;
	
	}
	public int sum(int... values) {// 가변길이의 메서드 
		int total = 0;
		for(int i=0; i< values.length; i++) {
			total = values[i];
			
		}
		return total;
	}
	
	
}		
