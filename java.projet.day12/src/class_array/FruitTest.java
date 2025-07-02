package class_array;

public class FruitTest {
	public static void main(String[] args) {
		Fruit[] f = {
				new Fruit("banana", 4800),     // f[0]
				new Fruit("strawberry", 21000),// f[1]
				new Fruit("persimmon", 19000), // f[2]
				new Fruit("cherry", 12000)     // f[3]
		};
		
		int totalPrice = 0;
		for(int i=0; i<f.length;i++) {
			totalPrice += f[i].getPrice();
		}
		int savePrice = (int) (totalPrice * 0.15);
		
		System.out.println("============= 과일구입 목록 ==========");
		// 확장 for문의 형식 : for(자료형 변수명 : 배열명) { } 
		// for(Fruit ft : f) {
		//	System.out.println(ft.toString());
		//}
		
		for(int i=0; i < f.length; i++) {
			Fruit ft = f[i];
			System.out.println(ft.toString());  // ft 정보로 투스트링을 호출하겠다
		}
		System.out.println("---------------------------------");
		System.out.printf("총금액 : %d원", totalPrice);
		System.out.printf("\n할인후 결제 금액 : %d원" , (totalPrice - savePrice));
		
	}

}