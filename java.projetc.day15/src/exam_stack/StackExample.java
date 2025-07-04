package exam_stack;

import java.util.Stack;

class Coin{
	private int value;

	public Coin (int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
		
	}
}


public class StackExample {
	
	
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // pop() 메서드 : Stack에 데이터 반환.
        while (!coinBox.isEmpty()) {//0문자열의 길이가 0인 경우에, true를 리턴합니다.
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전(pop) : " + coin.getValue() + "원");
        }
        System.out.println(coinBox.isEmpty());
    }
}