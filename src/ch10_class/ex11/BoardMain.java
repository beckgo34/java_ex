package ch10_class.ex11;

import java.util.Arrays;
import java.util.Scanner;

public class BoardMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int select = 0;
        Board board = new Board();
        Long idSearch = 0L;
        while (run){
            System.out.println("1.글작성 | 2.글조회 | 3.종료");
            System.out.print("선택> ");
            select = scanner.nextInt();
            if(select == 1){
                System.out.print("글번호> ");
                Long id = scanner.nextLong();
                System.out.print("글제목> ");
                String title = scanner.next();
                System.out.print("작성자> ");
                String writer = scanner.next();
                System.out.print("내용> ");
                String content = scanner.next();
                System.out.print("조회수> ");
                int hits = scanner.nextInt();
                board = new Board(id,title,writer,content,hits);
            } else if (select == 2) {
                System.out.print("글번호> ");
                idSearch = scanner.nextLong();
                board.findByid(idSearch);
            }else if(select == 3){
                run = false;
            }
        }
    }
}
