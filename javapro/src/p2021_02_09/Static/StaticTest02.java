package p2021_02_09.Static;

class StaticTest2 {
	private static int a = 10;						// 정적필드
	private int b = 20;

	public static void setA(int new_a) {	// 정적 메소드
		a = new_a;		// a = 10000
	}
	public static int getA() {				// 정적 메소드
		return a;
	}
}

public class StaticTest02 {
	public static void main(String[] args) {
//		System.out.println(StaticTest2.a);// a가 private으로 선언되어서 컴파일 에러 발생
		System.out.println(StaticTest2.getA());

		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();

		s1.setA(10000);		// 정적 메소드 호출
		int res1 = s1.getA();
		System.out.println(res1);
		System.out.println(s2.getA());
	}
}