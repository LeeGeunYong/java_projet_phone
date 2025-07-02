package exam_test_car;

public class CarMain {
	public static void main(String[] args) {
		
	

		Monata[][] m1 =  {
				{new Monata("흰색" , 5000 , "승용" , "Nf" )},
				
				{new Monata("은색" , 7000 , "업무" , "Brilliant")},
		
				
				{new Monata("감홍색" , 4000 , "택시" , "EF" )},
					
				
				{new Monata("검정색" , 6000 , "승용" , "Hybrid" )}
				};
		
				
		
				System.out.println("==============Monata 생산 시작==============");
		
		for(int j = 0; j <m1.length; j++) {
			for (int i = 0 ; i < m1[j].length; i++) {
				
				 m1[j][i].toString(); 
				
				
				
			}
		
		
		}
	}
}
