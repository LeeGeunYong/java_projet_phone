package exam_lambda;
interface NumberFunction {
	int sum(int n);
}

public class LambdaExample04 {
	public static void main(String[] args) {
		NumberFunction number = (n) -> {
			int result = 0;
			for(int i=1; i<=n; i++) {
				result += i;
			}
			return result;
		};
		
		System.out.println("1부터 10까지의 합 : " + number.sum(10));
		System.out.println("1부터 100까지의 합 : " + number.sum(100));
		
		NumberFunction numberSum = new NumberFunction() {

			@Override
			public int sum(int n) {
				int total = 0;
				for(int i = 0; i<=n ; i++) {
					total += i;
				}
				return total;
				
			}
			
		};
		System.out.println();
		
		
		interface interfaceExample1 {
			void print();
		}
		interfaceExample1 in2 = () -> { System.out.println("람다식"); };
		in2.print();
	}
}