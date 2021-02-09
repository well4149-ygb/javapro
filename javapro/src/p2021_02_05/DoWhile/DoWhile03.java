package p2021_02_05.DoWhile;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메세지를 입력하세요?");
		System.out.println("프로그램을 종료하려면 q를 입력하세요?");
		
		Scanner sc =  new Scanner(System.in);
		String input;
		
		do {
			System.out.print(">");
			input  = sc.nextLine();			// 문자로 입력 받는다.
			System.out.println("입력 문자:"+input);
		}while(!input.equals("q"));
		
		System.out.println("프로그램 종료");
		
	}

}
