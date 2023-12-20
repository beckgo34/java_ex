package ch11_classes.ex05;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankService bankService = new BankService();
        boolean run = true;
        int selectNo = 0;

        while (run) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("1.고객등록 | 2.잔액조회 | 3.입금 | 4.출금 | 5.거래내역확인 | 6.계좌이체 | 0.종료");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("선택: ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                bankService.save();
            } else if (selectNo == 2) {
                bankService.findBalance();
            } else if (selectNo == 3) {
                 bankService.deposit();
            } else if (selectNo == 4) {
                bankService.withdraw();
            } else if (selectNo == 5) {
                bankService.bankHistory();
            } else if (selectNo == 6) {

            } else if (selectNo == 0) {
                run = false;
            }
        }

    }
}
