package exam_test_car;

public class Monata extends Car{
	
	private String series; //  시리즈
	private String use;  // 용도
	
	public Monata() {}
	
	public Monata(String color , int account  , String use , String series) {
		super(color,account);
		this.series = series;
		this.use = use;	
		
	}
	@Override
	public String toString() {
		
		return  super.toString() +		"[용도]" + use +"[시리즈]" + series; 
	}
	

}
