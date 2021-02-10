package p2021_02_10;

public class ConnectString {

	public static void main(String[] args) {
		// String 객체 선언
		String gemini = "gemini";
		String johnharu = "johnharu";

		// 두 String 객체를 "+" 연산 수행
		String tempString1 = gemini + johnharu;
		System.out.println(tempString1);
		System.out.println("gemini" + "johnharu");

		// String + 정수형
		String tempString2 = tempString1 + 100;
		System.out.println(tempString2);
	}
}
