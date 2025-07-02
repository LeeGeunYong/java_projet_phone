package exam_file;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/Temp3/Dir"); // Temp3 폴더  안에 dir 폴더  
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");

        if(!dir.exists()) {
            dir.mkdirs(); // 엠케이 디 이즈 make directories의 줄임말  뜻: 여러 개의 디렉토리(폴더)를 한꺼번에 만든다 
            	// mkdir 은한개 만 폴더 만들어줌

        }
        if(file1.exists()) {
            file1.delete(); // 삭제하다 파일
        }
        if(!file2.exists()) {
            file2.createNewFile(); // 생성하다  새로운 파일
        }

        // 파일에 데이터 출력 후 읽기
        if(file2.exists()) {
            try(PrintWriter out = new PrintWriter(file2)) {
                out.println("hello java!");
            }
            System.out.println("파일 이름 : " + file2.getName());//파일 이름
            System.out.println("파일 경로 : " + file2.getPath());//객체에 저장된 경로 문자열을 그대로 돌려주는 메서드
            System.out.println("쓰기 가능 : " + file2.canWrite());//쓰기 를 할수있는가 ? 파일또는 폴더기 쓰기원한이 있는ㅈ;ㅣ
            System.out.println("읽기 가능 : " + file2.canRead());// 일기를 할수 있는가파일이나 폴더에 읽기 권한이 있는지 확인하는 메서드야.
            System.out.println("파일 길이 : " + file2.length() + " 바이트"); //크기
        } else {
            System.out.println("작업할 파일이 존재하지 않음");
        }

        File temp = new File("C:/Temp");
        System.out.println("경로: " + temp.getPath());
        System.out.println("부모: " + temp.getParent());
        System.out.println("절대경로: " + temp.getAbsolutePath());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");//년월일 시분 

        File[] contents = temp.listFiles();
        System.out.println("날짜 \t\t시간 \t 형태 \t\t크기 \t이름");
        System.out.println("-----------------------------------------------------------");
        for(File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified())));//시간이랑  날짜 

            if(file.isDirectory()) {//이즈 디렉터리(폴더)인가??  // Temp 안에 폴더 가있으면 
                System.out.print("\t<DIR>\t\t\t" + file.getName());// 
            } else {
                System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}