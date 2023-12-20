package ch11_classes.ex05;

import java.util.Scanner;

public class BankService {
    BankRepository bankRepository = new BankRepository();

    Scanner scanner = new Scanner(System.in);

    public void save() {
        System.out.println("고객계좌번호: ");
        String accountNember = scanner.next();
        System.out.println("비밀번호: ");
        String clientPass = scanner.next();
        System.out.println("고객이름: ");
        String clientName = scanner.next();
        ClientDTO clientDTO = new ClientDTO(accountNember, clientPass, clientName);
        boolean result = bankRepository.sava(clientDTO);
        if (result) {
            System.out.println("고객등록 성공");
        } else {
            System.out.println("고객등록 실패");
        }
    }

    public void findBalance() {
        System.out.println("계좌번호: ");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.findBalance(accountNumber);
        if (clientDTO != null) {
            System.out.println(clientDTO.getClientName() + "님의 잔액은" + clientDTO.getBalance() + "원 입니다");
            System.out.println(clientDTO.getBalance());
        } else {
            System.out.println("없는 계좌정보");
        }
    }

    public void deposit() {
        System.out.println("계좌번호: ");
        String accountNumber = scanner.next();
        System.out.println("입금액:");
        long deposit = scanner.nextLong();
        ClientDTO clientDTO = bankRepository.deposit(accountNumber, deposit);

        if (clientDTO != null) {
            System.out.println("입금 완료");
        } else {
            System.out.println("잘못된 계좌");
        }
    }

    public void withdraw() {
        System.out.println("계좌번호: ");
        String accountNumber = scanner.next();
        System.out.println("비밀번호: ");
        String clientPass = scanner.next();
        System.out.println("출금액: ");
        long withdraw = scanner.nextLong();
        boolean result = bankRepository.withdraw(accountNumber, clientPass, withdraw);
        if (result) {
            System.out.println("출금완료");
        } else {
            System.out.println("11");
        }

    }

    public void bankHistory() {
        System.out.println("---------------------------------------------");
        System.out.println("1.모든 내역 | 2.입금 내역 | 3.출금 내역 | 4.종료");
        System.out.println("---------------------------------------------");
        System.out.println("선택: ");
        int selectNo = scanner.nextInt();
        boolean run = true;
        while (run){
            if (selectNo == 1){

            }
        }
    }
}
