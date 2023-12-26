package ch13_map.ex03;

import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();
    Scanner scanner = new Scanner(System.in);
    private static String loginEmail = null;

    public void join() {
        // 중복체크 결과를 담을 변수
        boolean checkResult = false;
        String memberEmail = null;
        do {
            System.out.println("이메일 입력: ");
            memberEmail = scanner.next();
            // checkResult가 true => 사용가능(반복문 종료), checkResult가 false => 사용불가(다시 이메일입력)
            checkResult = memberRepository.emailCheck(memberEmail);
            if(checkResult){
                System.out.println("사용 가능한 이메일 입니다");
            }else{
                System.out.println("이미 사용중인 이메일입니다");
            }
        } while (!checkResult);// checkResult 값이 false라면 계속 반복되도록


        System.out.println("비밀번호 입력: ");
        String memberPassword = scanner.next();
        System.out.println("이름 입력: ");
        String memberName = scanner.next();
        System.out.println("전화번호 입력: ");
        String memberMobile = scanner.next();

        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result = memberRepository.join(memberDTO);
        if (result) {
            System.out.println("회원등록이 되었습니다.");
        } else {
            System.out.println("회원등록에 실패하였습니다.");
        }
    }

    public void login() {
        System.out.println("이메일 입력: ");
        String memberEmail = scanner.next();
        System.out.println("비밀번호 입력: ");
        String memberPassword = scanner.next();

        MemberDTO memberDTO = memberRepository.login(memberEmail, memberPassword);
        loginEmail = memberEmail;
    }

    public void findAll() {
        memberRepository.findAll();

    }

    public void update() {
        if (loginEmail != null) {
            System.out.println("수정할 전화번호: ");
            String memberMobile = scanner.next();
            boolean updateResult = memberRepository.update(loginEmail,memberMobile);
            if (updateResult) {
                System.out.println("수정성공");
            } else {
                System.out.println("수정실패");
            }
        } else {
            System.out.println("로그인을 해주세요");
        }
    }

    public void memberDelete() {
        if (loginEmail != null) {
            System.out.println("비밀번호 입력: ");
            String memberPassword = scanner.next();
//            boolean result = memberRepository.memberDelete(memberPassword);
            MemberDTO memberDTO = memberRepository.login(loginEmail, memberPassword);
            if (memberDTO != null) {
                boolean result = memberRepository.memberDelete(loginEmail);
                if (result) {
                    System.out.println("회원탈퇴 완료");
                } else {
                    System.out.println("회원탈퇴 실패");
                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다 메인매뉴로 돌아갑니다");
            }

        } else {
            System.out.println("로그인을 하세요");
        }
    }

    public void logout() {
        loginEmail = null;
        System.out.println("로그아웃 되었습니다.");
    }
}
