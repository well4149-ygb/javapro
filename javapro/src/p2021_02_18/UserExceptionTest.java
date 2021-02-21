package p2021_02_18;

public class UserExceptionTest {

	// Exception을 호출한 메소드로 던짐
	public void printNumber() throws UserDefineException {
		for (int i = 0; i < 10; i++) {
			// 강제로 Excpetion을 발생시킴
			if (i == 5)
				throw new UserDefineException("사용자가 정의한 Exception입니다");
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		UserExceptionTest uet = new UserExceptionTest();

		try {
			uet.printNumber();
		} catch (Exception ue) {
			System.out.println(ue.toString());
		}
	}
}
