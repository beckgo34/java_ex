package project.dto;

public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberpass;
    private String memberName;
    private String memberMoblie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberpass() {
        return memberpass;
    }

    public void setMemberpass(String memberpass) {
        this.memberpass = memberpass;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMoblie() {
        return memberMoblie;
    }

    public void setMemberMoblie(String memberMoblie) {
        this.memberMoblie = memberMoblie;
    }

    public MemberDTO() {
    }

    public static Long idValue = 1L;
    public MemberDTO(String memberEmail, String memberpass, String memberName, String memberMoblie) {
        this.id = idValue++;
        this.memberEmail = memberEmail;
        this.memberpass = memberpass;
        this.memberName = memberName;
        this.memberMoblie = memberMoblie;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberpass='" + memberpass + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberMoblie='" + memberMoblie + '\'' +
                '}';
    }
}