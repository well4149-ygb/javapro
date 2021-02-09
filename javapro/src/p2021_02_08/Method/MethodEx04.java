package p2021_02_08.Method;

import java.util.Scanner;

public class MethodEx04 {
	
	static int max(int n1, int n2, int n3) {	// 최대값     정적 메소드
		if(n1>=n2 && n1>=n3)
			return n1;
		else if(n2>=n1 && n2>=n3)
			return n2;
		else
			return n3;
	}
	
	static int min(int n1, int n2, int n3) {	// 최소값
		if(n1<=n2 && n1<=n3)
			return n1;
		else if(n2<=n1 && n2<=n3)
			return n2;
		else
			return n3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3개의 정수를 입력하세요?");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int max = MethodEx04.max(n1,n2,n3);	// max 메소드 호출
		int min = MethodEx04.min(n1,n2,n3);	// min 메소드 호출
		
		System.out.println("max="+max);
		System.out.println("min="+min);		
	}

}
