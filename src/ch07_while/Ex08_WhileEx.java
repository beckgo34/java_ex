package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dp = 0;  //입금
        int wd = 0;  //출금
        int bl = 0;  //잔액
        int input = 0;  //선택
        boolean run = true;
        while (run){
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            input = scanner.nextInt();
            if(input == 1){
                System.out.println("선택>"+ input);
                System.out.println("예금액>");
                dp = scanner.nextInt();
                System.out.println("현재잔액은 " + dp + "입니다.");
            }else if (input == 2 ) {
                System.out.println("선택>" + input);
                System.out.println("출금액>");
                wd = scanner.nextInt();
                if (dp > wd){
                    System.out.println("현재 잔액은" + (dp-wd) +"입니다");
                }else if(dp < wd) {
                    System.out.println("잔고가 부족합니다");
                    System.out.println("현재잔액은" + dp + "입니다");
                }
            }else if(input == 3){
                System.out.println("선택>" + input);
                System.out.println("현재 잔액은 " + wd +"입니다.");
            }else{
                System.out.println("선택>" + input);
                System.out.println("종료합니다.");
                run = false;
            }
        }

    }
}
