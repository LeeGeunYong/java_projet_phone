package class_example;

public class Count {
	private static int totalCount;
	private int count;
	
	//생성자 
	public Count() {
		totalCount++;
		count++;
		
	
	}
	public void display() {
		System.out.println("count: " + count);
		System.out.println("totalCount: "+totalCount);
		
		System.out.println();
	}
}