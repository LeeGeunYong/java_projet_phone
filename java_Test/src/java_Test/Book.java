package java_Test;

public class Book {
	private String name;
	private int price;
	
	public Book() {
		
	}
	public Book(String name ,  int price) {
		this.name = name ;
		this.price = price ;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		
		return "[Book [책이름은  :  " + name + "책각격   :  " + price;
		
	}

}
