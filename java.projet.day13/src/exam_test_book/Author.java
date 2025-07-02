package exam_test_book;

public class Author {
	private String authorName;
	private int authorAge;
	
	public	Author () {}

	public	Author (String authorName ,int authorAge) {
		this.authorName = authorName;
		this.authorAge= authorAge;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAuthorAge() {
		return authorAge;
	}
	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}
	

	
	

}
