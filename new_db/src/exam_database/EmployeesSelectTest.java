package exam_database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 사원번호, 사원명, 급여, 입사일(2001.12.02형태로)을 출력해 주세요. */
public class EmployeesSelectTest {
    public static void main(String arg[])  {
    	//사원 번호 , 급여 (정수를) 
    	//사원이름 일사일(문자열 ) 담을 변수 선언
        int employee_id, salary;
        String first_name, hire_date;
        
        //DB에 연결에 필요한 객체들 서언 (초기값은 null)
        Connection conn = null; // 데이터베이스 연결 객체
        Statement stmt = null; // sql 실행을 위한 statement
        ResultSet rs = null;  // sql 결과를 저장 하는 ResultSet 

        try{
        	// DB 연결 (ConnectionDatabase는 사용자가 만든 클래스, 아래에 별도 설명)
        	conn = ConnectionDatabase.getConnection("xe", "hr", "hr1234");
        	
        	//statement 생성( 정적인 sql 을 실행할때 사용)
            stmt = conn.createStatement();

            
            // SQL 작성 (StringBuffer는 문자열을 효율적으로 연결할 수 있는 클래스)
            StringBuffer sql = new StringBuffer();
            sql.append("SELECT employee_id, first_name, salary,  ");
            sql.append("to_char(hire_date, 'YYYY.MM.DD') hire_date ");
            sql.append("FROM EMPLOYEES");
            
            // SQL 실행 (select이므로 executeQuery 사용) → 결과는 rs에 저장됨
            rs = stmt.executeQuery(sql.toString());

            
            // 출력 제목
            System.out.println("**** EMPLOYEES 테이블 데이터 출력 ****\n");
            System.out.printf("%s\t%s\t%6s\t%8s\n","사원번호","사원이름", "급여", "입사일");

            
            // 결과가 존재할 때까지 반복 (rs.next()는 다음 행이 있으면 true 반환)
            while (rs.next()) {
            	// 컬럼 이름으로 값 가져오기
            	
                employee_id = rs.getInt("employee_id");		 // 사원번호 (숫자)
                first_name = rs.getString("first_name"); 	 // 이름 (문자열)
                salary = rs.getInt("salary"); 		 		// 급여 (숫자)
                hire_date = rs.getString("hire_date");		// 입사일 (문자열: 2001.12.02 형태)
                
                
                // 한 줄씩 정렬해서 출력
                System.out.printf("%-7d %-11s %-6d %s\n", employee_id, first_name, salary, hire_date);
            }
        } catch(Exception s){
        	// 오류 발생 시 출력
            System.err.println("[쿼리문 ERROR] \n"+s.getMessage());
        }finally{
        	 // 자원 정리 (닫기), try-catch로 예외 발생 방지
            try{
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }catch(SQLException sqle){
                System.out.println("CLOSE ERROR");
            }
        }
    }
}