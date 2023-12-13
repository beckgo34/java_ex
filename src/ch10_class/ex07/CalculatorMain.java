package ch10_class.ex07;

import java.util.Scanner;

public class CalculatorMain {
    /**
     * 실행하면 반복문으로 메뉴를 출력
     * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
     * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 출력함
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        int num1 = 0;
        int num2 = 0;
        boolean run = true;
        Calculator calculator = new Calculator();
        while (run){
            System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 다른숫자 입력시 종료.");
            System.out.print("매뉴를 입력하세요>");
            select = scanner.nextInt();
            if(select == 1){
                System.out.println("숫자입력> ");
                num1 = scanner.nextInt();
                System.out.println("숫자입력> ");
                num2 = scanner.nextInt();
                calculator.sum(num1, num2);
            } else if (select == 2) {
                System.out.println("숫자입력> ");
                num1 = scanner.nextInt();
                System.out.println("숫자입력> ");
                num2 = scanner.nextInt();
                calculator.sub(num1, num2);
            } else if (select == 3) {
                System.out.println("숫자입력> ");
                num1 = scanner.nextInt();
                System.out.println("숫자입력> ");
                num2 = scanner.nextInt();
                int result = calculator.mul(num1, num2);
                System.out.println(result);
            }
            else if (select == 4) {

                int result = calculator.div();
                System.out.println(result);

            }else {
                run = false;
            }
        }
    }
}
