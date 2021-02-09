package p2021_02_05.While;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while문
//	    while(조건식){
//	       	반복 실행할 문장;
//	    }

//while문을 이용해서  '사랑해요' 메세지를 10번 출력하는 프로그램을 작성하세요?
		
		int i = 1;					// 초기값
		while(i<=10) {				// 조건식
			System.out.println(i+"사랑해요~!!");
			i++;					// 증감식 : ++i, i=i+1, i+=1
		}
	}
}
