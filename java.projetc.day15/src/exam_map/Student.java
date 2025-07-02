package exam_map;

public class Student implements Comparable<Student> {
	private int sno; // 학번
	private String name; // dlfma
	
   public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }
	
	@Override
	public String toString() {
		
		return "이름" + name + "학번" + sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return sno == student.sno;
		}else {
			return false;
		}
		
   
	}
	
	 @Override
	    public int hashCode() {
	    	//return sno + name.hashCode();
	    	return sno;
	        
	    }
	 
	 @Override
	 public int compareTo(Student i) { // 학번기준으로 정렬 하고싶을때 
	        if (this.sno > i.sno)
	            return 1;
	        else if (this.sno == i.sno)
	            return 0;
	        else
	            return -1;
	    }
	
	 
	 
}
