package ch11_classes.ex03;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean join(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("로그인 실패");
            }
        }
        return memberDTO;
    }

    public void findAll() {
        for (int i = 0; i < memberDTOList.size(); i++) {
            System.out.println(memberDTOList.get(i));
        }
    }


    public boolean update(String loginEmail, String memberMobile) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())){
            memberDTOList.get(i).setMemberMobile(memberMobile);
            result = true;
            }
        }
        return result;
    }

    public boolean memberDelete(String loinEmail) {
        boolean result = false;
        for (int i = 0; i < memberDTOList.size(); i++) {
//            if (memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
//                memberDTOList.remove(i);
//                result = true;
                if (loinEmail.equals(memberDTOList.get(i).getMemberEmail())){
                    memberDTOList.remove(i);
                    result = true;
            }
        }
        return result;
    }

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberEmail.equals(memberDTOList.get(i).getMemberEmail())){
                // 중복되는 이메일이 있다 => 결과를 false로 주자
                result = false;
            }
        }
        return  result;
    }
}
