package p2021_02_15;

public class WrapperEx4 {

	public static void main(String[] args) {
		
		Double d1 = new Double(3.14);		// 박싱
		Double d11 = 3.14;					// 오토박싱
		
		double n1 = d1.doubleValue();		// 언박싱
		double n11 = d1;					// 오토언박싱		
		
		// 자료형 변환 : "42.195"  --->  42.195
		Double d2 = new Double("42.195");	// 박싱
//		Double d22 = "42.195";				// 오류 발생	
		
		double n2 = d2.doubleValue();		// 언박싱
		double n22 = d2;					// 오토언박싱
		
		// 자료형 변환 : "42.195"  --->  42.195
		double num = Double.parseDouble("42.195");
		System.out.println("num="+ num);		
		
	}

}
