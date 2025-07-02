package exam_test;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 56);
		p.showInfo();
		
		Student s = new Student("하늘봄" , 41 , 99010001);
		s.showInfo();
		
		ForeignStudent f = new ForeignStudent("Olivia" , 39 , 97060004 , "U.S.A");
		f.showInfo();
		
		
	}

}
