package exam_database;

import java.sql.*;

public class TreatmentInsertTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement  stmt = null;
		
		try {
			conn = ConnectionDatabase.getConnection("xe","hr","hr1234");
			stmt = conn.createStatement();
			
			StringBuffer sb = new StringBuffer();
			sb.append("INSERT INTO TREATMENT(T_NO , T_COURSE_ABBR, T_COURSE,T_TEL)");
			sb.append("VALUES(1004,'GS','일반외과','02-3452-4001')");
			
			int insertCount = stmt.executeUpdate(sb.toString());  //쿼리문을 실행하여 적용된 행의 수 반환
			
			if(insertCount == 1) {//입력이 정상적으로 완료 되면 발환값 1
				System.out.println("레코드 추가 성공");
			}else {
				System.out.println("레코드 추카 실패");
			}
		}catch(Exception e) {
			System.err.println("[쿼리문 ERROR] \n" + e.getMessage());
		}finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
					
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
