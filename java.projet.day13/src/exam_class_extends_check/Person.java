package exam_class_extends_check;

public class Person {
	
	private String name;
	private int age;
	
	//생성자 오버로딩 
	public Person() {//디폴트 생성자 
		System.out.println("person 생성자 호출");
		
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age =age ;
		System.out.println("person(name,age)생성자호출"); 
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}
	


}
