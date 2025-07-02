package class_basic;

public class Employee{
	public String name;
	public String phoneNumber;
	public int salary;
	
	public void employeeData(String nNum, String p,  int sal) {
		name = nNum;
		phoneNumber = p;
		salary = sal;

	}
	
	public String toString() {
		return "직원정보 [사원명 = " +name + " ,전화번호 = " + phoneNumber + ", 급여 = " + salary + "]";
				
	}

}
