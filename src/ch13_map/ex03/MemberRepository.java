package ch13_map.ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();

    public boolean join(MemberDTO memberDTO) {
        MemberDTO memberDTO1 = memberDTOMap.put(memberDTO.getId(), memberDTO);
        if (memberDTO1 == null) {
            return true;
        } else {
            return false;
        }

    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail()) && memberPassword.equals(memberDTOMap.get(i).getMemberEmail())) {
                return memberDTOMap.get(i);
            }
        }
        return null;
    }

    public Map<Long,MemberDTO> findAll() {
        return memberDTOMap;
            }


    public boolean update(String loginEmail, String memberMobile) {
        for (Long i : memberDTOMap.keySet()) {
            if (loginEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                memberDTOMap.get(i).setMemberMobile(memberMobile);
                return true;
            }
        }
        return false;
    }

    public boolean memberDelete(String loinEmail) {
        for (Long i : memberDTOMap.keySet()) {
            if (loinEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                memberDTOMap.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean emailCheck(String memberEmail) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                return false;
            }
        }
        return true;
    }
}
