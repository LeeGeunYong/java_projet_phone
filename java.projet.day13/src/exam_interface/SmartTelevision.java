package exam_interface;

public class SmartTelevision implements RemoteControl , Searchable {
	private int voume;

	@Override
	public void turnOn() {
		System.out.println("스마트 티비 켜짐");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 티비 꺼짐");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volum > RemoteControl.MIN_VOLUME) {
			this.
		}
		
	}

	@Override
	public void search(String url) {
	
		
	}

}
