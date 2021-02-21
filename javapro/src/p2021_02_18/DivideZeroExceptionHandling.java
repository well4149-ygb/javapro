package p2021_02_18;

// 예외처리
// 1. try ~ catch 구문으로 예외처리
// 2. 예외가 발생하면, 예외가 발생한 라인 아랫쪽 내용은 실행하지 않고
//    catch 쪽으로 예외를 던진다.
public class DivideZeroExceptionHandling {
	public static void main(String[] args) {

		// int type의 변수 선언
		int b = 20;
		int a = 0;
		int c = 0;

		try {
			c = b / a;			// 예외발생
			System.out.println("실행안됨");
			int total = a + b;
			int sub = b - a;
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌수 없습니다.");
			a = 2;
			c = b / a;
		}
		System.out.println(c);
	}
}
