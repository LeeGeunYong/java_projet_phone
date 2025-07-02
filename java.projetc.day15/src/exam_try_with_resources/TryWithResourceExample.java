package exam_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		// try-with-resources
		
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			//throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}
		System.out.println();
		
		
//===================2가지 방법 ===================================	

		
		// try ~ catch ~ finally
		FileInputStream fis = null; //  밖에다가 선언한 이유
		try {
			fis = new FileInputStream("file.txt");
			fis.read(); //이부분에 클로우즈 사용하는 이유 
		} catch (Exception e) {//예외를 처리 하는 상위 문법 e라는 매개변수로 
			System.out.println("예외 처리 코드가 실행되었습니다.");
		} finally {
			try {
				if(fis != null) {//인스턴스 값이 널이 아니라면 
					fis.close();
				}
			} catch(Exception ex) {
				System.out.println("해제시 오류");
			}
		}
	}
}