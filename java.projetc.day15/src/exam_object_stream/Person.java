package exam_object_stream;

import java.io.Serializable;

public class Person implements Serializable  {
	
	private static final Long serialVersionUid  =1L;
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name ,  int age)  {
		this.name = name;
		this.age = age;
		
	}

	@Override
	public String toString() {
		
		return "person [이름 = " + name + ",나이 " + age + "]";
	}
	
	public String getName(){
		return name ;
	}
	
	public void setName (String name) {
		this.name= name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
