//package exam_database;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class ConnectionDatabase {
//	public static void main(String[] args) {
//		// 연결작업
//		// 21: jdbc:oracle:thin:@127.0.0.1:1521/xwpdn1;
//		        //  서버위치 : 포트번호:1521 / 서비스 이름/(xw or xwpdn1)
////					서버 위치 127.0.0.1  , localhost: 
//		
//		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
//		Connection conn = null;
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("드라이버 적재 성공");
//			
//			conn= DriverManager.getConnection(url,"javauser","java1234"); 
//					System.out.println("데이터베이스 연결 성공 ");
//					
//		}catch(ClassNotFoundException  e) {
//			System.out.println("드라이버를 찾을 수엉ㅅ습니다 ");
//			e.printStackTrace();
//		}catch(SQLException e) {
//			System.out.println("연결에 실패 했습니다 ");
//			e.printStackTrace();
//		}finally {
//			try {
//				if(conn != null) {
//					conn.close();
//				}
//			}catch(Exception e) {
//				System.err.println("해제에 실패했슴다");
//				e.printStackTrace();
//			}
//		}
//		
//	}
//
//}



package exam_database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDatabase {
	// 계속 적기가 힘들어서  이렇게 메서드로 정의 를 해서 필요할때마다 불러서 사용하면 된다 
	// 무조건 DB연결 할떄마다 해야 하기때문에  정적 메서드 부르는 법 클래스명.get메서드명();
	
    public static Connection getConnection
    (String serviceName, String id, String password) throws Exception{
    	
        String url = "jdbc:oracle:thin:@127.0.0.1:1521/"+serviceName;
        // 서비스 네임에   xepdb1 이것만 넣지말고 아무거나 인식할수있게 하는 문법
        
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        
        Connection conn = DriverManager.getConnection(url,id , password);
     //   커넥션을 인퍼런스로 만들기위해  드라이브매니져.getConnction(url ,id , password)로 인퍼런스생성]
      //데이터 베이스를 연결하기 휘해
        return conn;  
    
    }
}

// try 에서 호출해서 사용 한다    다른방향으로도 사용하는지 확인한다 


//Connection의 인스턴스는 getConnection("서비스이름", "사용자명", "비밀번호") 메서드 호출로 얻고자 한다.		
		
