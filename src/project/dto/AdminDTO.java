package project.dto;

public class AdminDTO {
    private String AdminEmail = "admin";
    private String AdminPass = "1234";
    private Long AdminAccount;

    public String getAdminEmail() {
        return AdminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        AdminEmail = adminEmail;
    }

    public String getAdminPass() {
        return AdminPass;
    }

    public void setAdminPass(String adminPass) {
        AdminPass = adminPass;
    }

    public Long getAdminAccount() {
        return AdminAccount;
    }

    public void setAdminAccount(Long adminAccount) {
        AdminAccount = adminAccount;
    }

    public AdminDTO() {
    }

    public AdminDTO(String adminEmail, String adminPass, Long adminAccount) {
        AdminEmail = adminEmail;
        AdminPass = adminPass;
        AdminAccount = adminAccount;
    }

    @Override
    public String toString() {
        return "AdminDTO{" +
                "AdminEmail='" + AdminEmail + '\'' +
                ", AdminPass='" + AdminPass + '\'' +
                ", AdminAccount=" + AdminAccount +
                '}';
    }
}
