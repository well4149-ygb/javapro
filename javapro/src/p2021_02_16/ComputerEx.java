package p2021_02_16;
// p296 ~ 297
// 메소드 오버라이딩(Method Overriding)
// : 부모 클래스로 상속받은 메소드를 자식 클래스에서 재정의 해서 사용하는 것

class Calculator{						// 부모 클래스
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}

class Computer extends Calculator{		// 자식 클래스	

	@Override
	double areaCircle(double r) {		// 메소드 오버라이딩
//		super.areaCircle(r);
		System.out.println("Computer 객체의 areaCircle() 실행");
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}		
	
}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 10;
		Calculator cal = new Calculator();
		System.out.println("원의 면적:"+ cal.areaCircle(r));
		
		// 자식클래스에서 메소드 오버라이딩 된 메소드만 호출된다.
		Computer comp = new Computer();
		System.out.println("원의 면적:"+ comp.areaCircle(r));
	}

}



