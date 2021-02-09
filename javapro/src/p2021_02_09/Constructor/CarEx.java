package p2021_02_09.Constructor;
// p223 ~ 224
// return 구문

class Car{
	// 필드
	int gas;
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return;		// 메소드 실행 종료
			}
		}
	}
	
}

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}		
		if(car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입 하세요.");
		}
		
		
	}

}
