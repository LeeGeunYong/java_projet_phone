package subject_management;

import java.util.List;

import academic_management.MenuViewer;

//학과 정보 테이블 (입력 ,수정, 삭제 ,조회)를
//처리하느 메서드로 구성 

public class SubjectManagement {  
//학과테이블에 사용자로 하여금 데이터를 입력 받아   , (입력 ,수정, 삭제 ,조회)를
	//처리하느 메서드로 구성 
private SubjectDAO dao = SubjectDAO.getInstance();
    
    public void read(){
    	List<SubjectVO> list = dao.getAllSubjects();
    	System.out.println("\n**** subject 테이블 데이터 출력 ****");
    	System.out.println("번호\t학과번호\t학과명");
    	
    	if (list.isEmpty()) {
            System.out.println("학과 정보가 존재하지 않습니다.");
        } else {
    		list.stream().forEach(subjectVO -> System.out.println(subjectVO));
        }//.stream() api에서 제공하는 기능 컬렉션을 반복문을 사
    }
    private SubjectVO inputData(String mode) {
        String s_num = null;
        String s_name = null;

        switch (mode) {
            case "insert" -> {
                System.out.print("학과코드 자동 생성 : ");
                s_num = dao.getSubjectNumber();
                System.out.println(s_num);
                System.out.print("학과명 입력 : ");
                s_name = MenuViewer.keyboard.nextLine();
            }
            case "update" -> {
                System.out.print("수정할 학과코드 입력 : ");
                s_num = MenuViewer.keyboard.nextLine();
                System.out.print("수정할 학과명 입력 : ");
                s_name = MenuViewer.keyboard.nextLine();
            }
            case "delete" -> {
                System.out.print("삭제할 학과코드 입력 : ");
                s_num = MenuViewer.keyboard.nextLine();
            }
            case "search" -> {
                System.out.print("검색할 학과명 입력 : ");
                s_name = MenuViewer.keyboard.nextLine();
            }
        }

        return new SubjectVO(0, s_num, s_name);
    }
    
    public void create() {
        SubjectVO vo = inputData("insert");
        boolean result = dao.subjectInsert(vo);
        System.out.println(result ? "학과 데이터 입력 성공." : "학과 데이터 입력 실패.");
    }

    public void update() {
        SubjectVO vo = inputData("update");
        boolean result = dao.subjectUpdate(vo);
        System.out.println(result ? "학과 데이터 수정 성공." : "학과 데이터 수정 실패.");
    }

    public void delete() {
        SubjectVO subjectVO = inputData("delete");
        int studentCount = dao.studentDataCheck(subjectVO);

        if (studentCount > 0) {
            System.out.println("소속된 학생이 있어 학과 데이터를 삭제할 수 없습니다.");
            return;
        }
        
        System.out.print("입력하신 학과번호로 삭제하시겠습니까?[삭제시 예, 취소시 아니오]");
    	String confirm = MenuViewer.keyboard.next();
    	MenuViewer.keyboard.nextLine(); 
        
    	if(confirm.equals("예")) {
            boolean result = dao.subjectUpdate(subjectVO);
            System.out.println(result ? "학과 데이터 삭제 성공." : "학과 데이터 삭제 실패.");
        } else {
            System.out.println("삭제가 취소되었습니다.");
        }
    }

    public void search() {
        SubjectVO subjectVO = inputData("search");
        System.out.println("검색 단어 :" + subjectVO.getSubjectName());

        List<SubjectVO> list = dao.getSubjectSearch(subjectVO.getSubjectName());
        System.out.println("번호\t학과번호\t학과명");
        
        if (list.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            list.forEach(svo -> System.out.printf("%d\t%s\t%s%n", 
            		svo.getNo(), svo.getSubjectNumber(), svo.getSubjectName()));
        }
    }
}