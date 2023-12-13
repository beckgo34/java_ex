package ch09_array;

import java.util.Scanner;

public class Ex03_ArrayEx {

    public static void main(String[] args) {
        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행 했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자 입력: ");
        int num1 = scanner.nextInt();
        System.out.println("두번째 숫자 입력: ");
        int num2 = scanner.nextInt();
        System.out.println("세번째 숫자 입력: ");
        int num3 = scanner.nextInt();

        int[] numbers1 = {num1, num2, num3};
        int sum = 0;
        for(int i = 0; i < numbers1.length; i++){
            sum += numbers1[i];
        }
        System.out.println("입력받은 세 수의 합 = " + sum );
        System.out.println("avg = " + sum / numbers1.length);
    }
}
