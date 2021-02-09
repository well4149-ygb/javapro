package p2021_02_05.DoWhile;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		do{
//	           반복 실행할 문장;
//	    }while(조건식);
		
// do ~ while문으로 '사랑해요' 메시지를 10번 출력 하세요?
		
		int i=1;			// 초기값
		do {
			System.out.println(i+"사랑해요");
			i++;			// 증감식
		}while(i<=10);		// 조건식

	}

}
