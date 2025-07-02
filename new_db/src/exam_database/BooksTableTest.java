package exam_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BooksTableTest {
    public static Scanner input = new Scanner(System.in);
    // 데이터베이스 접근 시 필요한 데이터
    public static final String serviceName = "xepdb1";
    public static final String user = "javauser";
    public static final String password = "java1234";
    
    private static void showMenu() {
        System.out.println("""
                선택하세요...
                1. 데이터 입력
                2. 데이터 검색
                3. 데이터 삭제
                4. 프로그램 종료
                """);
        System.out.print("선택: ");
    }
	
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> readBooks();
                case 3 -> deleteBook();
                case 4 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
    

    private static void addBook() {
    	int price;
    	String title, publisher, year;
    
        System.out.println("책이름, 출판사, 출간연도, 가격을 순서대로 입력해 주세요");
        title = input.next();
        publisher = input.next();
        year = input.next();
        price = input.nextInt();
        input.next();
        
        
	   	 StringBuilder sb = new StringBuilder();
	     sb.append("INSERT INTO books (book_id, title, publisher, year, price) ");
	     sb.append("VALUES (books_seq.nextval, ?, ?, ?, ?)");

	    try(Connection conn = ConnectionDatabase.getConnection(serviceName, user, password);
	    	PreparedStatement pstmt = conn.prepareStatement(sb.toString());) {
	
	        pstmt.setString(1, title);
	        pstmt.setString(2, publisher);
	        pstmt.setString(3, year);
	        pstmt.setInt(4, price);
	
	        int insertCount = pstmt.executeUpdate();
	
	        System.out.println(insertCount == 1 ? "레코드 추가 성공" : "레코드 추가 실패");
	    } catch (Exception e) {
	    	System.err.println("[데이터 입력 중 오류 발생] " + e.getMessage());
	    	//e.printStackTrace();
	    }
    }
 
    private static void readBooks() {
    	StringBuilder sb = new StringBuilder();
        sb.append("SELECT book_id, title, publisher, year, price ");
        sb.append(" FROM books order by book_id desc");

        try (Connection conn = ConnectionDatabase.getConnection(serviceName, user, password);
        	 PreparedStatement pstmt = conn.prepareStatement(sb.toString());
        	 ResultSet rs = pstmt.executeQuery(sb.toString());){

            System.out.println("\n**** books 테이블 데이터 출력 ****");
            System.out.println("책번호\t제목\t\t\t출판사\t\t출판연도\t\t가격\n");
            while(rs.next()){
                System.out.print(rs.getInt("book_id")+"\t");
                System.out.print(rs.getString("title")+"\t\t");
                System.out.print(rs.getString("publisher")+"\t");
                System.out.print(rs.getString("year")+"\t");
                System.out.println(rs.getInt("price")+"\t");
            }
        
        }catch (Exception e) {
        	System.err.println("[데이터 검색 중 오류 발생] " + e.getMessage());
            //e.printStackTrace();
        }
   }
    
    private static void deleteBook() {
    	System.out.println("삭제할 책번호를 입력해주세요");
    	int book_id = input.nextInt();
    	
    	input.next();
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("delete from books where book_id = ?");
    	
    	
    	 try (Connection conn = ConnectionDatabase.getConnection(serviceName, user, password);
            	 PreparedStatement pstmt = conn.prepareStatement(sb.toString());){

        	pstmt.setInt(1, book_id);
            int deleteCount = pstmt.executeUpdate();
            
            System.out.println(deleteCount == 1 ? "레코드 삭제 성공" : "레코드 삭제 실패");
        } catch(Exception e) {
        	System.err.println("[데이터 삭제중 오류장생]" + e.getMessage());
        	e.printStackTrace();
        	
        }
    }
  
}





