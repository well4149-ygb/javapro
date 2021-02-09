package p2021_02_08.Array;

public class ArrayEx07 {
	
	// 절대값을 구해주는 메소드
	static int abs(int data) {		// int data = -10
		if(data < 0)				// 음수
			data = -data;           // data = -(-10)
		
		return data;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		
//		args[0] = "-10",  args[1] = "-20";		
		System.out.println("args[0]:"+ args[0]);	  // 문자열 출력 : "-10" 	
		System.out.println("args[1]:"+ args[1]);	  // 문자열 출력 : "-20"	
		
		// args[0] = "-10"   -->  -10  형변환
		int num = Integer.parseInt(args[0]);          // int num = -10;
		System.out.println("절대값:" + abs(num));		  // abs() 메소드 호출
	}

}
