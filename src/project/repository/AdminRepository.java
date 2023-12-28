package project.repository;

import project.common.CommonVariables;
import project.dto.AdminDTO;
import project.dto.GoodsDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminRepository {
    public static Map<Long, GoodsDTO> adminDTOMap = new HashMap<>();
    public static List<AdminDTO> adminDTOList = new ArrayList<>();

    static {
        GoodsDTO.GoodsLiquidAdd();
    }


    public boolean goodsSave(GoodsDTO goodsDTO) {
        GoodsDTO goodsDTO1 = adminDTOMap.put(goodsDTO.getProductId(), goodsDTO);
        if (goodsDTO1 == null) {
            return true;
        } else {
            return false;
        }
    }


    public AdminDTO login(String adminEmail, String adminPass) {
        AdminDTO adminDTO = new AdminDTO();
        if (adminEmail.equals(adminDTO.getAdminEmail()) && adminPass.equals(adminDTO.getAdminPass())) {
            return adminDTO;
        }
        return null;
    }


    public Map<Long, GoodsDTO> list() {
        System.out.println();
        return adminDTOMap;

    }
}
