package p2021_02_05.homework;

import java.util.Scanner;

public class p2021_02_05homework {
//	1. 키보드를 이용해서 입력한 정수의 팩토리얼을
//	   구하는 프로그램을 작성 하세요?
//		ex) 3! = 3 * 2 * 1
//	                  5! = 5 * 4 * 3 * 2 * 1

//	static int factorial(int i) {
//		if(i>0) {
//			return i * factorial(i-1);
//		}else
//			return 1;
//	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    int result = 1;
	    
	    System.out.println("정수를 입력하시오.");
	    int number = sc.nextInt();
	    
	    for(int i =1;i <= number;i++) {
	    	result*=i;
	    }
//	    for(int i = number; i>=1;i--) {
//	    	result=i*result;
//	    }
//	    System.out.println(number);
//	    System.out.println(result);
	    System.out.println(number+"!:"+result);
//	    System.out.println(factorial(number));
	    sc.close();

	}
}
