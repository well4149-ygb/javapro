package p2021_02_05.homework;

public class randomNumber {
	public static void main(String[] args) {
		random();
	}
	
	public static void random(){
		int[]number = new int[6];//배열 6개 생성
	
		for (int i = 0; i < number.length; i++) {
			number[i]= (int)(Math.random()*45+1);//랜덤 숫자 생성
			for (int j = 0; j < i; j++) {
				
				if(number[i]==number[j]) {//중복값 제거
					j--;
				}
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
