package p2021_02_08.Method;

public class MethodEx02 {
	
	// 1 ~ n까지 합을 구하는 메소드
	static void sum(int n) {		// int n = 3;
		int hap = 0;
		for(int i=1; i<=n; i++) {
			hap += i;			// hap = hap + i;
		}
		System.out.println("1~" + n + "=" + hap);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(3);
		sum(5);
		sum(10);
		sum(30);
		sum(100);
		sum(1000000);
	}

}
