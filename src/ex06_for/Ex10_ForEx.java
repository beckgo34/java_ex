package ex06_for;

import java.util.Scanner;

public class Ex10_ForEx {
    public static void main(String[] args) {
        /**
         * 정수를 하나 입력 받고
         * 1부터 입력받은 정수까지의 정수 중에서
         * 2의 배수, 3의 배수를 제외한 수의 총 합 출력
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력: ");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++ ){

            if(i % 2 != 0 && i % 3 != 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
