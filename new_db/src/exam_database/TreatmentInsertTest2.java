package exam_database;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

/* 사용자로 하여금 데이터를 입력받아 진료과목 테이블에 데이터 입력. */
public class TreatmentInsertTest2 {
    public static void main(String arg[]) {
        Connection conn = null;
        Statement stmt = null;
        
        String courseAbbr, course, tel;
        int no;
         Scanner sc = new Scanner(System.in);
         
        
        System.out.println("일련번호 를 입력해주세요 ");
        no = sc.nextInt();
        
        System.out.println("진료과목약어 를 입력해주세요 ");
        courseAbbr = sc.next();
        
        
       
        System.out.println("진료과목(공백없이) 를 입력해주세요 ");
        course = sc.next();
        
        System.out.println("전화번호 (-)포함  를 입력해주세요 ");
        tel = sc.next();
        
        
        
       
        
        try {
        	conn = ConnectionDatabase.getConnection("xe", "hr", "hr1234");
            stmt = conn.createStatement();
            //입룍을 받아서 Insert 를 해보는 문법 
            StringBuffer sb = new StringBuffer();
            sb.append("INSERT INTO treatment(t_no, t_course_abbr, t_course, t_tel)");
            sb.append("VALUES ("+ no + ",'"+courseAbbr+"','"+course );
            sb.append("','" + tel + "')");
            
            
            
            int insertCount = stmt.executeUpdate(sb.toString()); 

            if (insertCount == 1) {
                System.out.println("레코드 추가 성공");
            } else {
                System.out.println("레코드 추가 실패");
            }
        } catch (Exception e) {
        	System.err.println("[쿼리문 ERROR] \n" + e.getMessage());
        } finally {
            try {
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            } catch (Exception en) {
                en.printStackTrace();
            }
        }
    }
}