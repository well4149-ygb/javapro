package p2021_02_05.For;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1 ~ 10까지 합을 구하는 프로그램 작성하세요?
		int sum = 0;			// 지역 변수(local variable)
		for(int i=1; i<=10; i++) {
			sum = sum + i;			// sum += i;
//			 1  =   0  + 1		
//			 3  =   1  + 2		
//			 6  =   3  + 3	
			System.out.println("1~"+i+"="+sum);
		}	
		System.out.println("sum=" + sum);
	}
}
