package project.repository;

import project.dto.AdminDTO;
import project.dto.GoodsDTO;

import java.util.HashMap;
import java.util.Map;

public class AdminRepository {
    public static Map<Long, GoodsDTO> adminDTOMap = new HashMap<>();

    public boolean goodsSave(GoodsDTO goodsDTO) {
        GoodsDTO goodsDTO1 = adminDTOMap.put(goodsDTO.getProductId(), goodsDTO);
        if (goodsDTO1 == null){
            return true;
        }else {
            return false;
        }
    }
}
