package break_exam;

public class BreakTest {
	public static void main(String[] args) {
		int i; 
		i = 5;
		
		System.out.println("count down start!");
		
		while (true) { //
			 if (i==0) {
				break;
			}
			System.out.println(i);
			i--;
			
		}
	}

}
