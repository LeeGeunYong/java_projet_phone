package class_basic;

public class Book {
	
	public String name;
	public int count;
	public String genre;
	
	
	public void BookData(String n , int c, String g ) {
		name = n;
		count = c;
		genre = g;
		
	}
	public void pintData() {
		System.out.println("책제목은= " + name + "책갯수" + "책장르= " +genre);
	}
	public void display() {
		System.out.println("책제목은= " + name + "책갯수" + "책장르= " +genre);
	}
	public String toString() {
		return "책제목은= " + name + "책갯수" + "책장르= " +genre ;
		
	}
	
	

}
