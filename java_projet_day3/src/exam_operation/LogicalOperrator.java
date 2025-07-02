package exam_operation;

public class LogicalOperrator {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		System.out.println((x == 3 ) && (y == 7));// 논리곱 && and):이고
		System.out.println((x ==3 ) || (y == 4));// 논립합 ||,or):dlrjsk . ~또
		boolean result = (++x == 3) && (y++ == 7);
		
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("result= " + result);
		
		//추가적으로 논리연산자 보고 진행
	
		
		
	}
}
