package class_array;

public class Phone {
	private String name;
	private String company;
	
	public Phone () {//디폴트 생성자 (매개변수를 가지고있지 않은 생성자)
	}
	public Phone(String name, String company) {//생성자 (매개변수를 가지고있는 생성자)
		
	}
	public void printData() {//필드 값출력 메서드
		//System.out.println("핸드폰명 :" + name + " 제조사명 :" + company);
		System.out.printf("핸드포명:%10s\t제조상명:%s\n" , name , company);
		
	}
	
}
