package project.service;

import project.dto.GoodsDTO;
import project.repository.AdminRepository;
import project.repository.PurchaseRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PurchaseService {
    PurchaseRepository purchaseRepository = new PurchaseRepository();
    AdminService adminService = new AdminService();
    AdminRepository adminRepository = new AdminRepository();
    Scanner scanner = new Scanner(System.in);

    public void liquidPurchase() {
        adminRepository.list();
        System.out.println("구매상품id: ");
        Long id = scanner.nextLong();
        boolean result = purchaseRepository.liquidPurchase(id);
        if (result) {
            System.out.println("구매에 성공");
        }else {
            System.out.println("구매 실패");
        }
    }
    public void coilPurchase() {
        adminRepository.list();
        System.out.println("구매상품id: ");
        Long id = scanner.nextLong();
        boolean result = purchaseRepository.liquidPurchase(id);
        if (result) {
            System.out.println("구매에 성공");
        }else {
            System.out.println("구매 실패");
        }
    }
}

