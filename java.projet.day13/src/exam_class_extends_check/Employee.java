package exam_class_extends_check;

	public class Employee extends Person {
		
		private String dept;//부서
	
		public Employee() {
			super(); // 상위(부모) 클래스의 디폴트 생성자 호출. 명시하지 않아도 컴파일러에 의해 자동 호출.
			System.out.println("Employee 생성자 호출");
		}
		
		public Employee(String name, int age, String dept) {
			/*super(); 		  // 상위 클래스의 디폴트 생성자 호출.
			setName(name);	  // 설정자로 name 필드값 대입
			setAge(age);*/	  // 설정자로 age 필드값 대입
			
			super(name, age); // 슈퍼 클래스의 생성자 호출. public Person(String name, int age){}
			this.dept = dept;
			System.out.println("Employee(name, age, dept) 생성자 호출");
		}
		
		public String getDept() {
			return dept;
		}
	
		public void setDept(String dept) {
			this.dept = dept;
		}
		
		@Override
		public String toString() { //메서드 오버라이딩
			return super.toString() + ":" + dept; // 상위클래스에 toString 값을 반환한다 
		}
}