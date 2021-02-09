package p2021_02_08;

import java.util.Scanner;

public class p2021_02_08homework {
	
//I/O 사용시에는 연결을 맺고 끊음을 확실히 해줘야 합니다.
//리소스에 접근이 불가능하거나 connection pool이 꽉 차서 더이상 접근이
//안되는 경우도 있습니다(DB같은 경우)
	
	static int[] number;//값을 받을 배열
	
	//배열의 최댓값 구하는 메서드
	static int Max(int[]a) { 
		int max =a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max; 
	}
	
	//최솟값 구하는 메서드
	static int Min(int[]a) {
		int min =a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	
	//배열의 요솟값을 입력
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 최댓값과 최솟값을 구합니다.");
		
	    number = new int[5]; //요소수가 num인 배열
		for (int i = 0; i <5; i++) {
			System.out.print("number["+(i+1)+"]: ");
			number[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		//과제 ->키보드를 이용해서 5개의 정수를 받은 후 배열에 넣는다.
		//    ->그후 배열에 저장된 값중 최대값과 최솟값을 구하시오.
		p2021_02_08homework p = new p2021_02_08homework();
		p.input();
		System.out.println("최대값:"+Max(number));
		System.out.println("최소값:"+Min(number));
	}
}
