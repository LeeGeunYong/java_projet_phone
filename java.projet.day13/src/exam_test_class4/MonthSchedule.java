package exam_test_class4;

import java.util.Scanner;

public class MonthSchedule  {
	
	private  int totalDays;
	private  Day day[];
	
	
	 Scanner sc = new Scanner(System.in);
	
	public MonthSchedule (int totalDays  ) {
		this.totalDays = totalDays;
		
		day = new Day[totalDays];
		for(int i =0; i <totalDays; i++) {
		
			day[i] = new Day();   
		
		}
		 
	}
		
	
	
	
	
	public void input( ) {
		System.out.println("입력: ");
		
		
	}
	
	public void view() {
		System.out.println("보기: ");
	}
	
	public void finish() {
		System.out.println("끝내기: ");
	}
		
	
	
	public void run() {
	
		 System.out.println("할일" + "(입력:1, 보기:2 , 끝내기:3 ");
		 int workNum = sc.nextInt();
		 if(workNum == 1) {
			 input();
		 }else if(workNum == 2) {
			 view();
		 }else if (workNum ==3) {
			 finish();
		 }else  {
			 System.out.println("잘못된 입력입니다");
		 }
			
		 
			 
		 
	}
		
	
	
	//MㅐnthSchedule  월간 일정표 한달의 스케줄
	// run 실행하다 돌리다
	// inputinput() 입력하다 
			//view 보기
	// finish() 끝내다 
	

	

}
