package inheritance;

class Professor extends Person {
	private String subject;
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject =subject;
		
		
	}
	public String toString() {
		return super.toString() + ":" + getSubject();
		
		
	}
}
