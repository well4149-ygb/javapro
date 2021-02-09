package p2021_02_05.Array;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// p154
		int[] scores;
		scores = new int[] {83, 90, 87};
		
//		int[] scores = {83, 90, 87};		
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];					// sum1 = sum1 + scores[i]
		}
		System.out.println("총합:"+sum1);		// 총합:260	
		
		// 리턴된 총점을 sum2에 저장
		int sum2 = add(new int[] {83, 90, 87}); // add() 메소드 호출
		System.out.println("총합:"+ sum2);
		
	}// main() end
	
	// 사용자 정의 메소드 : 합을 구해주는 역할
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum; //리턴 구문:메소드 호출한 곳에 값을 돌려주는 역할
	}

}
