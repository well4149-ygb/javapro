package p2021_02_05.Switch;

public class Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int) (Math.random() * 6) + 1; // 1 ~ 6

		switch(num) {
			case 1: System.out.println("1번");
					break;
			case 2: System.out.println("2번");
					break;
			case 3: System.out.println("3번");
					break;
			case 4: System.out.println("4번");
					break;
			case 5: System.out.println("5번");
					break;
			default : System.out.println("6번");
		}
		
	}

}
