package project.service;

import project.common.CommonVariables;
import project.dto.MemberDTO;
import project.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    public void save() {
        boolean checkResult = false;
        String memberEmail = null;
        do {
        System.out.println("이메일: ");
        memberEmail = scanner.next();
        checkResult = memberRepository.emailCheck(memberEmail);
        if (checkResult){
            System.out.println("사용 가능한 이메일입니다");
        }else {
            System.out.println("이미 사용중인 이메일입니다");
        }
        }while (!checkResult);
        System.out.println("비밀번호: ");
        String memberPass = scanner.next();
        System.out.println("이름: ");
        String memberName = scanner.next();
        System.out.println("전화번호: ");
        String memberMobile = scanner.next();

        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPass, memberName, memberMobile);
        boolean result = memberRepository.save(memberDTO);
        if (result){
            System.out.println("회원가입 성공");
        }else {
            System.out.println("회원가입 실패");
        }
    }

    public void login() {
        System.out.println("이메일: ");
        String memberEmail = scanner.next();
        System.out.println("비밀번호: ");
        String memberPass = scanner.next();
        MemberDTO memberDTO = memberRepository.login(memberEmail,memberPass);
        if(memberDTO != null){
            System.out.println(memberEmail + "님 환영합니다");
        }else{
            System.out.println("이메일 또는 비밀번호가 틀렸습니다.");
        }

    }

    public void update() {
        if (CommonVariables.loginEmail != null){
            System.out.println("비밀번호: ");
            String memberPass = scanner.next();
            System.out.println("수정할 전화번호: ");
            String memberMobile = scanner.next();
            boolean result = memberRepository.update(memberPass,memberMobile);
            if (result){
                System.out.println("수정성공");
            }else {
                System.out.println("수정실패");
            }
        }
    }

    public void find() {
        if (CommonVariables.loginEmail != null){
            System.out.println("비밀번호: ");
            String memeberPass = scanner.next();
            MemberDTO memberDTO = memberRepository.find(memeberPass);
            if (memberDTO != null){
                System.out.println(memberDTO);
            }
        }
    }

    public void delete() {
        System.out.println("비밀번호: ");
        String memberPass = scanner.next();
        boolean result = memberRepository.delete(memberPass);
        if(result){
            System.out.println("회원탈퇴 성공");
        }else {
            System.out.println("회원탈퇴 실패");
        }
    }
}
