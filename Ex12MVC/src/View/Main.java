package View;

import java.util.Scanner;

import Controller.Controller;

public class Main {

	public static void main(String[] args) {
		// [View]
		
		
		
		// MVC
		// View : 사용자에게 시각적으로 보여줄 수 있는 역할
		// Controller : 사용자의 요청을 전처리해서, Model/View에 전달하는 역할
		// Model : 데이터 처리, 데이터베이스 관련 기능 역할
		
		// MVC 패턴의 장점 : 확장이 용이, 유지보수 편리
		
		// 실행순서
		// 1. 사용자 요청 발생(View)
		// 2. View > Controller 요청 전달
		// 3. Controller > Model  로직실행 요청
		// 4. Model > Controller 응답데이터 전송
		// 5. Controller > View 결과물 전달
		
		Scanner sc = new Scanner(System.in);
		
		Controller control = new Controller();
		
		System.out.println("메뉴 선택 >> ");
		int input = sc.nextInt();
		
		if(input==1) {
			System.out.println("==회원가입==");
			System.out.println("ID : ");
			String id = sc.next();
			System.out.println("PW : ");
			String pw = sc.next();
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			
			// Controller 에 필요한 정보를 담아서, 로직을 수행하게끔 요청을 보냄
			// Model 이 로직을 수행하게끔
			// Controller의 Con_join : View에서 받은 정보를 Model에 전달
			int result = control.Con_join(id,pw,name,age);
			
			// return된 result의 값으로 성공 여부를 확인
			if (result>0) {
				System.out.println("회원가입 성공");
			}else 
				System.out.println("회원가입 실패");
		}
		
		
		
		
	}

}
