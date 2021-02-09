package p2021_02_05.Array;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 키보드로 5과목의 점수를 입력 받아서, 총점과 평균을 구하는 프로그램을 작성 하세요?
		
		int[] s = new int[5];
		
		System.out.println("5과목의 점수를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;	
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
			sum += s[i];					// sum = sum + s[i]
		}		
		double avg = (double)sum / 5.0;
		System.out.println("총점:"+ sum);
		System.out.println("평균:"+ avg);

	}

}
