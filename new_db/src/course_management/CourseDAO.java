package course_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import subject_management.SubjectVO;

public class CourseDAO {
	//(Data Access Object)
	//=뜻(Data(예:회원정보,상품정보) ,
	//Access 접근하고 가져오고 수정하고 삭제하는일, 
	//Object 자바객체 (DB 접근을 담당하는 객체))
	//이클래스는 데이터 베이스의 테이블에 접근하여 데이터를 처리 하는 모든기능을 담당한다
	
//	* SubjectDAO 클래스 (Data Access Object)
//	 * 
//	 * 이 클래스는 데이터베이스의 subject 테이블에 접근하여 학과 정보를 처리하는 모든 기능을 담당한다.
//	 * 
//	 * 주된 기능은 다음과 같다: CRUD 프로그램 
//	 * - Create (입력): 새로운 학과 정보 추가 INSERT 
//	 * - Read   (조회): 학과 목록 조회 및 검색  SELECT
//	 * - Update (수정): 학과 정보 변경
//	 * - Delete (삭제): 학과 정보 삭제
//	 * 
//	 * 이 DAO 클래스는 실제 데이터 처리의 최종 단계로서, 
//	비즈니스 로직과 데이터베이스 간의 연결을 책임진다.
	
	
	private static final String JDBC_URL ="jdbc:oracle:thin:@127.0.0.1:1521:xepdb1";
	private static final String USER ="javauser";
	private static final String PASSWD ="java1234";
	
	
	// 자신의 클래스 를 정적으로 싱글톤으로 만든다 
	private static CourseDAO CInstance =null;


	//정적으로 싱글톤 생성 다른곳에서 new 사용 못하게
	private static CourseDAO getCIntance() {
		CInstance = new CourseDAO();
		return CInstance;
	}
	
	
	// jdbc 드라이더  jvm 에 로딩완료 
	public CourseDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
		
		
	}catch(ClassNotFoundException c) {
			c.printStackTrace();
		
	}
		
	}
	
	// 자바 디비 연동 
	private Connection getConnection()throws SQLException {
		
		Connection conn = DriverManager.getConnection(JDBC_URL,USER,PASSWD);
		
		return conn;
	}
	
	
	public List<CourseVO> getAllCourse(){
		List<CourseVO> list = new ArrayList<>();
		CourseVO coursevo = null;;	
		
		
		StringBuilder sql  = new StringBuilder();
		sql.append("SELECT NO , S_NUM , C_NAME , C_CREDIT, C_SECTION  FROM COURSE ");
		sql.append("ORDER BY NO");
		//prepare = 준비하다
		//statement = (SQL등의) 문 구문  , 절 
		//Preparestatemant =  sql문을 미리준비하다  또는 사전준비하다 
		
		try (Connection conn = getConnectionC();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());	
			ResultSet rs = pstmt.executeQuery();){
			
		
            while (rs.next()) {
                coursevo = new CourseVO();
                coursevo.setNo(rs.getInt("no"));
                coursevo.setCourseNumber(rs.getString("s_num"));
                coursevo.setCourseName(rs.getString("c_name"));
                coursevo.setCourseCredit(rs.getString("c_credit"));
                coursevo.setCourseCsection(rs.getString("c_section"));

                list.add(coursevo); // ❗ 반드시 있어야 함
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    } // ← getAllCourse 메서드 끝
	
			
	
	public boolean CourseInsert(CourseVO courseVO) {
		StringBuilder sql = new StringBuilder();
		sql.append("INSET INTO COURSE(NO,C_NUM,C_NAME,C_CREDIT,C_SECTION )");
		sql.append("VALUES(COURSE_SEQ.NEXTVAL , ? ,? )");
		
		
		try(Connection conn =  getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());){
			
			
			pstmt.setString(1, courseVO.getCourseName());
			pstmt.setString(1, courseVO.getCourseName());
			
			return pstmt.executeUpdate() ==1;
			
		}catch(SQLException s) {
			s.printStackTrace();
			return false;
		}
				
		
		
		
		
		
		
	}
	
	

} 
			
				
				
				
			
			
		
		
		
		
		