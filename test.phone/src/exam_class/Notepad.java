package exam_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//간단한 메모장 프로그램을 작성하고자 합니다 
//
//메뉴 선택에 따라 메모 읽기, 새 메모 작성, 종료로 구현하고자 합니다.
//
//메모 읽기는 파일명만 작성하였을 때 현재 프로젝트에 존재하는 파일만이 대상이 됩니다.
//
//메뉴 메서드명
//
//메뉴   menu()
//
//메모 읽기  readMemo() 
//
//새 메모 작성    writeMemo()
public class Notepad {
	private static Scanner scanner = new Scanner(System.in);
    private static void menu() {
        System.out.println("1. 메모 읽기");
        System.out.println("2. 새 메모");
        System.out.println("3. 종료");
        System.out.print("원하는 작업 번호를 입력해주세요.");
    }
    
    private static void readMemo() { //모를 읽느다 
        System.out.println("메모 파일명을 입력하세요.");
        String fileName = scanner.nextLine();

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.\n");
            return;
        }
        System.out.println(fileName + "의 내용을 출력합니다.");

        Scanner reader = new Scanner(inputStream);
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        System.out.println("\n");

        reader.close();
    }
    
    private static void writeMemo() {
        System.out.println("저장할 메모 파일명을 입력하세요.");
        String fileName = scanner.nextLine();

        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            System.out.println("파일 생성에 실패했습니다.");
            return;
        }

        System.out.println("메모할 문자열을 입력하세요.");
        System.out.println("(종료: 빈 줄에서 엔터키 입력)");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            try {
                writer.write(input);
                writer.write("\r\n");
            } catch (IOException e) {
                System.out.println("파일에 문자열을 쓰지 못했습니다.");
            }
        }

        try {
            writer.close();
        } catch (IOException e) {
            System.out.println("파일을 닫는 데 실패했습니다.");
        }    	
    }
    
    public static void main(String[] args) {
        int taskNum;

        while (true) {
        	 menu();

            try {
                String input = scanner.nextLine();
                taskNum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            switch(taskNum) {
            	case 1 -> readMemo();  // 메모 읽기를 선택한 경우
            	case 2 -> writeMemo(); // 새 메모를 선택한 경우
            	case 3 -> {
            		System.out.println("프로그램을 종료합니다."); // 종료를 선택한 경우
                    break; 
            	}
            	default -> System.out.println("잘못된 입력입니다.\n");
            }
        }
    }
}