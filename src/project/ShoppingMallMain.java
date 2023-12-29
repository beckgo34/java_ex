package project;

import project.common.CommonVariables;
import project.dto.AdminDTO;
import project.service.AdminService;
import project.service.GoodsService;
import project.service.MemberService;
import project.service.PurchaseService;

import java.util.Scanner;

public class ShoppingMallMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PurchaseService purchaseService = new PurchaseService();
        MemberService memberService = new MemberService();
        AdminService adminService = new AdminService();
        boolean run = true;
        int selectNo = 0;
        GoodsService goodsService = new GoodsService();

        while (run) {
            goodsService.GoodsLiquidAdd();
            goodsService.GoodsCoilAdd();
            goodsService.GoodsPodsAdd();
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("============= 쥬링쥬스는 로그인을 하셔야 서비스를 이용하실 수 있습니다 =============");
            System.out.println("1.로그인 | 2.일반회원가입 | 3.회원정보수정 | 4.회원정보 | 5.회원탈퇴 | 6.로그아웃| 7.프로그램 종료");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.print("선택: ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                boolean runLogin = true;
                while (runLogin) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("1.일반회원 로그인 | 2.판매자회원 로그인 | 3.뒤로가기");
                    System.out.println("-----------------------------------------------");
                    System.out.println("선택: ");
                    int selcetLogin = scanner.nextInt();
                    if (selcetLogin == 1) {
                        memberService.login();
                        boolean runPurchase = true;
                        if (CommonVariables.loginEmail != null)
                            while (runPurchase) {
                                System.out.println("-------------------------------------------");
                                System.out.println("1.액상구매 | 2.코일구매 | 3.팟구매 | 4.뒤로가기");
                                System.out.println("-------------------------------------------");
                                System.out.println("선택: ");
                                int selectPurchase = scanner.nextInt();
                                if (selectPurchase == 1) {
                                        purchaseService.liquidPurchase();
                                } else if (selectPurchase == 2) {

                                } else if (selectPurchase == 3) {

                                } else if (selectPurchase == 4) {
                                    runPurchase = false;
                                }
                            }
                    } else if (selcetLogin == 2) {
                        adminService.login();
                        AdminDTO adminDTO = new AdminDTO();
                        boolean runSeller = true;
                        if (CommonVariables.loginAdminEmail != null) {
                            while (runSeller) {
                                System.out.println("1.재품등록 | 2.재품목록 | 3.판매금액 | 4.뒤로가기");
                                System.out.println("선택: ");
                                int selectSeller = scanner.nextInt();
                                if (selectSeller == 1) {
                                    adminService.goodsSave();
                                } else if (selectSeller == 2) {
                                    adminService.list();
                                } else if (selectSeller == 3) {
                                    adminService.purchasePrice();
                                } else if (selectSeller == 4)
                                    runSeller = false;
                            }
                        } else {
                            runLogin = false;
                        }
                    } else if (selcetLogin == 3) {
                        runLogin = false;
                    } else if (selcetLogin == 4) {
                        runLogin = false;

                    }
                }
            } else if (selectNo == 2) {
                memberService.save();
            } else if (selectNo == 3) {
                memberService.update();
            } else if (selectNo == 4) {
                memberService.find();
            } else if (selectNo == 5) {
                memberService.delete();
            } else if (selectNo == 6) {
                CommonVariables.loginEmail = null;
                System.out.println("로그아웃 되었습니다");
            } else if (selectNo == 7) {
                System.out.println("프로그램 종료");
                run = false;
            } else {
                System.out.println("번호를 확인해주세요");
            }
        }
    }
}

