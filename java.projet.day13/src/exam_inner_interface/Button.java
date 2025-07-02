package exam_inner_interface;

public class Button {
	OnClickListener  listener;  //인터 페이스 ...변수
	
	
	
							//인터페이스 ///  참조 변수     new 구현클래스생성자();대입
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch () {
		listener.onClick();
		// 잠조변수명, 오버라이딩되 메서드 호출
	}
	interface OnClickListener {
		void onClick(); // CallListener 클래스의 onclick() 메서드 호출
	}

}
