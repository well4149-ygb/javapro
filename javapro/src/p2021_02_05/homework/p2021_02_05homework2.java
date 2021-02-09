package p2021_02_05.homework;

import java.util.Random;

public class p2021_02_05homework2 {
	public static void main(String[] args) {
////		2. 1~45사이의 숫자를 6개 추출 하는 프로그램을 작성 하세요? 
////			    (단, 중복된 숫자는 1번만 출력 되도록 한다.)
////			    Math.random() 이용해서 프로그램을 작성 하세요.
//		//1.랜덤을 선언한다.
//		//2.배열을 선언한다.(길이가 6개)
//		//3.해당 배열에 반복문을 돌려서 랜덤의 숫자를 배열에 넣는다.
//		//4.중복되는 숫자는 반복문 내에서 if문을 활용해서 막는다.
//		//5.그후 결과를 반복문을 통해서 출력한다.
//		
		Random rd  = new Random();
		int[] number = new int[6];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random()*45)+1;//45개의 랜덤 숫자를 배열에 넣는다.
			for(int j =0; j< i;j++){
				if(number[i]==number[j]) {//중복처리 
					i--;
				}
			}
		}
		System.out.println("랜덤숫자");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
	}

}

