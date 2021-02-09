package p2021_02_05.For;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 1 ~ 100까지 홀수, 짝수의 합을 구하는 프로그램을 작성 하세요?
		
		int odd = 0, even = 0;
		
		// 홀수의 합
		for(int i=1; i<=100; i=i+2)  // i+=2
			odd += i;
		
		// 짝수의 합
		for(int i=0; i<=100; i+=2)
			even += i;
		
		System.out.println("1~100 홀수의 합:"+ odd);
		System.out.println("1~100 짝수의 합:"+ even);		
	}

}
