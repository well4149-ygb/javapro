package p2021_02_15;

//부모클래스 안에 있는 메소드는 자식클래스에게 상속된다.
class Parent {					// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 메서드는 상속된다.");
	}
}

//Parent를 슈퍼 클래스로 하는 서브 클래스 Child 정의 
class Child extends Parent {	// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 메서드는 슈퍼가 사용 못한다.");
	}
}

class SuperSub01 {
	public static void main(String[] args) {
		Child c = new Child(); // 서브 클래스로 객체를 생성
		c.parentPrn(); // 슈퍼 클래스에서 상속 받은 메서드 호출
		c.childPrn(); // 서브 클래스 자기 자신의 메서드 호출
		
		System.out.println("-------------------------------------->> ");
		Parent p = new Parent(); // 슈퍼 클래스로 객체 생성
		p.parentPrn(); // 슈퍼 클래스 자기 자신의 메서드 호출
//		p.childPrn(); //서브 클래스 메서드는 가져다 사용 못함
	}
}



