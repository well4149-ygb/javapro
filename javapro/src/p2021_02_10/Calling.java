package p2021_02_10;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Called c = new Called();
		c.check();
	}
}
//1) 같은 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 접근 제어제가
//   public이나  default  접근 제어자로 되어 있어야 한다.
//2) 같은 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 import 를 하지 
//   않아도 된다.
