package ch09_array;

import java.util.Scanner;

public class Ex05_ArrayEx {

    public static void main(String[] args) {
        /**
         * 거스름돈 계산하기
         * 필요한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계산
         * 예)
         *      170 이라고 입력하면
         *      100원 1개
         *      50원 1개
         *      10원 2개
         *
         *      780 이라고 입력하면
         *      500 1개
         *      100원 2개
         *      50원 1개
         *      10원 3개
         */
        int[] coin = {500, 100, 50 ,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액입력: ");
        int money = scanner.nextInt();
        // 거스름돈/ 돈정 = 몫(갯수)
        for (int i = 0; i < coin.length; i++) {
            System.out.println(coin[i] + "원" + money / coin[i]);
            // 나머지를 다음번에 계산에 활용
            money %= coin[i];

        }
    }
}
