package exam_collection_set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class Score implements Comparable<Score> {
    private int kor; // 국어점수
    private int math;// 수학점수

    public Score(int kor, int math) {
        this.kor = kor;
        this.math = math;
        
    }
    
    public int getSum() {
    	return this.kor + this.math;
    }
    

    @Override
    public int compareTo(Score obj) {// 기준점을 얘가 잡고 그거에대해 정렬해서 출력
        int r = this.getSum() - obj.getSum();
        if (r > 0)
            return 1;
        else if (r == 0)
            return 0;
        else
            return -1;
    }
    
    @Override
    public String toString() {
        return String.format("[Score - 국어:%d, 수학:%d, 총점:%3d]", kor, math, getSum());
    }
}



public class TreeSetTest {
	
	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(20);
		set.add(90);
		set.add(20);
		
		set.add(Integer.valueOf(75));
		set.add(Integer.valueOf(92));
		set.add(Integer.valueOf(50));
		
		
		System.out.println("Sorting(오름)" + set.toString()); 
		System.out.println("Sorting(내림)" + set.descendingSet());
		//내림 차순문법 
		
		
		
		System.out.println("==============================");
		
		System.out.println("가장 낮은 점수 :" + set.first());// 
		System.err.println("가장 높은 점수"  + set.last());
		
		
		
		System.out.println("==============================");
		
		// [요구사항 2] 여러 Score 클래스를 저장하고자 한다. 이때 총점순으로 오름차순으로 결과를 얻고자 한다.
		
		TreeSet<Score> tSet = new TreeSet<Score>();
		tSet.add(new Score(21, 22));
        tSet.add(new Score(71, 78));
        tSet.add(new Score(11, 12));
        tSet.add(new Score(31, 32));
        
        System.out.println("\n 반복자를 이용하려 출력 - 오름차순");
        Iterator<Score> it = tSet.iterator();
        while (it.hasNext()) {
        	System.out.println(it.next());
        }
        
        System.out.println("\n 반복자를 이용하려 출력 내림 차순");
        Set<Score> sSet = tSet.descendingSet();
        Iterator<Score> sIt = sSet.iterator();
        while (sIt.hasNext()) {
            System.out.println(sIt.next());
        }
        System.out.println();
    }
}
