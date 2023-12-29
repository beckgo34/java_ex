package project.service;

import project.common.CommonVariables;
import project.dto.AdminDTO;
import project.dto.GoodsDTO;
import project.repository.AdminRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AdminService {
    Scanner scanner = new Scanner(System.in);
    AdminRepository adminRepository = new AdminRepository();

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
         List<GoodsDTO> goodsDTOList = adminRepository.list();
            System.out.println(goodsDTOList);
        }

    public void purchasePrice() {
            AdminDTO adminDTO = new AdminDTO();
            System.out.println(adminDTO.getAdminAccount());
        }
    public void goodsLiquidSave() {
        List<GoodsDTO> goodsDTOList = adminRepository.goodsLiqudSave();
        System.out.println(goodsDTOList);
    }
    public void goodsCoilSave() {
        List<GoodsDTO> goodsDTOList = adminRepository.goodsCoilSave();
        System.out.println(goodsDTOList);
    }
    public void goodsPodsSave() {
        List<GoodsDTO> goodsDTOList = adminRepository.goodsPodsSave();
        System.out.println(goodsDTOList);
    }
    }

