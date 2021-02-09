package p2021_02_04;

import java.util.Scanner;

public class p2021_02_04Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;//정수1,2,3
		int max;//최댓값
		int min;//최솟값
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		
		System.out.println("첫번째 정수를 입력하세요.");
		num1 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요.");
		num2 = sc.nextInt();
		
		System.out.println("세번째 정수를 입력하세요.");
		num3 = sc.nextInt();
		
		//최댓값
		max = (num1>num2)?num1:
			    (num2>num3)?num2:
			    	(num3>num1)?num3:num1;
		//최솟값
		min = (num2>num1)&&(num3>num1)?num1:
					(num2>num3?num3:num2);
		
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
	}

}
