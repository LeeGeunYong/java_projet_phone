package if_;

import java.util.Scanner;

public class fififfi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세여 ");
		int num = sc.nextInt();
		int sum=0;
		int i = 0;
		
		while(num >i) {
			sum += i;
			i++;
			
		}System.out.println("1부터 10까지 더한합은" + sum + "입니다");
		sc.close();
		
		
	}

}
