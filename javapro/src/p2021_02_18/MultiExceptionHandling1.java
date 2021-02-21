package p2021_02_18;

public class MultiExceptionHandling1 {
	public static void main(String[] args) {
// try ~ catch ~ finally
// finally 안에 들어 있는 내용은 예외가 발생하든, 발생하지 않든 
// 무조건 실행됨;
		
		int value = 20;
		int div = 10;

		int[] intArray = { 1, 2, 3 };

		try {
			// 두수의 나눗셈을 구함
			int result = value / div;		// 예외발생
			System.out.println(result);

			// 배열의 특정 값을 저장
			int arrayValue = intArray[2];	// 예외발생
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());

		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();

		} finally {
			System.out.println("예외가 발생했음!");
		}
	}
}




