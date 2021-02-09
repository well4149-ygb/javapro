package p2021_02_09.Constructor;
// p235
// 인스턴스 멤버와  this

class Car2{
	// 필드, 멤버변수
	String model;
	int speed;
	
	// 생성자
	Car2(String model){
		this.model = model;
	}
	
	// 메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"가 달립니다.(시속:"+this.speed+"km/h)");
		}
	}	
}

public class CarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2  myCar = new Car2("포르쉐");
		Car2  yourCar = new Car2("벤츠");
		
		myCar.run();
		yourCar.run();		
	}

}
