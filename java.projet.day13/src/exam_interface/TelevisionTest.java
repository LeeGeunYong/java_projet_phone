package exam_interface;

public class TelevisionTest {
	public static void main(String[] args) {
		// RemoteControl rc = new RemoteControl();
		// 인터페이스     참조변수 = new 생성자() x
				
		
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.turnOff();
		tv.printChannel();
		System.out.println();
		
		//인터페이스 적용
		System.out.println("=======다현성의 의해 데이터 출력");
		RemoteControl rc = new Television(); // 업캐스팅 
		rc.turnOn();// // 인터페이스의 선언된 메서드 접근가능.RemoteControl (turnOn , turnOFf , setVolume)
	//	rc.printChannel(); // 리모콘클래스에 프린트채널 메소그가 없어서 못불러옴 
		((Television) rc) .printChannel();//그래서 구현클래스에서 만들어져있는 메서를 가졍기 위해서
		rc.turnOff();						// 다운캐스팅을 해줘야함
											//다운캐스팅 하는법 
		
		//2가지가 있음 위에 프린트 채널같이 하는경우
		//((Television) rc) .printChannel();
		
		//변수를 하나만들어 ()형변환으로 기입하는방법
		//Television a1 = (Television) rc;
//			System.out.println(a1.printChannel); 
//			a1.printChannel();           
//		//서브클래스 참조변수 = (서브클래스)인터페이스 또는 부모클래스 참조변수;

        // Radio 클래스의 인스턴스 생성
		
		tv.steMute(true);
		RemoteControl.changeBattery();
		
		
     	
	}
}