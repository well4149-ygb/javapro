package p2021_02_15.homework;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Years {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("올해의 연도를 입력해 주세요:");
		int years = sc.nextInt();
		//1.GregorianCalendar클래스 사용
		GregorianCalendar gc = new GregorianCalendar();
		if(gc.isLeapYear(years)) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
		
		//2.계산식으로 풀기
//		if((years%4==0&&years%100!=0)||(years%400==0)) {
//			System.out.println("윤년입니다.");
//		}else {
//			System.out.println("평년입니다.");
//		}
	}
}
