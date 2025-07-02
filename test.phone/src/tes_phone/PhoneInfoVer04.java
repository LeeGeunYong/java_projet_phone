package tes_phone;

public class PhoneInfoVer04 {
	
	public static void main(String[] args) {
		PhoneBookManager m = new PhoneBookManager();
		
		int choice;
		while(true) {
			
			MenuViewer.showMeun();
			
			choice = MenuViewer.keyboard.nextInt();
			
			
			if(choice == 1) {
				m.inputData();
				
			}else if(choice == 2 ) {
				m.searchData();
			}else if(choice == 3 ) {
				m.deleteData();
			}else if(choice == 4) {
				m.finishData();
				break;
			}else
				System.out.println();
					
			
			
		}
		
	}


}
