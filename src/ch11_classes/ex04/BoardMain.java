package ch11_classes.ex04;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        BoardService boardService = new BoardService();

        while (run) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 7.종료 | ");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("선택: ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                boardService.list();
            } else if (selectNo == 2) {
                boardService.findAll();
            } else if (selectNo == 3) {
                boardService.findBoard();
            } else if (selectNo == 4) {
                boardService.update();
            } else if (selectNo == 5) {
                boardService.delete();
            } else if (selectNo == 6) {
                boardService.search();
            } else if (selectNo == 7) {
                run = false;
            }
        }

    }
}
