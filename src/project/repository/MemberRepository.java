package project.repository;

import project.dto.MemberDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();
    public MemberDTO login(String memberEmail, String memberPass) {
        for(Long i : memberDTOMap.keySet()){
            if(memberEmail.equals(memberDTOMap.get(i).getMemberEmail()) && memberPass.equals(memberDTOMap.get(i).getMemberpass())){
                return memberDTOMap.get(i);
            }
        }
        return null;
    }


    public boolean emailCheck(String memberEmail) {
        for (Long i : memberDTOMap.keySet()){
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())){
                return false;
            }
        }
        return true;
    }


    public boolean save(MemberDTO memberDTO) {
        MemberDTO memberDTO1 = memberDTOMap.put(memberDTO.getId(), memberDTO);
        if(memberDTO1 == null){
            return true;
        }else {
            return false;
        }
    }


    public boolean update(String memberPass, String memberMobile) {
        for (Long i : memberDTOMap.keySet()){
            if (memberPass.equals(memberDTOMap.get(i).getMemberpass())){
                memberDTOMap.get(i).setMemberMoblie(memberMobile);
                return true;
            }
        }
        return false;
    }

    public MemberDTO find(String memeberPass) {
        for (Long i : memberDTOMap.keySet()){
            if (memeberPass.equals(memberDTOMap.get(i).getMemberpass())){
                return memberDTOMap.get(i);
            }
        }
        return null;
    }

    public boolean delete(String memberPass) {
        for (Long i : memberDTOMap.keySet()){
            if (memberPass.equals(memberDTOMap.get(i).getMemberpass())){
                memberDTOMap.remove(i);
                return true;
            }
        }
        return false;
    }
}
