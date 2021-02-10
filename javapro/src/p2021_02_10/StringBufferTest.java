package p2021_02_10;

public class StringBufferTest {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());

		sb1.append("A string buffer implements" + "a mutable sequence of characters");
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());

		StringBuffer sb2 = new StringBuffer();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	}
}
