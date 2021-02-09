package p2021_02_05.Break;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// break문 : 반복문을 빠져 나오는 역할
		// 무한 루프 : for문
		
		for(int i=1; ; i++) {			
			System.out.println(i+"무한 출력");
			if(i==100) break;
		}
		
	}

}
