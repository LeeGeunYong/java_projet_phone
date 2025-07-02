package exam_scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args)throws IOException {
		Scanner s = null;
		PrintWriter out = null;
		int sum= 0;
		
		
		
		out = new PrintWriter(new FileWriter("input.txt"));
		//out.println("567,123,200");
		out.print("15");
		out.print("9.5");
		out.print("2");
		out.print("JAVA");
		out.print("3");
		out.flush();
		
		s = new Scanner(new BufferedReader(new FileReader("input.txt")));
        //s.useDelimiter(","); // 콤마를 분리자로 사용
        while (s.hasNext()) {
            //System.out.println(s.next());
            if (s.hasNextInt()) {
                sum += s.nextInt();
            } else {
                s.next();
            }
        }
        System.out.println("정수의 합: "+sum);
        if (s != null)
            s.close();
        if (out != null)
            out.close();
    }
}