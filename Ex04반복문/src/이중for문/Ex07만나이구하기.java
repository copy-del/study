package 이중for문;

import java.util.Scanner;

public class Ex07만나이구하기 {

	public static void main(String[] args) {
//			만 나이 구하기) (프로그래머스 문제는 아니에요!)★★
//		사용자가 년, 월, 일에 해당하는 숫자를 입력하면
//		2000년 3월 5일생의 만 나이를 출력하기
//		=> 2000, 3, 5  --- 만 25세

		Scanner sc = new Scanner(System.in);
		System.out.println("사용자의 연도를 입력하시오 : ");
		int y = sc.nextInt();
		System.out.println("사용자의 월을 입력하시오 : ");
		int m = sc.nextInt();
		System.out.println("사용자의 일을 입력하시오 : ");
		int d = sc.nextInt();

		switch (m) {
		case 4, 5, 6, 7, 8, 9, 10, 11, 12:
			System.out.println("만 " + (2025 - y) + "세");
			break;
		case 1, 2:
			System.out.println("만 " + ((2025 - y) + 1) + "세");
			break;
		case 3:
			if (d > 5) {
				System.out.println("만 " + (2025 - y) + "세");
			}

			else if (d <= 5) {
				System.out.println("만 " + ((2025 - y) + 1) + "세");
			}
			break;

		}

	}

}
