package ch04_if;

import java.util.Scanner;

public class Ex08_IfExample {

	public static void main(String[] args) {
		/**
		 * 서로 다른 정수 3개를 입력받아서 가장 큰 정수 출력하기
		 * (같은 숫자는 입력하지 않는다고 가정)
		 * 입력 예:
		 * 첫번째숫자:
		 * 두번째숫자:
		 * 세번째숫자:
		 * 
		 * 출력 예
		 *  가장 큰 숫자는 00 입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째숫자: ");
		int num1 = scanner.nextInt();
		System.out.println("두번째숫자: ");
		int num2 = scanner.nextInt();
		System.out.println("세번째숫자: ");
		int num3 = scanner.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("가장큰 숫자는"+num1+"입니다");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("가장큰 숫자는"+num2+"입니다");
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("가장큰 숫자는"+num3+"입니다");
		}
		
	}
}
