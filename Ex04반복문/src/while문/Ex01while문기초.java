package while문;

import java.util.Scanner;

public class Ex01while문기초 {

	public static void main(String[] args) {
//		while문 구조
//		while(반복조건) {
//			반복조건이 참일 때마다 실행할 구문
//		}

//		[예제] 사용자가 입력한 값이 10 미만이라면 계속 입력받기
//		  > 사용자가 10 이상을 입력하면 종료.

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		while (input < 10) {
			input = sc.nextInt();
		}System.out.println("종료");

	}

}
