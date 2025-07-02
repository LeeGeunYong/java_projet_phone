package academic_management;

import subject_management.SubjectManagement;

public class AcademicManagement {
//실행 클래스 (main ()메서드를 포함 )
	public static final int SUBJECT_MANAGEMENT = 1;
    public static final int STUDENT_MANAGEMENT = 2;
    public static final int EXIT = 3;
    
	public static void main(String[] args) {
	    SubjectManagement subject = new SubjectManagement();
	    System.out.println("학사 관리 프로그램을 시작합니다..");

	    
	    
	    while (true) {
	        MenuViewer.showTopMenu();
	        int topMenuChoice = MenuViewer.menuInput();

	        switch (topMenuChoice) {
	            case SUBJECT_MANAGEMENT -> subjectMenu(subject);
	            case STUDENT_MANAGEMENT -> System.out.println("학생 관리 기능은 추후 구현 예정입니다.");
	            case EXIT -> {
	                System.out.println("프로그램을 종료합니다.");
	                return;
	            }
	            default -> System.out.println("1 ~ 3 중에서 선택해 주세요.");
	        }
	    }
	}
	
	private static void subjectMenu(SubjectManagement subject) {
		while (true) {
			MenuViewer.showSubMenu();
		    int subMenuChoice = MenuViewer.menuInput();
	
		    switch (subMenuChoice) {
			    case 0 -> {
	                System.out.println("상위 메뉴로 돌아갑니다.");
	                return;
	            }
			    case 1 -> subject.read();
		        case 2 -> subject.create();
		        case 3 -> subject.update();
		        case 4 -> subject.delete();
		        case 5 -> subject.search();
		        default -> System.out.println("0 ~ 5 중에서 선택해 주세요.");
		    }
		}
	}
}