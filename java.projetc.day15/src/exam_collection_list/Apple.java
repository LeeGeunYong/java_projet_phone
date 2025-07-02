package exam_collection_list;

public class Apple {
	
	private String kind;// 품종
	private String color;// 색상
	
	
	public Apple() {
		
	}
	

	public Apple(String kind , String color){
			this.kind = kind;
			this.color= color;
			
	}		
	public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "Apple [품종 : " + this.kind + ", 색상 : "+ this.color + "]";
		    }
}
