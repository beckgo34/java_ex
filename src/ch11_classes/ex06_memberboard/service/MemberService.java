package ch11_classes.ex06_memberboard.service;

import ch11_classes.ex06_memberboard.common.CommonVariables;
import ch11_classes.ex06_memberboard.dto.MemberDTO;
import ch11_classes.ex06_memberboard.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    MemberRepository memberRepository = new MemberRepository();

    Scanner scanner = new Scanner(System.in);

    public void sava() {
        String memberEmail = null;
        boolean checkResult = false;
        System.out.println("회원가입 메뉴");
        do {
            System.out.print("이메일: ");
            memberEmail = scanner.next();
            checkResult = memberRepository.memberCheck(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일입니다");
            } else {
                System.out.println("이미 등록된 이메일입니다");
            }
        } while (!checkResult);
        System.out.println("비밀번호: ");
        String memberPassword = scanner.next();
        System.out.println("이름: ");
        String memberName = scanner.next();
        System.out.println("전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memberMobile);
        boolean result = memberRepository.sava(memberDTO);
        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }

    public void login() {
        System.out.println("이메일: ");
        String memberEmail = scanner.next();
        System.out.println("비밀번호: ");
        String memberPassword = scanner.next();
        MemberDTO memberDTO = memberRepository.login(memberEmail, memberPassword);
        if (memberDTO != null) {
            CommonVariables.loginEmail = memberEmail;
            System.out.println(CommonVariables.loginEmail + "님 환영합니다");
        } else {
            System.out.println("로그인 실패");
        }
    }

    public void memberList() {
        List<MemberDTO> memberDTOList = memberRepository.findMember();
        System.out.print(memberDTOList);
    }

    public void update() {
        if(CommonVariables.loginEmail != null){
            System.out.println("비밀번호: ");
            String memberPassword = scanner.next();
            System.out.println("전화번호 입력: ");
            String memberMobile = scanner.next();
            MemberDTO memberDTO = memberRepository.update(memberPassword,memberMobile);
            if (memberDTO != null) {
                System.out.println("수정성공");
            } else {
                System.out.println("수정실패");
            }
        }
    }

    public void delete() {
        if (CommonVariables.loginEmail != null) {
            System.out.println("비밀번호 입력: ");
            String memberPassword = scanner.next();
            boolean result = memberRepository.delete(memberPassword);
            if (result) {
                System.out.println("회원탈퇴 성공");
            } else {
                System.out.println("회원탈퇴 실패");
            }
        }
    }

    public void logout() {
        CommonVariables.loginEmail = null;
        if (CommonVariables.loginEmail == null){
            System.out.println("로그아웃 성공");
        }
    }
}
