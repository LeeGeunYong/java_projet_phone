package exam_test_class4;

import java.util.Scanner;

public class MonthScheduleTest {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		
		MonthSchedule october = new MonthSchedule(days); // 6월달의 할 일
		october.run();
	}
}