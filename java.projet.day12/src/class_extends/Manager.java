package class_extends;

public class Manager extends Employee{
	
	private int bonus;
	private String job;
	
	public Manager() {
		super();
	}
	public Manager(String name, String address, String phoneNumber, int salary, String job, int bonus) {
		// super()는 부모 클래스의 생성자 호출.
		super(name, address, phoneNumber, salary);
		this.bonus = bonus;
		this.job = job;
	}
	
	public int getBonus() {//c초기 설정이 
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setData(String name, String address ,String phoneNumber , int salary , int bonus , String job) {
		//지권 클래스이 setempDAta(); 를 통해 직원에 ㄱ정의된 필드 설정
		setData(name,address,phoneNumber,salary); //  매개변수를다음 setData 호출 
		
		
		this.bonus = bonus;
		
		this.job = job;
	}
	
	
	public String toString() {
		return "보너스=" + bonus + "직업 =" + job;
	}
	
	

}
