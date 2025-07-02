package subject_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubjectDAO {
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
	
	
	
	//데이터베이스 연결 관련 상수 선언   // Oracle DB에 연결하기 위한 주소, 계정, 비밀번호
	//jdbc 프로토콜시작 ,dbms종류 오라클 , thin접송방식 드라이버 , 접속할디비서버에 ip주소 내컴퓨터, 오라클 DB가 열려 있는 포트 번호 ,연결할디비 이름(pdb이름)
	//JDBC URL -> java 디비 연결주소
	//어느DB에 누구계정으로 접속할지를 정의
	private static final String JDBC_URL = "jdbc:oracle:thin:@127.0.0.1:15"+ "21/xepdb1";
	private static final String USER = "javauser";
	private static final String PASSWD = "java1234";
	
	
	// 클래스 자신의 타입으로 정적 필드 선언
	private static SubjectDAO instance = null;
	
	//외부에서 호출할 수 있는 정적 메소드인 getInstance() 로 선언 하여 인스턴스를 반환.
	// 메모리 낭비를 하지않고 중복되지 않으며 DB작업 클래스는 하나만있어도 충분하여 사용
	//공통된 DB 연결처리유지가 가 좋음 
	public static SubjectDAO getInstance() {
		if(instance == null) {
			SubjectDAO instance = new SubjectDAO(); //싱글톤 인스턴스 객체 생성
		}
		return instance;
	}
	
	//외부에서 new 연산자로  생성자를 호출할 수 없도록 막기위해 접근 제한다 (private)으로 지정
	//싱글톤으로 만드는 완성형 메서드 
	private SubjectDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 클래스 로딩
			//OracleDriver 등록을 해주는거 
			//oracle :관련패키지 루트 , jdbc:JDBC기능을 제공하는 하위패키지,
			//driver: JDBC드라이버가 포함된 하위 패키지 , 
			//OracleDriver : ORACLE용 JDBC드라이버클래스이름
			// 한번만 연결하면 되기떄문에 싱글톤 안에 넣어주면된다 
			//Oracle JDBC 드라이버를 JVM(자바 가상 머신)에 등록하는 코드입니다.
		}catch(ClassNotFoundException cf) {
			cf.printStackTrace();
		}
	}
	
	// DB에 연결 하는 과정 
	// 내부클래스 DriverManager 가 내부에서 OracleDriver가 등록되어있으면  DB 연결
	
	private Connection getConnection() throws SQLException{
		Connection conn = DriverManager.getConnection(JDBC_URL,USER,PASSWD);
		return conn;   // DriverManager 클래스안에 있는getConnection 가 있다 CTRL 클릭하면보임 
	}
	
	// 번호 학과번호 학과명 전체를 보여주는 보여주는 메서드 
	public List<SubjectVO> getAllSubjects(){ //외부클래스에서도 호출 할거라서 pulblic으로 메서드 선언
		List<SubjectVO> list = new ArrayList<>(); //SubjectVO 객체들이담긴 리스트를 반환한다
		SubjectVO subjectVO = null;//반복문에서 매번 새로운 객체를 만들기위해서 미리선언
		
		
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT NO, S_NUM , S_NAME FROM SUBJECT ");
		sql.append("ORDER BY NO");
		
		
		// 쿼리절을 사용하용 하용후에   트라이안에 디비연결 해주면서  
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());	
			ResultSet rs = pstmt.executeQuery();){
			
			
			while(rs.next()) {
            	subjectVO = new SubjectVO();
            	subjectVO.setNo(rs.getInt("no"));
            	subjectVO.setSubjectNumber(rs.getString("s_num"));
            	subjectVO.setSubjectName(rs.getString("s_name"));
                list.add(subjectVO);
            }
        }catch(SQLException se) {
        	 System.err.println("[getAllSubjects] SQL 오류: " + se.getMessage());
        	 //se.printStackTrace();  //오류 발생 시 주석 해제
        }
        return list;
    }
	
	//  학과번호를 순사적으로 올려주는 메서드 
	public String getSubjectNumber() {
		String subjectNumber = "";
		
		StringBuilder sql = new StringBuilder();
							// nvl == 안에 값이 null일경우 대체 값 으로 넣어줌 
							//안에값이 있을경우 그조건 으로 실행 
		sql.append("SELECT NVL(TO_CHAR(MAX(S_NUM) + 1, 'FM00'), '01') AS subjectNum "); //여기 별칭컬럼 
		sql.append("FROM SUBJECT ");
		
		//'FM00'  :FM 은 공백필요없음 이라는뜻 00 은 숫자 두자리를 의미 6이들엉화도 06이렇게 변환
	
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();){
			
			if(rs.next()) {
				subjectNumber  = rs.getString("subjectNum");	// 별칭컬럼( NVL(TO_CHAR(MAX(S_NUM) + 1, 'FM00'), '01'))			
				// 숫자값을 문자열로 변환한 쿼리로값을 
			}
						
		}catch(SQLException se) {
			System.out.println("subjectNumber SQL 오류 : " + se.getMessage());
			se.printStackTrace();
			
			
		}
		
		return subjectNumber;

  }
    // 입력 하기위한 메서드 정리가 필요함 
    public boolean subjectInsert(SubjectVO subjectVO) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO subject(no, s_num, s_name) ");
        sql.append("VALUES(subject_seq.nextval, ?, ?)");

        try (Connection conn = getConnection();
        	PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
      
            pstmt.setString(1, subjectVO.getSubjectNumber()); // 첫번째 ?(바인딩변수) 설정값 - 학과번호
            pstmt.setString(2, subjectVO.getSubjectName());// 두번째 ?(바인딩변수) 설정값 - 학과명

            return pstmt.executeUpdate() == 1; //   정상적인 실행이 되었을떄  리턴값은 행에의갯수
        }catch(SQLException se) {
        	 System.err.println("[subjectInsert] SQL 오류: " + se.getMessage());
            //se.printStackTrace();  //오류 발생 시 주석 해제
        	 return false;
        }
    }
    
