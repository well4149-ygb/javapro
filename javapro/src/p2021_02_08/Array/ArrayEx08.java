package p2021_02_08.Array;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// p160
		if(args.length != 2) {
			System.out.println("프로그램 종료");
			System.out.println("java  ArrayEx08  num1  num2");
			System.exit(0);        // 프로그램을 강제로 종료
		}
		
		String strNum1 = args[0];					// "10"
		String strNum2 = args[1];					// "20"
		System.out.println(strNum1 + strNum2);      // "1020"
		
		// 자료형 변환 :  String 형    --->  int형
		int num1 = Integer.parseInt(strNum1);		// 10
		int num2 = Integer.parseInt(strNum2);       // 20
		
		int result = num1 + num2;					// result = 30
		System.out.println(num1 + "+" + num2 + "=" +result);	
		System.out.println(num1 + "+" + num2 + "=" +(num1+num2));
		
	}

}
