package ch10_class.ex07;

import java.util.Scanner;

public class Calculator {
    int sum;
    int sub;
    int mul;
    int div;
    Scanner scanner = new Scanner(System.in);
    public void sum(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void sub(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public int mul(int num1, int num2){
        int result =num1 * num2;
        return result;

    }
    public int div(){
        System.out.println("숫자입력> ");
        int num1 = scanner.nextInt();
        System.out.println("숫자입력> ");
        int num2 = scanner.nextInt();
        int result = num1 / num2;
        return result;
    }
}
