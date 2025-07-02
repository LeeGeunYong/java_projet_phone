package interface_example;

public class CDInfo {
	private int registerNo;
	private String title;
	
	public CDInfo (int registerNo , String title) {
		this.registerNo=registerNo;
		this.title=title;
		
	}

	public int getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(int registerNo) {
		this.registerNo = registerNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
