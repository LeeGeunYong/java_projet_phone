package exam_collection_list;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
	static Vector<Movie> list = new Vector<Movie>();// 이렇게 선언하는이유
	
	public static void main(String[] args) {
		
	
		list.addElement(new Movie("더 베트맨 " , "☆☆☆☆☆☆☆☆☆" , "맷 리브스" , "2022.0301"));
		list.addElement(new Movie("나쁜 녀석들 :더무비" ,"★★★★★★☆ 8.44" , "손용호" ,"2019.0911"));
		list.addElement(new Movie("아쿠아맨", "☆☆☆☆☆ 0", "론 하워드", "2018.12.19"));


        //printData(list);
        printData();
    }

    //private static void printData(Vector<Movie> list) {
    private static void printData() {
		/*for (int i = 0; i < list.size(); i++){
			System.out.println(list.elementAt(i));
		}*/

        Iterator<Movie> e = list.iterator();
        while (e.hasNext()) {
            System.out.println(e.next());
        }
   }
    
}