package p2021_02_09.Method;
// 220 ~ 221

class Computer{
	
	// 주소값 전달에 의한 메소드 호출(Call by Reference방식)
	int sum1(int[] values) { // int[] values = {1,2,3}
		int sum=0;	// int[] values = new int[]{1,2,3,4,5}
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// vargus : 전달된 값을 배열로 받음
	int sum2(int ... values) {// int[] values = {1,2,3} 
		int sum=0;			// int[] values = {1,2,3,4,5}
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}	
}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = com.sum1(values1); //sum1()메소드 호출
		System.out.println("result1:"+ result1);
		
		int result2 = com.sum1(new int[]{1,2,3,4,5});
		System.out.println("result2:"+ result2);
		
		int result3 = com.sum2(1,2,3);
		System.out.println("result3:"+ result3);
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println("result4:"+ result4);
	}

}
