package exam_string;

public class TextBlockExample {
	public static void main(String[] args){
		String str1 = "n" +
		"\t\"id\":\"javauser\",\n" +
		"\t\"name\":\"홍길동\"\n" +
		"}";
		
		
		String str2 = """
		{
		"name":"홍길동"
		
		{
		""";
		
		System.out.println(str1);
		System.out.println("----------------------");
		System.out.println(str2);
	    System.out.println("---------------------------");
		String str = """
		나는 자바를\
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		System.out.println(str)	;
	}
}
