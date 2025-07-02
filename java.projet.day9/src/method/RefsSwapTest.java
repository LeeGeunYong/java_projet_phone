package method;
class RefsSwap{
	public  int x ;
	public void change(RefsSwap rs2) { //  실행문에 rs.change(rs); 에서  (rs2 에  다가 주소값이 전달됨
		System.out.println("Before Change x = " + rs2.x);
		rs2.x = 200;
		System.out.println("After Change x = " + rs2.x);
		
	}
}

public class RefsSwapTest {
	public static void main(String[] args) {
		RefsSwap rs = new RefsSwap(); //  참조변수 rs는 주소값을 뜻함
		rs.x = 10;
		System.out.println("Main Before calling x = " + rs.x);
		
		rs.change(rs); // rs 주소값을 클래스 선언한 rs2 주소값을 넣어줌 
		System.out.println("\n main afer calling x = " + rs.x);
	}

}



//클래스 참조변수는 주소 값을 주는거임