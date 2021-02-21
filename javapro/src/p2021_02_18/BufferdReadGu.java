package p2021_02_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferdReadGu {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println("원하는 구구단을 입력하시오:");
		
		try {
			String input = br.readLine(); //문자열
			int a = Integer.parseInt(input); //문자열->숫자열
			
			System.out.println();
			System.out.println(a+"단");
			for(int i =1; i<10; i++){
				   // a값은 단이므로 고정.
				   // i로 숫자를 1에서 9까지 하나씩 올리면서 곱해준다.
				   System.out.println(a+" * "+i+" = "+a*i);
				  }
		}catch(Exception io) {
//			System.out.println(io.getMessage());
			System.out.println("숫자만 입력하세요.");
		}
	}
}
