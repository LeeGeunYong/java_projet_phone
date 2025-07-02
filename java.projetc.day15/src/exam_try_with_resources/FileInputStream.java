package exam_try_with_resources;

public class FileInputStream  implements AutoCloseable  {
	
	private String file;
	
	
	public  FileInputStream (String file) {
		this.file= file;
		
		
	}
	
	public void read() {
		System.out.println(file + " 읽습니다");
	}

	@Override
	public void close() throws Exception {//throws Exception설명 해준다소함
		System.out.println(file + " 를 닫습니다 ");
		
	}
	
	

}
