package p2021_02_15;

class WrapperTestA {
	public static void main(String[] args) {
		int n01 = 10;
//		int n02;
//		Integer num01; // Integer 객체 생성
		
		Integer num02 = new Integer(20);		// 박싱
		Integer num01 = 10; 				    // 오토 박싱
		//	num01 = new Integer(n01);

		int n02 = num02; 						// 오토 언박싱
		//int n02   = num02.intValue();         // 언박싱

		System.out.println(n01 + ", " + num01);
		System.out.println(n02 + ", " + num02);

	}
}
