package p2021_02_05.Break;

public class Break03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 난수 발생 :    0.0 <= Math.random() < 1.0		
// 난수 발생 공식 : 난수 = (정수화) (Math.random() * (상한값-하한값+1)) + 하한값             		
// 1 ~ 45            난수 = (int) (Math.random() * 45) + 1	
		
		int i = 1;
		while(true) {
			i++;			
			int num = (int)(Math.random()*45) + 1;	// 난수 발생 : 1 ~ 45
			System.out.println(num);		
			
			if(num == 6) break;				// 무한루프를 빠져나옴
		}
		System.out.println("루프횟수:"+ (i-1));
		System.out.println("프로그램 종료");
	}

}
