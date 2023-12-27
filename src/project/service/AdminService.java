package project.service;

import project.common.CommonVariables;
import project.dto.GoodsDTO;
import project.repository.AdminRepository;

import java.util.Scanner;

public class AdminService {
    Scanner scanner = new Scanner(System.in);
    AdminRepository adminRepository = new AdminRepository();
    ProductPurchaseService productPurchaseService = new ProductPurchaseService();
    public void goodsSave() {
        if (CommonVariables.loginAdminEmail != null) {
            System.out.println("상품이름: ");
            String productName = scanner.next();
            System.out.println("상품가격: ");
            Long price = scanner.nextLong();
            System.out.println("수량: ");
            int quantity = scanner.nextInt();

            GoodsDTO goodsDTO = new GoodsDTO(productName, price, quantity);
            boolean result = adminRepository.goodsSave(goodsDTO);
            if (result) {
                System.out.println("상품등록 성공");
            } else {
                System.out.println("상품등록 실패");
            }
        }
    }

//    public void list() {
//        if (CommonVariables.loginAdminEmail != null){
//            System.out.println("비밀번호: ");
//            String memberPass = scanner.next();
//            GoodsDTO goodsDTO = adminRepository.list(memberPass);
//            if (goodsDTO != null){
//                System.out.println(goodsDTO);
//            }else {
//                System.out.println("등록된 상품이 없습니다");
//            }
//        }
//    }
}
