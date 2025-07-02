package method;
class primitiveSwap{
	public void asd(int x , int y) {//기초형 전달 
		
		System.out.println("\nBeforex = "+ x+ " y = " + y);
		int  temp =x;
		x = y;
		y = temp;
		System.out.println("After  Change x = " + x +  "y =" + y); 
		
	}
	
}


public class privitiveSwapTest {
	public static void main(String[] args) {
		primitiveSwap ps = new primitiveSwap ();
		
		int x = 10;
		int y = 20;
		System.out.println("\n호출전 main x = " + x + " y =" + y);
		ps.asd(x,y);
		System.out.println("\n호출전 main x = " + x + " y =" + y);
	}

}

//기초형은 값는게 맞지만