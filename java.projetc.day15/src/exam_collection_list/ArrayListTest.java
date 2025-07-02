package exam_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		
	
		List<String> list = new ArrayList<String>();
	
		 System.out.println("list 가 가진 모든 원소를 문자열로 반환");
		 System.out.println(list.toString());
		 System.out.println();
		 
		 list.add("Java");   //인덱스번호: 0
	        list.add("Java");   //1
	        list.add("JSP");    //2
	        list.add("SPRING"); //3

	        int size = list.size();
	        System.out.println("총 객체수: " + size);
	        System.out.println();

	        list.add(1, "ORACLE"); // 결과?
	        list.set(2, "Client programming"); // 결과? 
	        list.remove(3);

	       System.out.println("======");
	        
	        int index = list.indexOf("Java");
	        System.out.println(index);
	        System.out.println("======");

	        index = list.lastIndexOf("Java");
	        System.out.println(index);

	        System.out.println("======");
	        for (int i = 0; i < list.size(); i++)
	            System.out.println(list.get(i));
		 
		// 정수값을 저장하도록 인스턴스 생성 말이 정수값이지 
		 //인스턴스에 들어가면 주소값을 를 넣는다 라고 생각하자
		
		 ArrayList<Integer> list1 = new ArrayList<Integer>();
		 
		 list1.add(23);
		 list1.add(94);
		 list1.add(Integer.valueOf(62));
		 list1.add(Integer.valueOf(45));
		 
		 System.out.println();
		 
		 list1.add(2, Integer.valueOf(78));
		 System.out.println(list.toString());
		 System.out.println();
		 
		 // Apple 이라는 이름으로 클래스를 생성한다. 이 클래스는 품종(kind)과 색상(color)을 필드로 가진다.
	        // 여러 사과(Apple)를 저장하도록 인스턴스 생성.
		 ArrayList<Apple> list2 = new ArrayList<Apple>();
		 
		 list2.add(new Apple("부사 ", "빨강"));
		 list2.add(new Apple("아오라" ,"청색"));
		 list2.add(new Apple("썸머킹" , "황글"));
		 list2.add(new Apple("홍로", "빨간"));
		 
		 

	        // 출력 - 1
		 for(int i =0; i<list2.size(); i++) {
			 Apple app = list2.get(i);
			 System.out.println("품종 : " + list2.get(i).getKind());
			 System.out.println(", 색상 :" + list2.get(i).getColor());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	 
		 	//출력 - 2
		 	for(int i = 0; i<list2.size(); i++) {	 		
		 		Apple app = list2.get(i);	 		
		 		System.out.println("품종 : " + app.getKind());
		 		System.out.println(", 색상:" + app.getColor());
		 	}
			  // 출력 - 3 : for ~ each문으로 출력.
		        for(Apple app : list2) {
		            System.out.println(app.toString());
		        }
		        System.out.println();
		        
		        System.out.println("list2가 가진 모든 원소를 문자열로 반환");
		        System.out.println(list2.toString());
		        System.out.println();
		       

		        // 여러 영화(Movie) 정보를  저장하도록 인스턴스 생성
		        // Movie 클래스는 영화제목(mTitle), 평점(mGrade), 감독(mDirector), 개봉일(anYear) 등의 필드를 가진다.
		       
		        
		        
		        ArrayList<Movie> mo1 = new ArrayList<>();
		        mo1.add(new Movie("한라산" , "3.24" , "이근용" , " 1943년1월2일"));
		        mo1.add(new Movie("나는야 천재" , "20,3" , "제니퍼"  ,"2344년 1월2일"));
		        
		        for(Movie mo : mo1 ) {
		        	System.out.println(mo.toString());
		        	
		        }System.out.println(mo1.toString()); //  ArrayList 자체  이렇게 1자로 출력
		        //[제목 :한라산평점:3.24감독:이근용개봉일 1943년1월2일, 제목 :나는야 천재평점:20,3감독:제니퍼개봉일2344년 1월2일]
		        
		       //출력 - 1
		        
		        for(int i  = 0; i< mo1.size(); i++) { //인덱스   
		        	System.out.println(mo1.get(i));
		        }
		        
		        
		        System.out.println("======================================================");
		        
		        
		        //출력  - 2
		        for(Movie name : mo1) { // 정렬 0~부터 끝까지
		        	System.out.println(name);
		        }
		        
		        System.out.println("+++++++++===========================================");
		        
		        //출력 -3 
		        
		        Iterator<Movie> iter = mo1.iterator(); // 반복자로 요소접근 출력문
		        
		        while(iter.hasNext()) {
		        	System.out.println(iter.next());
		        }
		        
		        
	 }
	
	
}
	 
	
