package arry;

public class RainFall {
	public static void main(String[] args) {
		// 다음 프로그램 3년 동안의 분기 강수량을 다음의 데이터를 활용하여 초기화하고
		//연도별 강수량 합과 ㅑ출력하는 프로그램 작성ㄷ
		
		
//		1 3년이라는
//		2분기 강수량을 데이터로 활용하여 초기화 하고 /분기부터 초기화
//		3,연도별 강수량과 분기 강수량 합을 출력 하는
		
		final int YEAR = 3;
		int qua = 5;
		double[][] rain = {
						{368.1, 586.5, 351.2, 66.5, 0},
						{173.9, 493,   448.4, 168.1, 0},
						{172.8, 1012.4, 259.4, 46.7, 0}};
		
		//총합을 구하기위해서 
		for (int y= 0; y < YEAR; y++) {
			for(int q=0; q < qua-1; q++) {
				rain[y][qua-1] +=rain[y][q];
				
			}
				
		}
		
		String[] year = {"2018","2019","2020"};
		
		String [] subjet = {"년도", "1분기", "2분기","3분기","4분기","5분기" };
		for (String sub : subjet) {
		
			System.out.printf("%s\t",sub);
			
		}	
		
		System.out.printf("\n");
		
		for (int y = 0; y<YEAR; y++) {
			System.out.print(year[y]+"년도\t");
				for(int q=0; q<qua; q++) {
					System.out.printf("%.1f\t",rain[y][q]);
				}
				System.out.println();
			
		}
			
			
		
	}	
}

