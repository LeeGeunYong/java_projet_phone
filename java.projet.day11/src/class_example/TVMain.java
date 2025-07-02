package class_example;
// TV 클래스를 정의하고자 한다
//  제조사(manufacturer), 만든 년도(year), 인치(size)를 필드로 가진다
//  생성자, 설정자, 접근자, 출력 메서드를 정의한다.
//  
// [출력 예시]
//  LG에서 만든 2021년형 65인치 TV
// 
public class TVMain {
	public static void main(String [] args) {
		TV myTV = new TV("LG", 2021, 65); // LG에서 만든 2021년 65인치
		myTV.show();
		
		TV tv = new TV();
		tv.setManufacturer("삼성");
		tv.setYear(2023);
		tv.setSize(35);
		tv.show();
	}
}