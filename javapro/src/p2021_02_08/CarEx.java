package p2021_02_08;

//p201
class Car{	
	// 필드(field)
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	public Car() {		// 기본 생성자
		System.out.println("생성자 호출 성공");
	}
}

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		CarEx car = new CarEx();
		Car mycar =  new Car();
		System.out.println("제작회사:"+ mycar.company);
		System.out.println("모델명:"+ mycar.model);
		System.out.println("색깔:"+ mycar.color);
		System.out.println("최고속도:"+ mycar.maxSpeed);
		System.out.println("현재속도:"+ mycar.speed);
		
		// 필드값 변경
		mycar.speed = 60;
		System.out.println("수정된 속도:"+ mycar.speed);
	}

}
