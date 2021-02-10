package p2021_02_10;

public class TrimTest {

	// trim() : 문자열 좌.우의 공백을 없애주는 역할

	public static void main(String[] args) {
		String str1 = new String("gemini   ");
		String str2 = new String("   gemini ");

		System.out.println(str1.equals(str2));					// false
		System.out.println(str1.trim().equals(str2.trim()));	// true
	}
}