// 업데이트를 위한 메서드 
	public boolean subjectUpdate(SubjectVO SubjectVO) {
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE subject SET s_name = ? ");
		sql.append("WHERE s_num = ?");
		
		
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());	
			){
			
			pstmt.setString(1, SubjectVO.getSubjectName());
			pstmt.setString(2, SubjectVO.getSubjectNumber());
			
			return pstmt.executeUpdate() == 1;
			
			
		}catch(SQLException se) {
        	System.err.println("[subjectUpdate] SQL 오류: " + se.getMessage());
            //se.printStackTrace(); //오류 발생 시 주석 해제
            return false;
        }
		
		
			
			
		
    }
	// 학생수 남아있는지 확인하고 삭제할때 학생수가 있으면 못지우게 하는거 
	public int studentDataCheck(SubjectVO subjectVO) {
    	StringBuilder sql = new StringBuilder();
        sql.append("SELECT COUNT(sd_num) FROM student ");
        sql.append("WHERE s_num = ?");

        int data = 0;
        try (Connection con = getConnection();
        	 PreparedStatement pstmt = con.prepareStatement(sql.toString());){

        	pstmt.setString(1, subjectVO.getSubjectNumber());
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    data = rs.getInt(1);
                }
            }
        } catch (SQLException se) {
        	System.err.println("[studentDataCheck] SQL 오류: " + se.getMessage());
        	//se.printStackTrace(); //오류 발생 시 주석 해제
        } 
        
        return data;
    }
    
    
    public boolean subjectDelete(SubjectVO subjectVO) {
        StringBuilder sql = new StringBuilder();
        sql.append("delete from subject where s_num = ?");
        try(Connection conn = getConnection();
        	PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {

            pstmt.setString(1, subjectVO.getSubjectNumber());

            return pstmt.executeUpdate() == 1;
        }catch(SQLException se) {
        	System.err.println("[subjectDelete] SQL 오류: " + se.getMessage());
        	//se.printStackTrace(); //오류 발생 시 주석 해제
            return false;
        }
    }
// 학과명을 검색하는 메서드 
    public List<SubjectVO> getSubjectSearch(String s_name) {
    	List<SubjectVO> list = new ArrayList<>();
    	SubjectVO subjectVO = null; 
    	
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT no, s_num, s_name FROM subject ");
        sql.append("WHERE s_name LIKE ? ");
        sql.append("ORDER BY no");

        try (Connection conn = getConnection();
        	 PreparedStatement	pstmt = conn.prepareStatement(sql.toString());) {
  
            pstmt.setString(1, "%" + s_name + "%");

            try(ResultSet rs = pstmt.executeQuery()){
            	while(rs.next()){
            		subjectVO = new SubjectVO();
            		subjectVO.setNo(rs.getInt("no"));
            		subjectVO.setSubjectNumber(rs.getString("s_num"));
            		subjectVO.setSubjectName(rs.getString("s_name"));

                    list.add(subjectVO);
                }
            } 
        }catch(SQLException se) {
        	System.err.println("[getSubjectSearch] SQL 오류: " + se.getMessage());
        	//se.printStackTrace(); //오류 발생 시 주석 해제
        }
        return list;
    }
    
    
    
    
}
