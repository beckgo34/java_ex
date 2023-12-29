package project.repository;

import project.dto.AdminDTO;
import project.dto.GoodsDTO;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRepository {
    //    public List<GoodsDTO> goodsDTOList = new ArrayList<>();
    AdminRepository adminRepository = new AdminRepository();
    int purchasePrice = 0;

    public boolean liquidPurchase(Long id) {
        System.out.println("dkdk");
        for (int i = 0; i < adminRepository.goodsDTOList.size(); i++) {
            System.out.println(adminRepository.goodsDTOList.get(i));
            if (id.equals(adminRepository.goodsDTOList.get(i).getProductId())) {
                System.out.println("11");
            }
        }
        return false;
    }
}

//    public boolean liquidPurchase(Long id) {
//        System.out.println(goodsDTOList);
//        System.out.println("여기");
//        for (int i = 0; i < goodsDTOList.size(); i++) {
//            System.out.println("이랴");
//            if (id.equals(goodsDTOList.get(i).getProductId())) {
//                System.out.println(goodsDTOList.get(i));
//                goodsDTOList.get(i).setQuantity(-1);
//                purchasePrice = goodsDTOList.get(i).getPrice();
//                purchasePrice += purchasePrice;
//                AdminDTO adminDTO = new AdminDTO();
//                adminDTO.setAdminAccount(purchasePrice);
//                return true;
//            }
//        }
//        return false;
//    }
//}


