package exam_try_catch_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean valid = false;
		int number = 0;
		while (!valid) {
			try {
				System.out.print("정수를 입력해 주세요: ");
				number = scanner.nextInt();
				valid = true; 
			} catch (InputMismatchException e) {
		        System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
		        scanner.nextLine(); 
			}
		}
		System.out.println("입력받은 수:" + number);
		scanner.close();
	}
}