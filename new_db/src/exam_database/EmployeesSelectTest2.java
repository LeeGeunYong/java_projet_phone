package exam_database;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//1-1. 사원번호, 사원명, 급여, 부서명을 출력하도록 코딩해 주세요.
//1-2. 위 소스에 추가로 사원명을 입력받아 출력하도록 수정해 주세요.

public class EmployeesSelectTest2 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			Connection conn = null;  // 디비 연결 해주는거
		    Statement stmt = null; 	// 디비랑 자바랑 연결해서 쿼리해주는 연결로
		    ResultSet rs = null;  //  Select  문을 사용할떄 데이터베이스 질의문을 실행함으로써 생성되는,
		    						//결과 집합을 나타내는 데이터 테이블이다."
		    
		    int EMPLOYEE_ID , SALARY ;
		    String FIRST_NAME , DEPARTMENT_NAME;
		    
		    String name ;
		    System.out.println("이름을 입력해주세요");
		    name = sc.next();
		    sc.close();
		    
		    
		    try {
		    	conn = ConnectionDatabase.getConnection("xe", "hr", "hr1234");
		        stmt = conn.createStatement();
		        
		        StringBuffer sb = new StringBuffer();
		        
		        sb.append("SELECT EMPLOYEE_ID , E.FIRST_NAME , SALARY , D.DEPARTMENT_NAME ");
		        sb.append("FROM EMPLOYEES E INNER JOIN DEPARTMENTS D ");		     
		        sb.append("ON E.DEPARTMENT_ID  = D.DEPARTMENT_ID ");		        
		        sb.append("WHERE E.FIRST_NAME = '"+name+"'");
		        
		        rs = stmt.executeQuery(sb.toString());
		        
		        
		        while(rs.next()) {
		        	EMPLOYEE_ID = rs.getInt("EMPLOYEE_ID");
		        	FIRST_NAME = rs.getString("FIRST_NAME");
		        	SALARY = rs.getInt("SALARY");
		        	DEPARTMENT_NAME = rs.getString("DEPARTMENT_NAME");
		        	
		        	System.out.println("직원번호는 : " + EMPLOYEE_ID + " 직원이름은 :" + FIRST_NAME +
		        			 " 급여는 : " + SALARY + " 부서이름은 : " +DEPARTMENT_NAME );	
		        	
		        }
			
		    }catch(Exception e) {
		    	e.printStackTrace();
		    	
		    }finally{
		    	try {
		    		if(conn != null) conn.close();
		    		if(rs != null) rs.close();
		    		if(stmt != null) stmt.close();
		    		
		    	}catch(SQLException  e) {
		    		e.printStackTrace();
		    		
		    	}
		    	
		    }
		}

}
