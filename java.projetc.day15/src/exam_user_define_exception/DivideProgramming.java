package exam_user_define_exception;

//사용자 정의 예외 클래스 선언

@SuppressWarnings("serial")
class DivideByZeroException extends Exception {
	
	//class DivideByZeroException extends ArithmeticException { 
	// class 사용자 정의 예외 클래스 extends 예외 클래스명 { }
	
	private String msg;
	
	public DivideByZeroException() {
		
	}
	
	public DivideByZeroException(String msg) {
		this.msg = msg;
		
	}
	
	public String getMessage() {
		
		if(msg == null) {
			return "0으로 나눌수 없음.";
		}else {
			return msg;
		}
		
	}
	
	
}

public class DivideProgramming {
	

	public static void main(String[] args) {
		double result;
		
		try {
			result = quotient(1 , 0);
			System.err.println(result);
			
			
		}catch(DivideByZeroException e ) {
			System.out.println(e.getMessage());
			//System.out.println("e.toString");
		}
		
	}

	private static double quotient(int n, int d) throws DivideByZeroException { 
		if(d == 0)//예외상황
			throw new DivideByZeroException();// 예외 객체 생성
		return (double) n /d;	

	}

}







