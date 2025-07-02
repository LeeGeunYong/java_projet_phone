package exam_collections;

class Fruit  implements Comparable<Fruit>{
	
	private String name;
	private int price;
	
	
	public Fruit(String name , int price) {
		this. name=name;
		this. price= price;
		
	}

	@Override
	public int compareTo(Fruit o) { //정렬을 할때 기준점이 price
		if(price < o.price) return -1;
		else if(price == o.price) return 0;
		else return 1;
		
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
	
	public String soString() {
		return "과일명" + name + " 가격 "  + price + "입니다 "; 
	}
	
	
	
	
	
	
	

}
