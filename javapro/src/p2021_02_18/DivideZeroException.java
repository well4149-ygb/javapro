package p2021_02_18;

// 예외처리를 하지 않는 경우
public class DivideZeroException {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;

		// 두 수의 나눗셈 결과를 구한다
		int c = b / a;			// 예외발생
		int total = a + b;
		int sub = b - a;

		System.out.println(c);
	}
}
