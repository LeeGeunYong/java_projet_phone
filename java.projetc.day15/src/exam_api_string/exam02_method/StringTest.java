package exam_api_string.exam02_method;

import java.time.LocalDate;

public class StringTest {
	
	public static void main(String[] args) {
		String ssn = "660606-123451";
		
		//성별을 구하는 메서드 호출
		
			System.out.printf("당신의 성별: %s\n" , getGender(ssn) );
		
		
		/* 나이를 구하는 메서드 호출 */
	       System.out.printf("당신의 나이: %s\n", getAge(ssn));
	       
	       
	       // 파일 확장자 체크하는 메서드 호출
	        String fileName = "test.tst";
	        fileExtCheck(fileName);
	        
	       
       /*변수 fileName에 저장된 파일명(예: test.txt)에서 확장자 체크하여 이미지 파일(gif/jpg/png/jpeg)
		외 나머지 확장자를 가진 파일인 경우 "이미지 파일만 등록가능합니다"라는 메시지를 출력하도록 작성해 보세요.
		파일 확장자를 체크하는 메서드 호출(fileExtCheck()) */
	       
	      
	      
	        


	       
	}

	
		
		
	

	/* 성별을 구하는 메서드 선언. */
	private static Object getGender(String ssn) {
	    char genderCode = ssn.charAt(7); // 8번째 문자
        switch (genderCode) {
            case '1': case '3': return "남성";
            case '2': case '4': return "여성";
            default: return "알 수 없음";
        }
    }

	/* 나이를 구하는 메서드 선언 */
	public static int getAge(String ssn) {
        int birthYear = Integer.parseInt(ssn.substring(0, 2));
        char genderCode = ssn.charAt(7);

        // 2000년 이전 출생자
        if (genderCode == '1' || genderCode == '2') {
            birthYear += 1900;
        } else if (genderCode == '3' || genderCode == '4') {
            birthYear += 2000;
        }

        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;

    }
	
	
	
	/* 파일 확장자를 체크하는 메서드 선언(fileExtCheck()) */
	public static void fileExtCheck(String fileName) {
        String[] allowedExt = {"gif", "jpg", "png", "jpeg"};

        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex == -1 || dotIndex == fileName.length() - 1) {
            System.out.println("확장자가 없습니다.");
            return;
        }

        String ext = fileName.substring(dotIndex + 1).toLowerCase();
        for (String allowed : allowedExt) {
            if (allowed.equals(ext)) {
                System.out.println("정상 파일입니다: " + fileName);
                return;
            }
        }

        System.out.println("이미지 파일만 등록가능합니다");
    }
}