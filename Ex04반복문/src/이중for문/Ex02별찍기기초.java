package 이중for문;

public class Ex02별찍기기초 {

	public static void main(String[] args) {

//		***** 출력

//		for(int i=0;i<5;i++) {  	//0부터 4까지 5회 반복
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for (int j = 1; j <= 5; j++) {

			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
