package arry;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
	// 학생 수를 입력 받고 , 그 수 (학생수)만큼 점수를
	//입력받아 평균을 구하도록 프로그램을 작성하여 
	
		// 문제를 보면 학생수 를 입력 받고  
		// 그만큼 점수를 입력 받고 
		// 그후 평균을 적으라고 한다  
		// 평균은 총합에서 인원수만큼 빼야한다 
		
		
		int student ; // 학생을 이란 변수를 만든다
		
		int max = 0; //  총합 이란  변수를 만든다 
		double average = 0; // 평균이랑 변수를 만든다
		
		
		
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		System.out.println("학생수를 입력해주새ㅔ요");//스캐너를 생성했는데 출력을 해주자 쓰는곳 위치가 중요가 중요함 잘보
		student = sc.nextInt();//스캐너를 생성했으니 문제를 보며 무엇을 입력을 받아할지 정한다 
		
		
	
		int[] score = new int[student]; // 배열을 생성하고 scoredp 초기화해준다 
		
		for (int i=0; i <student; i++) {  // 여기서 문제를보면 학생수를 입력받아서 그수만큼 점수를 같이 입력받아야한다
		//그렇다면 for문으로 i에게 0이란 숫자를 초기화시켜주고 i가 "학생수"보다 작게 설정해서 반복을시켜준다
		//이렇게 되면 내가 스캐너로 학생이란 수를 입력하게되면 i=0 이니까 3이라고 가정했을때 0,1,2만큼 총 3번 반복하게된다 이렇게 
		//이렇게 한번씩 출력해보면서 부족한 부분이 뭔지 확인하면서 코딩	
											
			System.out.println("점수를 입력해주세요");// 학생수는 확인 되었으니 학생수만큼 점수도 나와야한다
			score[i] = sc.nextInt();// 스캐너로 점수도 입력 받자 주의사항은 배열을생선한 스코어를 보면 []가 있다
			//배열을 생선한 변수 초기값은 무조건[]를 넣어주고 그안에는 학생수만큼 점수갯수 1명당 1개의점수
			// 즉 for문에 보면 i<학생수 그렇다면 i는 학생수만큼 증강한다는얘기 
			//[]안에는 i를 입력하면 학생 2적을시 2개의 점수갯수가 같이 출력 
			max += score[i];
			//그렇다면 이제 평균을 내기전 점수를 총합해야한다 
			//위에 보면 max 라는 변수를 선언했다 그안에 저장해보자
			//max 에 점수를 i만큼 넣어주는 형식으로 대입연산자를 사용했다
			
			average = (double)max/student;
		}	//이제 평균값을 구하는 방법으로 위에 average 라는 변수를 선언
			//여기에 담아주자 평균값구하는 방법  총합 / 총합의인원수 이다
			//담을 변수 = 더블이라는 실수형으로 변경한다는 의미로 ()안에 넣어주자 그이유는
			//max, student 가 정수형 int 로 했기때문이다 
			System.out.println("총합은" + max);
			System.out.printf("총합에 대한 평균값은 = %.2f" , average);
		sc.close();	
	}
}
