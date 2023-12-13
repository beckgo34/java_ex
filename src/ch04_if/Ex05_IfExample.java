package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력 받아서 양수, 음수, 0인지를 출력
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력");
		int num = scanner.nextInt();
		if(num > 0) {
			System.out.println("정수입니다");
		}else if(num < 0 ){
			System.out.println("음수입니다");
		}else{
			System.out.println("0입니다");

		}
	}
}
