package class_array;

public class Fruit {
	private String fname;
	private int	price;
	
	
	public Fruit () {}// 디폴트 생성자
	
	
	public Fruit (String fname , int price) {//필드에 값초기화해주기위해
		this.fname = fname;
		this.price = price;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getPrice () {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toSting() {
		return "과일명:" + fname + " 가격 " + price;
	}

	
}
