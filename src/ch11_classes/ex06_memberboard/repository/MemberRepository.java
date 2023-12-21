package ch11_classes.ex06_memberboard.repository;

import ch11_classes.ex06_memberboard.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean memberCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                result = false;
            }
        }
        return result;
    }


    public boolean sava(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail()) && memberPassword.equals(memberDTOList.get(i).getMemberPassword())) {
                memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }

    public List<MemberDTO> findMember() {
        return memberDTOList;

    }

    public MemberDTO update(String memberPassword,String memberMobile) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
            memberDTOList.get(i).setMemberMobile(memberMobile);
            memberDTO = memberDTOList.get(i);
            }
        }
        return memberDTO;
    }


    public boolean delete(String memberPassword) {
        for (int i = 0; i < memberDTOList.size(); i++) {
            if(memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
                memberDTOList.remove(i);
                return true;
            }
        }
        return false;
    }
}
