package p2021_02_05.Continue;

public class Continue02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// continue문 
// 1. 다시 반복문으로 돌아가라는 의미를 가지고 있음
// 2. continue문이 실행되면, continue문 아랫쪽의 내용들은 실행되지 않고
//    다시 반복문으로 돌아가게 된다.			
		
// continue문을 이용해서 1~100까지 정수중에서 짝수만 출력하는 프로그램을 작성 하세요?
		
		for(int i=1; i<=100; i++) {	
			
			if(i%2 == 1) continue;			// 홀수
			System.out.println("짝수:"+i);
		}
		
		
	}

}
