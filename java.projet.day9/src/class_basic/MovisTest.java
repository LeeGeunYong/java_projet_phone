package class_basic;

import java.util.Scanner;

public class MovisTest {
	//2개의 영화정보를 직접 댑입하여 출력해 주세요 이작어비 완료되면 주석처리
	//public static void main(String[] args) {
	//}	
	
//	public static void main(String[] args) {
//		Movie movie = new Movie();
//		
//		movie.movieData("파이널데스티네이션",240 , 30);
//		System.out.println(movie.toString());
//		
//		System.out.println(movie.toString());
//		
		
		
		// private 로 선언했기때문에 get set 로  메서드 작성  그걸 출력하는 실행 문작성
		//사용자로 하여금 2개의 영화 정보를 입력받아 출력해주세요
		//사용자로 하여금 영화정보를 입룍 받기 위한 메서드  별도로 구하여 설정
		public static Scanner input = new Scanner(System.in);
		public static void main(String[] args) {
			Movie mv2 = new Movie();
			inputData(mv2);
			
			//입력후 메서드를 통해서 필드에 ㄱ값대입
			
			Movie mv3 = new Movie();
			inputData(mv3);
			
			// 영화 정보 출력
			System.out.println("영화 정보는 다음과 같다");
			System.out.println("==============================================");
			System.out.println("제목\t상영시간\t\t감독\t\t개봉일");
			System.out.println("==============================================");
			System.out.println(mv2.toString());
			System.out.println(mv3.toString1());
			

			
		}
		
		//데이터를 입력받기 위한 메서드
		public static void inputData(Movie mv){ //Movie mv = mv2(참조값/주솟값)
			// 필드에 직접 대입
			System.out.print("영화 제목 : ");
			mv.setMovieTitle(input.nextLine());
			
			System.out.print("영화 시간 : ");
			mv.setMovieTime(input.nextLine());	
			
			System.out.print("영화 장르 : ");
			mv.setViewers(input.nextLine());
		}	
}
