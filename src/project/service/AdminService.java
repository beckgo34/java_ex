package project.service;

import project.common.CommonVariables;
import project.dto.AdminDTO;
import project.dto.GoodsDTO;
import project.repository.AdminRepository;

import java.util.Map;
import java.util.Scanner;

public class AdminService {
    Scanner scanner = new Scanner(System.in);
    AdminRepository adminRepository = new AdminRepository();
    ProductPurchaseService productPurchaseService = new ProductPurchaseService();

    public void login() {
        System.out.println("이메일: ");
        String adminEmail = scanner.next();
        System.out.println("비밀번호: ");
        String adminPass = scanner.next();
        AdminDTO adminDTO = adminRepository.login(adminEmail, adminPass);
        if (adminDTO != null) {
            CommonVariables.loginAdminEmail = adminEmail;
            System.out.println("관리자 로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
    public void goodsSave() {
        if (CommonVariables.loginAdminEmail != null) {
            System.out.println("상품이름: ");
            String productName = scanner.next();
            System.out.println("상품가격: ");
            int price = scanner.nextInt();
            System.out.println("수량: ");
            int quantity = scanner.nextInt();

            GoodsDTO goodsDTO = new GoodsDTO(productName, price, quantity);
            boolean result = adminRepository.goodsSave(goodsDTO);
            if (result) {
                System.out.println("상품등록 성공");
            } else {
                System.out.println("상품등록 실패");
            }
        }else{
            System.out.println("로그인을 해야합니다");
        }
    }


    public void list() {
        if (CommonVariables.loginAdminEmail != null) {
            Map<Long, GoodsDTO> goodsDTOMap = adminRepository.list();
//            for (Long i : goodsDTOMap.keySet()) {
                System.out.println(goodsDTOMap);
//            }
        }
    }
}
