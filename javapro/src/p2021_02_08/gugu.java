package p2021_02_08;

import java.util.Scanner;

public class gugu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//인원수 3명 과목수 4개
		int[][] scores  =  new int[3][4];

		
		gugu gu = new gugu();
		gu.inputSubject();
		
	}
	//1.점수를 입력
	public void inputSubject() {
			//점수를 입력
			Scanner sc = new Scanner(System.in);
			//인원수 3명 과목수 4개
			int[][] scores  =  new int[3][4];
		
			System.out.println("점수를 입력해주세요.");
		
			for (int i = 0; i < scores.length; i++) {
				System.out.println((i+1)+"번째 점수를 입력해주세요.");
				for (int j = 0; j < scores[i].length; j++) {
					System.out.println((j+1)+"번째 과목:");
					scores[i][j]=sc.nextInt();
				}
			}
	}
}
