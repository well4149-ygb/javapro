package p2021_02_05;

import java.util.Scanner;

public class Aver {
	public static void main(String[] args) {
		// 키보드로 5과목의 점수를 입력 받아서, 총점과 평균을 구하는 프로그램을 작성 하세요?
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 입력해주세요.");

		int[] sub = new int[5];// 과목
		int sum = 0;//과목 합
		double aver;//과목 평균
	    for(int i=0;i< sub.length;i++) {
	    	sub[i]= sc.nextInt();
	    	sum+=sub[i];
	    }
		aver = (double)sum/5;
		
		System.out.println("과목의 합:"+sum);
		System.out.println("과목의 평균:"+aver);
	}
}
