package tes_phone;

public class PhoneUnivInfo extends Phone {
	private String major;
	private int year;
	
	public PhoneUnivInfo(String name , String number , String major , int year) {
		super(name , number);
		this.major = major;
		this.year = year;
		
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("전공" + major);
		System.out.println("학년" + year);
		
	}
	
	

}
