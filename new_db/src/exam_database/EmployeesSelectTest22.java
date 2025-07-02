package exam_database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeesSelectTest22 {
	
	public static void main(String[] args) {
		
//		부서별 사원수를 출력하고자 한다.


		int employee_number ;
		String department_name ;
		
		Connection  conn = null;   // 연결한다  
		Statement stmt = null;
		ResultSet  rs = null;
		
		
		
		try {
			conn = ConnectionDatabase.getConnection("xe" , "hr" ,"hr1234");
			stmt = conn.createStatement();
			
			StringBuilder sql = new StringBuilder();
			
			// 쿼리문 작성 
			sql.append("SELECT D.DEPARTMENT_NAME, COUNT(E.EMPLOYEE_ID) C ");
			sql.append("FROM DEPARTMENTS D INNER JOIN EMPLOYEES E ");
			sql.append("ON D.DEPARTMENT_ID = E.DEPARTMENT_ID ");
			sql.append("GROUP BY D.DEPARTMENT_NAME ");
			
			
			
			rs = stmt.executeQuery(sql.toString());
			
			
			
			
			while(rs.next()) {
				employee_number = rs.getInt("C");
				department_name = rs.getString("DEPARTMENT_NAME");
				
				System.out.printf("%d , %s" , employee_number , department_name );
			}
			
		
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(rs != null) rs.close();
				if(conn != null) conn.close();
				if(stmt != null) stmt.close();
			}catch(SQLException s) {
				s.printStackTrace();
			}
			
		}
	
		
	}

}
