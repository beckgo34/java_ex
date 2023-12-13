package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {

    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        // 최대값을 담기 위한 변수
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("입력: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("최대값: " + max);

    }
}
