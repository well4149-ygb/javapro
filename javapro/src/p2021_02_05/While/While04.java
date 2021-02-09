package p2021_02_05.While;

import java.util.Scanner;

public class While04 {
	public static void main(String[] args) {
		//while문을 이용해서 구구단 2단부터 9단까지 출력하기
		int dan=2;
		int j=1;
		while(dan<=9) {
			System.out.println("["+dan+"단]");
			while(j<=9) {
				System.out.println(dan+"단:"+" "+dan+"*"+j+"="+dan*j);
				j++;
			}
			System.out.println();
			dan++; j=1;
		}
	}
}
