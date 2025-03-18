package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Model.MemberDTO;

public class Main {

	private static final String ArrayList = null;

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
		// 3. Controller > Model 로직실행 요청
		// 4. Model > Controller 응답데이터 전송
		// 5. Controller > View 결과물 전달

		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();
		while (true) {
			System.out.print("메뉴 선택 [1] 회원가입 [2] 전체회원조회 [3] 회원정보수정 [4] 회원탈퇴 [5] 종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
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
				int result = control.Con_join(id, pw, name, age);

				// return된 result의 값으로 성공 여부를 확인
				if (result > 0) {
					System.out.println("회원가입 성공");
				} else
					System.out.println("회원가입 실패");
			} else if (input == 2) {
				// 전체 회원조회
//			MemberDTO조회
				ArrayList<MemberDTO> result = control.Con_List();
				for (int i = 0; i < result.size(); i++) {
					System.out.println(
							result.get(i).getId() + "\t" + result.get(i).getName() + "\t" + result.get(i).getAge());
				}
//			int select = control.Con_Select();
			} else if (input == 3) {
				// 회원정보수정
				// 아이디,비밀번호를 입력하면 그에 맞는 회원의 이름을 수정
				System.out.println("ID 입력 : ");
				String id = sc.next();
				System.out.println("PW 입력 : ");
				String pw = sc.next();
				System.out.println("변경할 이름 : ");
				String name = sc.next();
				int result = control.Con_update(id, pw, name);

				if (result > 0) {
					System.out.println("정보수정 완료");
				} else {
					System.out.println("정보수정 실패");
				}
			} else if (input == 4) {
				System.out.println("ID 입력");
				String id = sc.next();
				System.out.println("PW 입력");
				String pw = sc.next();

//			1. 필요한 정보를 담아서 컨트롤러에 요청
//			2. 컨트롤러에서 정보를 전처리해서 모델로 요청
//			3. 모델에서 정보를 활용해서 기능 수행 > 성공여부 리턴 (delete는 int형태)
//			4. 모델 > 컨트롤러로 리턴
//			5. 컨트롤러 > 뷰로 최종 리턴
//			6. 뷰에서 리턴값을 활용한 안내문

				int result = control.Con_delete(id, pw);
				if (result > 0) {
					System.out.println("회원탈퇴 완료");
				} else {
					System.out.println("입력한 정보가 틀렸습니다");
				}
			} else if (input == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}

}
