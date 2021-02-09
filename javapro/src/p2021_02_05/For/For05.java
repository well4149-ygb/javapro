package p2021_02_05.For;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 키보드로 입력한 구구단 1개단을 출력하는 프로그램을 작성하세요?
		
		System.out.println("원하는 단을 입력하세요?");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();		// dan = 5;
		
		System.out.println("["+dan+"단]");
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+ dan*i);
		}			
	}
}
