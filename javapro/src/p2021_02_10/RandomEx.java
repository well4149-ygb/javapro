package p2021_02_10;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 난수 발생 방법 : 1. Math.random()		
//		        2. Random 클래스
		
		Random r = new Random();		// 자동 import 단축키 : Ctrl + Shift + O
		
//		java.util.Random  r = new java.util.Random();
		
		int n1 = r.nextInt(10);	// 0 <= n1 < 10
		System.out.println("n1="+ n1);
		
		// 1 ~ 45 사이의 난수 발생
		int n2 = r.nextInt(45) + 1; 
		System.out.println("n2="+ n2);		
	}

}



