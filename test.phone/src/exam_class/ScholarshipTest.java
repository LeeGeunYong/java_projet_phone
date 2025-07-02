package exam_class;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScholarshipTest {
	public static  Scanner sc = new Scanner(System.in);
	
//	5명의 학생이름과 학점(4.5만점)을 입력받아 학생명을 Key로, 학점을 Value로 HashMap에 
//	저장하고(read()), 장학생 선발 기준을 입력 받아 장학생 명단을 출력(select())해 주세요.
	 public static void main(String [] args) {
//	    	Scholarship sship = new Scholarship("장학금");
//	        sship.read();
//	        sship.select();
//	        
	        
	        
	        
	        Map<String , Double> m = new HashMap<>();
	        	for(int i = 0; i<5; i++) {
	        		System.out.println("이름");
	        		String name = sc.nextLine();
	        		
	        		System.out.println("학점 ");
	        		double grade = sc.nextDouble();			
	        		
	        		m.put(name , grade);
	        }
	        	
	        	
	       
	   
     
	        
	        
	    }
	}