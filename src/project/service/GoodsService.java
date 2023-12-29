package project.service;

import project.dto.GoodsDTO;
import project.repository.AdminRepository;

import java.util.ArrayList;
import java.util.List;

public class GoodsService {
    public AdminRepository adminRepository = new AdminRepository();

    public void GoodsLiquidAdd(){
        GoodsDTO goodsDTO1 = new GoodsDTO("알로에베라", 28000, 100);
        adminRepository.goodsSave(goodsDTO1);
        GoodsDTO goodsDTO2 = new GoodsDTO("라임소다", 28000, 100);
        adminRepository.goodsSave(goodsDTO2);
        GoodsDTO goodsDTO3 = new GoodsDTO("체리밤", 28000, 100);
        adminRepository.goodsSave(goodsDTO3);
        GoodsDTO goodsDTO4 = new GoodsDTO("라스트베리", 28000, 100);
        adminRepository.goodsSave(goodsDTO4);

    }
//    public void GoodsCoilAdd(){
//        GoodsDTO goodsDTO1 = new GoodsDTO("0.6옴", 3800, 100);
//        adminRepository.coliSave(goodsDTO1);
//        GoodsDTO goodsDTO2 = new GoodsDTO("0.8옴", 3800, 100);
//        adminRepository.coliSave(goodsDTO2);
//        GoodsDTO goodsDTO3 = new GoodsDTO("1.0옴", 3800, 100);
//        adminRepository.coliSave(goodsDTO3);
//    }
//
//    public void GoodsPodsAdd(){
//        GoodsDTO goodsDTO1 = new GoodsDTO("블랙공팟", 4500, 100);
//        adminRepository.goodsSave(goodsDTO1);
//        GoodsDTO goodsDTO2 = new GoodsDTO("클리어공팟", 4500, 100);
//        adminRepository.goodsSave(goodsDTO2);
//
//    }
}
