package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;
        boolean run = true;
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
        while (run){
            num = scanner.nextInt();
            System.out.println("num = " + num);
            if(num == 0){
                run = false;
            }else {
                sum += num;
                count++;
            }
        }
        int avg1 = sum / count;
        System.out.println("avg1 = " + avg1);
        double avg2 = sum / count;
        System.out.println("avg2 = " + avg2);
        double avg3 = (double) sum / count;
        System.out.println("avg3 = " + avg3);
        }
    }
