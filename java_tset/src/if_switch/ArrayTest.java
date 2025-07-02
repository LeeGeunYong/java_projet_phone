package if_switch;

public class ArrayTest {
	public static void main(String[] args) {
	// 0번째,1번째 의 들어가있는 값 불러오기 
		double[] add = new double[2];
		for(int i = 0; i <2; i++) {
			System.out.println("add["+ i +"] = " + add[i]);
	
		}System.out.println();
		
		String[] s = new String[3];
		
		s[0] = "java";
		s[1] = "22";
		s[2] = "33";
		
		for (int i = 0; i<3; i++) {
			System.out.println("s["+ i +"] = " + s[i]);
			
		}
		
	}	
}
