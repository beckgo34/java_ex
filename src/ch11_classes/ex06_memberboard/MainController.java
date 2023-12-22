package ch11_classes.ex06_memberboard;

import ch11_classes.ex06_memberboard.common.CommonVariables;
import ch11_classes.ex06_memberboard.service.BoardService;
import ch11_classes.ex06_memberboard.service.MemberService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();
        BoardService boardService = new BoardService();
        boolean run = true;
        int selectNo = 0;
        int selectNoBoard = 0;
        while (run) {
            System.out.println("====== 회원관리 ======");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                memberService.sava();
            } else if (selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3) {
                memberService.memberList();
            } else if (selectNo == 4) {
                memberService.update();
            } else if (selectNo == 5) {
                memberService.delete();
            } else if (selectNo == 6) {
                memberService.logout();
            } else if (selectNo == 7) {
                if (CommonVariables.loginEmail != null) {
                    System.out.println("====== 게시판 ======");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.메인메뉴");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.print("선택> ");
                    selectNoBoard = scanner.nextInt();
                    if (selectNoBoard == 1) {
                        boardService.boardWrite();
                    } else if (selectNoBoard == 2) {
                        boardService.boardList();
                    } else if (selectNoBoard == 3) {
                        boardService.boardFind();
                    } else if (selectNoBoard == 4) {
                        boardService.boardUpdate();
                    } else if (selectNoBoard == 5) {

                    } else if (selectNoBoard == 6) {
                        boardService.boardSearch();
                    } else if (selectNoBoard == 0) {
                        run = false;
                    }
                } else {
                    System.out.println("로그인이 필요한 서비스입니다");
                }
            }
        }
    }
}


