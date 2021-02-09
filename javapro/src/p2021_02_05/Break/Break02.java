package p2021_02_05.Break;

public class Break02 {

	public static void main(String[] args) {
		
		// break문 : 반복문을 빠져 나오는 역할
		// 무한 루프 : while문
		
		int i=1;
		while(true) {			
			System.out.println(i+"무한 출력");
			if(i==100) break;
			i++;			
		}
		
	}

}
