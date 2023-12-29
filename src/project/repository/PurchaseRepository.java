package project.repository;

import project.dto.AdminDTO;
import project.dto.GoodsDTO;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRepository {
    List<GoodsDTO> goodsDTOList = new ArrayList<>();
    AdminRepository adminRepository = new AdminRepository();
    int purchasePrice = 0;

    public boolean liquidPurchase(Long id) {
        for (int i = 0; i < goodsDTOList.size(); i++) {
            if (id.equals(goodsDTOList.get(i).getProductId())) {
                goodsDTOList.get(i).setQuantity(-1);
                purchasePrice = goodsDTOList.get(i).getPrice();
                purchasePrice += purchasePrice;
                AdminDTO adminDTO = new AdminDTO();
                adminDTO.setAdminAccount(purchasePrice);
                return true;
            }
        }
        return false;
    }
}

