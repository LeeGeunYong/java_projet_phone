package exam_inner_interface;

public class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}

