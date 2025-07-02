package exam_interface;

public interface RemoteControl {
	
	//상수형 필드   public static final int MAX_VOLUME  = 32;
	int MAX_VOLUME = 32;  // 제어관리자 , 제어자 ,상수 없이 도 사용 가능
	int MIN_VOLUME =0;
	
	
	//추상메서드
	public abstract void turnOn();
	public abstract void turnOff();
	// public abstract 없이도 사용가능
	void setVolume(int volume);
	
	//디폴트 메소드  중괄호를 사용함 !!!!!!!!!재정의 해야함
	public default void steMute(boolean mute) {
		if(mute) {
		System.out.println("무음 처리 합니다");
	}else { 
		System.out.println("무음 해체 합니다");
	}
		
		
	}// 정적메소드 선업및 재정의
	public static void changeBattery() {
		System.out.println("건전지 교환합니다");
	}
	
}

