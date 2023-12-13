package ch08_string;

import java.util.Scanner;

public class Ex02_StringEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String end = "종료";
        boolean run = true;
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요");
        while (run){
            String input = scanner.nextLine();
            System.out.println(">"+input);
            if(input.equals(end)){
                run = false;
            }
        }
    }
}
