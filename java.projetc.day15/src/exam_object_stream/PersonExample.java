package exam_object_stream;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class PersonExample {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String fileName = "person.dat";
		output(fileName);
		input(fileName);
	}
	
	private static void output(String fileName) {
		try(FileOutputStream fos = new FileOutputStream (fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			
			System.out.println("이름");
			String name = scan.nextLine();
			System.out.println("나이");
			int age = scan.nextInt();
			scan.nextLine();
			
			oos.writeObject(new Person( name , age));
			
			oos.writeObject(new Person("김희진 ", 20));
			
			
			
			
		}catch (IOException e) {//지정된 파일을 찾을수 없습니다 상위객체라 서 하위 어떠한부분이 오류로 나옴
			System.out.println(e);//java.io.FileNotFoundException: file.txt (지정된 파일을 찾을 수 없습니다)
		}
				
				
				
			
	}



private static void input(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream oos = new ObjectInputStream(fis)){
			while (true) {
			    Person p = (Person) oos.readObject();
	            System.out.println(p.toString());
	        }
	    } catch (ClassNotFoundException e) {
	        System.out.println("클래스를 찾을 수 없습니다");
	    } catch (IOException io) {
	    	
	    	//여기가 빈 이유  끝까지 다 나올거니까?
	    	
	    }
	}
}