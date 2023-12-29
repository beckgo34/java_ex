package project.dto;

public class AdminDTO {
    private String AdminEmail = "admin";
    private String AdminPass = "aa";
    private int AdminAccount;

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

    public int getAdminAccount() {
        return AdminAccount;
    }

    public void setAdminAccount(int adminAccount) {
        AdminAccount = adminAccount;
    }

    public AdminDTO() {
    }

    public AdminDTO(String adminEmail, String adminPass, int adminAccount) {
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
