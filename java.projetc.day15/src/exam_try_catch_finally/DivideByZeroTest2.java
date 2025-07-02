package exam_try_catch_finally;

public class DivideByZeroTest2 {
	public static void main(String[] args) {
		int x= 1;
		int y = 0;
		try {
			int result = x/y; // 예외 발생
			System.out.println(result);
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		System.out.println("프로그램은 계속 진행 됩니다 ");
	}

}
