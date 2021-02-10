package p2021_02_10;

import java.util.StringTokenizer;

public class StringTokenizerTest1 {

	public static void main(String[] args) {
	
		String source1="111-111|강원도|춘천시|퇴계동";
		StringTokenizer st1=new StringTokenizer(source1,"|");
		
		String zip=st1.nextToken();
		String dou=st1.nextToken();
		String si=st1.nextToken();
		String dong=st1.nextToken();

		System.out.println("우편번호:" +zip);
		System.out.println("도:" +dou);
		System.out.println("시:" +si);
		System.out.println("동:" +dong);
	}

}
