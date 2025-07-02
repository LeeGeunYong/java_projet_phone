package class_example;
	
public class DogMain {
	public static void main(String[] args) {
//		Dog dog = new Dog("복실이" , "말티즈" , 25);
//		
//		Dog dog1 = new Dog();
//		dog1.setName("복실이2");
//		dog1.setBreed("치와와");
//		dog1.setAge(23);
//		
//		
//		
//	
//				
//		
//		
//		System.out.println(dog1.toString());
//		System.out.println(dog.toString());
		
		Dog dog1 = new Dog("잠잠이" , "요크셔테리어",1);
		System.out.println(dog1.toString());
		
		Dog dog2 = new Dog("이쁜이" , "포메라니안",3);
		
		System.out.println(dog2.toString());
		
		Dog[] dogs= {
				new Dog("이쁜이 ", "요크셔에티러" ,1),
				new Dog("잠잠이" , "포메라니안" ,3)
		};
		
		
		for(Dog dog : dogs) {
		System.out.println(dog.toString());
		}
		
	}
	
}
