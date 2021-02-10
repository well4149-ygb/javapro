package p2021_02_10;

import java.util.StringTokenizer;

// p513

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "홍길동/이수홍/박연수";
		
		// how1 : 전체 토근 수를 얻어서 for문으로 루핑
		StringTokenizer st1 = new StringTokenizer(text, "/");
		int count = st1.countTokens();				// 토큰의 갯수를 구함 : 3
		for(int i=0; i<count; i++) {
			String token = st1.nextToken();
			System.out.println(token);
		}		
		// 확장 for문으로는 처리할 수 없다.
//		String token = st1.nextToken();
//		for(String s : token) {			
//		}		
		
		System.out.println();
		
		// how2 : 남아 있는 토큰을 확인하고 while문으로 루핑
		StringTokenizer st2 = new StringTokenizer(text, "/");
		while(st2.hasMoreTokens()) {		// 토큰이 있으면
			String token = st2.nextToken();
			System.out.println(token);
		}

	}

}
