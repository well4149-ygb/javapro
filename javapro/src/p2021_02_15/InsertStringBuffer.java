package p2021_02_15;

public class InsertStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1);

		sb1.insert(10, "very");
		System.out.println(sb1);

		sb1.insert(0, 1004);
		System.out.println(sb1);
	}
}
