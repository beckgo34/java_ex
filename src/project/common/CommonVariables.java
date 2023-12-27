package project.common;

import project.dto.AdminDTO;

public class CommonVariables {
    static AdminDTO adminDTO = new AdminDTO();
    public static String loginEmail = null;
    public static String loginAdminEmail = adminDTO.getAdminEmail();
}
