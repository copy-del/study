package View;

import java.util.Scanner;

import Controller.Controller;


public class Main {

	public static void main(String[] args) {
		Controller control = new Controller();
		Scanner sc = new Scanner(System.in);

		// 경비원과 결투를 벌인다
		int fight = control.Con_fight();

	}

}
