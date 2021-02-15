package p2021_02_15;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		// int형 변수의 최대값과 최소값
		System.out.println("max="+ Integer.MAX_VALUE);	//max=2147483647
		System.out.println("min="+ Integer.MIN_VALUE);	//min=-2147483648
		
		// String형을 int형으로 형변환 :  "20"  --->  20
		int n = Integer.parseInt("20");
		System.out.println(n);			// 20    숫자
		System.out.println(n+10);		// 30   연산가능
		
		// 10진수를 2진수로 변환
		System.out.println("2진수:" + Integer.toBinaryString(10));	// 1010
		// 10진수를 8진수로 변환
		System.out.println("8진수:" + Integer.toOctalString(10));	// 12
		// 10진수를 16진수로 변환
		System.out.println("16진수:" + Integer.toHexString(10));		// a
	}

}
