package p2021_02_08.Array;

public class ArrayEx06 {

	public static void main(String[] args) {

// 향상된 for문, 확장 for문
// 형식 :  for( 변수 : 순차적인 자료구조(배열, 컬렉션) ){
//		           실행 문자;
//	      }
		
		int[] score = { 95, 71, 84, 93, 87 }; 
		
		int sum = 0;
//		for(int i=0; i<score.length; i++) {
//			sum += score[i];
//		}
		
		// 확장 for문
		for(int s : score) {
			sum += s;
		}
		System.out.println("총점:"+ sum);
		
		double avg = (double)sum / score.length;
		System.out.println("평균:");
		
	}

}
