package tes_phone;

import java.util.Scanner;

public class PhoneBookManager {
	private Phone[] phoneInfo ;
	private Scanner keyboard;
	private int count ;
	private final int MAX_NUM=100;

	public PhoneBookManager() {
		phoneInfo = new Phone[MAX_NUM];
		
		count = 0;
		keyboard = new Scanner(System.in);
		
		
	}
	
	public Phone personData() { //일반정보
		System.out.print("이름");
		String name = keyboard.nextLine();
		
		System.out.print("전화번호");
		String number = keyboard.nextLine();
		
		return new Phone(name,number);
	}
	
	public PhoneUnivInfo univData() { //학교정보
		System.out.print("이름");
		String name = keyboard.nextLine();
		System.out.print("전화번호");
		String number = keyboard.nextLine();
		System.out.print("전공");
		String major = keyboard.nextLine();
		System.out.print("학년");
		int year = keyboard.nextInt();
		keyboard.nextLine();
		return new PhoneUnivInfo(name,number,major,year);
	}
	public PhoneCompanyInfo companyData() { //회사정보
		System.out.print("이름");
		String name = keyboard.nextLine();
		System.out.print("전화번호");
		String number = keyboard.nextLine();
		System.out.print("회사");
		String company = keyboard.nextLine();
		return new PhoneCompanyInfo(name,number,company);
	}
	
	
	
	public void searchData() {//  검색
		System.out.println("검색할 이름을 입력");
		String name = keyboard.nextLine();
		
		for(int i =0; i <count; i++) {
			if(phoneInfo[i].getName().equals(name)) {
				phoneInfo[i].showInfo();
			}
			System.out.println("데이터의 검색이 완료되었습니다");
		}
		
		
		
		
	}
	public void deleteData() {//삭제
		System.out.println("삭제할 이름 입력");
		String name = keyboard.nextLine();
		
		
		int indax= -1;
		for(int i = 0; i <count; i++) {
			if(phoneInfo[i].getName().equals(name)) {
				indax = i;
	            break;
	        }
	    }

	    if ( indax == -1) {
	        System.out.println("해당 이름의 데이터가 없습니다.\n");
	    } else {
	        // 삭제: 뒤의 데이터를 앞으로 당김
	        for (int i = indax; i < count - 1; i++) {
	            phoneInfo[i] = phoneInfo[i + 1];
	        }

	        phoneInfo[count - 1] = null; // 마지막 항목 제거
	        count--; // 총 개수 감소

	        System.out.println("데이터가 삭제되었습니다.\n");
	    }
	}
	
	public void inputData() {//정보를 입력받다
		
		System.out.println("데이터를 입력을 시작합니다"); 
		System.out.println("1.일반 , 2. 대학, 3.회사");
		System.out.println("선택>>1");
		System.out.println("데이터입력을 시작합니다");
		
		int save = keyboard.nextInt();
		keyboard.nextLine();
		Phone info =null;
		
	switch(save){
	
		case 1 : 
			info = personData();
		break;
		
		case 2 : 
			info = univData();
		break;
		
		case 3 : 
			info = companyData();
		break;	
	}	
		phoneInfo[count++] = info;
	System.out.println("데이터의 입력이 완료되었습니다.");
	
	}
	
	public void finishData() {
		System.out.println("프로그램 종료");
	}
		

}



    
