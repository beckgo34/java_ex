package ch15_interface.ex02;

public interface MemberRepository {

    boolean save(MemberDTO memberDTO);

    Object findAll();

    MemberDTO login(String memberEmail, String memberPassword);

    boolean update(String loginEmail, String mobile);

    boolean delete(String loginEmail);


    boolean emailCheck(String memberEmail);

}
