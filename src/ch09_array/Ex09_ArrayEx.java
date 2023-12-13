package ch09_array;

import java.util.Scanner;

public class Ex09_ArrayEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = 0;
        int[] score = new int[2];
        int scoreSum = 0;
        int max = score[0];
        boolean run = true;
        while (run) {
            System.out.println();
            System.out.println("1.학생수 입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
            System.out.println();
            System.out.print("선택> ");
            int select = scanner.nextInt();
            if (select == 1) {
                System.out.print("학생수> ");
                student = scanner.nextInt();
                score = new int[student];
                System.out.println(score.length);

            } else if (select == 2) {
                for (int i = 0; i < score.length; i++) {
                    System.out.print(i + 1 + "번 학생 점수: ");
                    score[i] = scanner.nextInt();
                    scoreSum += score[i];
                }

            } else if (select == 3) {
                for (int i = 0; i < score.length; i++) {
                    System.out.print(i + 1 + "번 학생 점수: ");
                    System.out.println(score[i]);
                }

            } else if (select == 4) {
                for (int i = 0; i < score.length; i++) {
                    if (score[i] > max) {
                        max = score[i];
                    }
                }
                System.out.println("최고점수: " + max);
                System.out.println("평균점수: " + (double) scoreSum / score.length);
                System.out.println("1등: " + max);

            } else if (select == 5) {
                run = false;
                System.out.println("프로그램 종료");
            }
        }
    }
}