package practice;

import java.util.Scanner;

public class BoardMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board1 board = new Board1();
        boolean run = true;
        int select = 0;
        while (run){
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.println("선택: ");
            select = scanner.nextInt();
            if(select == 1){
                System.out.println("글번호: ");
                Long id = scanner.nextLong();
                System.out.println("글제목: ");
                String title = scanner.next();
                System.out.println("작성자: ");
                String writer = scanner.next();
                System.out.println("글내용: ");
                String contents = scanner.next();
                board= new Board1(id,title,writer,contents);
            } else if (select == 2) {
                System.out.println("글번호: ");
                Long id = scanner.nextLong();
                board.findById(id);
            } else if (select == 3) {
                run = false;


            }
        }
    }
}
