package ch10_class.ex10;

import java.util.Scanner;

public class Member {
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;


    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }


    @Override
    public String toString() {
        return "Member{" +
                "memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }

    public boolean memberLogin(String memberEmail, String memberPassword) {
        boolean result = false;
        if (memberEmail.equals(getMemberEmail())  && memberPassword.equals(getMemberPassword()) ) {
            System.out.println("로그인 성공");
              result = true;
//            return true;
        } else {
            System.out.println("아이디 또는 비밀번호가 일치하지 않습니다");
            result =false;
//            return  false;
        }
        return result;
    }

}


