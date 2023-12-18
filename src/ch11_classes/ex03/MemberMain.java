package ch11_classes.ex03;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;

        MemberService memberService = new MemberService();

        while (run){
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3. 회원 목록조회 | 4.회원 정보수정 | 5.회원탈퇴 | 6.로그아웃 | 7.프로그램 종료");
            System.out.println("----------------------------------------------------------------------------------------------");
            System.out.println("선택: ");
            selectNo = scanner.nextInt();
            if (selectNo == 1){
                memberService.join();
            }else if (selectNo == 2){
                memberService.login();
            }else if(selectNo == 3){
                memberService.findAll();
            } else if (selectNo == 4) {
                memberService.update();
            }else if(selectNo == 5){
                memberService.memberDelete();
            } else if (selectNo == 6) {
                memberService.logout();
            } else {
                System.out.println("프로그램 종료");
                run = false;
            }
        }

    }
}
