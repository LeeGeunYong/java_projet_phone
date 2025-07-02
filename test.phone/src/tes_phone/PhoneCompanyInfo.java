package tes_phone;

public class PhoneCompanyInfo extends Phone {
	private String company;
	
	
	public PhoneCompanyInfo(String name , String number , String company) {
		super(name, number);
		this.company  =company; 
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("회사" +   company);
	}
	
	

}
