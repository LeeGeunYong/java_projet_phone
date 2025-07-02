package exam_emam_switch;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("카푸치노, 아메리카노, 에스프레소 , 카페라떼");
		String order = input.next();
		
		input.close();
		
		
		int price = 0;
		switch (order) {
			case "카푸치노":
			case "카페라떼":
				
				price = 3500;
				break;
				
			case "에스프레소":
			case "아메리카노":
				
				price = 2000;
				break;
				
			default:
				
				System.out.println("없습니다.");
				
				

				
			}
			
			if (price != 0) {
				System.out.println(order + "는" + price + "원 입니다.");	
		}
		
		
		
		
	}

}
