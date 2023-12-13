package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = {5, 2, 1, 3, 4 , 7, 6, 9, 10, 8};
        System.out.println("숫자 입력");
        int input = scanner.nextInt();
        for (int i = 0; i < num.length; i++) {
           if(input == num[i]){
               System.out.println("인덱스 번호 "+ i);

           }
        }
    }
}
