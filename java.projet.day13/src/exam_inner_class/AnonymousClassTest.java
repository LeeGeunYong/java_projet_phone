package exam_inner_class;

import exam_interface.RemoteControl;

public class AnonymousClassTest {
	public static void main(String[] args) {
		
		
		RemoteControl ac = new RemoteControl() {
			
		
		@Override
		public void turnOn() {
			System.out.println("TV전원켜지");
			
		}@Override
		public void turnOff() {
			System.out.println("TV전원 꺼짐");
		}
		
		public void setVolume (int volume) {}
		//이름업슨ㄴ 클래스 선언
		
		
		};
			ac.turnOn();
			ac.turnOff();
	
		
	}

}
