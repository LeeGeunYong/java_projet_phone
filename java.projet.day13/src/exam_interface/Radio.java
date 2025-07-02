package exam_interface;

public class Radio implements RemoteControl{
	private int volume;
	private int channel;
	
	@Override
	public void turnOn() {
		System.out.println("Radio 를 켰다");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Radio를 껐다");
		
	}
	@Override
	public void setVolume(int volume) {
		
		
		
	}
	
	
	
	
}
