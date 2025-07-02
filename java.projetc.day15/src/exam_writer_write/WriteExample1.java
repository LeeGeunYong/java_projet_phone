package exam_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("test1.txt", true);
        // char[] data = {'A', 'B', 'C', 'D', 'E'};
        // char[] data = {'홍', '길', '동'};
        char[] data = "오늘 하루도 최선을 다해~".toCharArray();

        // write(int c) 메서드
		for(int i=0; i<data.length; i++) {
			writer.write(data[i]);
		}

        // write(char[] cbuf) 메서드 
        //writer.write(data);

        StringBuffer sb = new StringBuffer();
        sb.append("꿈을 이루지 못한 사람들은\n");
        sb.append("나는 \"재능이 없었어\"라고 말한다\n");
        sb.append("꿈을 이루지 못한 이유가 재능이 없었다는 것이라면\n");
        sb.append("꿈을 이룬 사람들은 모두\"재능이 있었다\"라고 대답하는 것이 맞겠지만\n");
        sb.append("성공한 사람 중에 그럼 대답을 하는 사람은 거의 없다는 것이다\n");
        sb.append("꿈을 이룬 사람들은 \"정말로 하고 싶었던 일을 열정을 가지고 계속했을 뿐이다\"라고 말한다.");

        // write(String str) 메서드
        writer.write(sb.toString());

        System.out.println("파일 출력 완료.");
        writer.flush();// 마지막 까지 남은 코드값을 다 나온게 한다 
        writer.close();//  데이터 세어나오지않게 닫는다 
    }
}