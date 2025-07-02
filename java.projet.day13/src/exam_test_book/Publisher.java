package exam_test_book;

public class Publisher {
	private String publisherName; //출판사이름
	private String countryName; // 국적 이름
	
	public Publisher() {}
	
	public Publisher(String publisherName , String countryName ) {
		this.publisherName= publisherName;
		this.countryName = countryName;
	}
	
	
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	

}
