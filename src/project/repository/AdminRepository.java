package project.repository;

import project.common.CommonVariables;
import project.dto.AdminDTO;
import project.dto.GoodsDTO;
import project.service.GoodsService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminRepository {
    public List<GoodsDTO> goodsDTOList = new ArrayList<>();

//    List<AdminDTO> adminDTOList = new ArrayList<>();

    public boolean goodsSave(GoodsDTO goodsDTO) {
        return goodsDTOList.add(goodsDTO);
    }

    public AdminDTO login(String adminEmail, String adminPass) {
        AdminDTO adminDTO = new AdminDTO();
        if (adminEmail.equals(adminDTO.getAdminEmail()) && adminPass.equals(adminDTO.getAdminPass())) {
            return adminDTO;
        }
        return null;
    }

    public List<GoodsDTO> list() {
        return goodsDTOList;
    }
}
