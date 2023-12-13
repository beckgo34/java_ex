package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member member = new Member();
        boolean run = true; //while 실행
        int select = 0; // 선택
        String joinEmail = null;
        String joinPass = null;
        String joinName = null;
        String joinMobile = null;
        String loginId = null;
        String loginPass = null;

        while (run){
            System.out.println("1.회원가입 | 2.로그인 | 3.종료");
            System.out.print("선택> ");
            select = scanner.nextInt();
            if (select == 1){
                System.out.print("이메일 주소 입력> ");
                joinEmail = scanner.next();
                System.out.print("비밀번호 입력> ");
                joinPass = scanner.next();
                System.out.print("이름 입력> ");
                joinName = scanner.next();
                System.out.print("전화번호 입력> ");
                joinMobile = scanner.next();
                member.setMemberEmail(joinEmail);
                member.setMemberPassword(joinPass);
                System.out.println(member.toString());
            } else if (select == 2) {
                System.out.println("이메일 주소 입력");
                loginId = scanner.next();
                System.out.println("비밀번호 입력");
                loginPass = scanner.next();
                member.memberLogin(loginId,loginPass);



            } else if (select == 3) {
                run =false;
            }
        }
    }
}
