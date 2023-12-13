package ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
		/**
		 * 성적 풀력 예제 응용
		 * 입력값 학년(year), 점수(score)
		 * 처리
		 *  - 1~3학년은 60점 이상이면 합격
		 *  - 4학년은 70점 이상이어야 합격
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("학년");
		int year = scanner.nextInt();
		System.out.println("점수");
		int score = scanner.nextInt();
		
		if(year <= 3  && score >= 60) {
			System.out.println("합격");
		}else if (year == 4 && score >= 70){
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}
