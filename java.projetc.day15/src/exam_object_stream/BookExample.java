package exam_object_stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BookExample {
	/* 실행 클래스명: BookExample
	 * 아래의 메서드는 static을 가지지 않는 일반 메서드로 설정해 주세요.
	 * 
	 * - book.dat 파일에 Book 데이터를 저장 : fileSave 메서드 생성
	 * 
	 * 전달받은 fileName으로 파일 출력 스트림을 생성한다.
	 * 
	 * 파일에 Book 객체를 기록할 수 있는 객체 출력 스트림을 추가한다.
	 * 파일에 Book 객체 정보를 기록하고 스트림들을 닫는다.
	 * Book 객체 샘플 : "자바를 정복하자", 35000
	 * 
	 * - book.dat 파일에서 데이터로 읽어서 Book 객체로 복원하여 출력 : fileRead 메서드 생성
	*/
	public static void main(String[] args) {
		BookExample book = new BookExample(); 
		String fileName = "book.dat";
		
		book.fileSave(fileName);
		book.fileRead(fileName);
	}
	
		public void fileSave(String fileName) {
			try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))
				
					
				){
				oos.writeObject(new Book("자바를 정복하자 " ,3000));	
				
				
				
				
				
				
				
				
				
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
				
					
					
					
					
				
			
		}
	
	public void fileRead(String fileName) {
		
	} 
}