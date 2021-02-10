package p2021_02_10;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Random 클래스를 이용하여 1 ~ 45 사이의 정수 6개를 추출하는 프로그램을 작성하세요?
// (단, 중복이 되지 않도록 한다.)
		
		Random r = new Random();
		int[] n = new int[6];
		
		for(int i=0; i<n.length; i++) {
			n[i] = r.nextInt(45) + 1;	// 1 ~ 45 사이의 난수 발생
			
			for(int j=0; j<i; j++) {
				if(n[i] == n[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(n); // 오름차순 정렬(0,1,2,3,4...)
		
		for(int k=0; k<n.length; k++)
			System.out.print(n[k]+"\t");
		System.out.println();
		
		for(int p : n)
			System.out.print(p+"\t");
	}

}
