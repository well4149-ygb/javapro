package p2021_02_16;

class Parent02 {					// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}
class Child02 extends Parent02 {	// 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}
//다운 캐스팅(강제 형변환)
//1. 슈퍼클래스에서 서브클래스로 형변환 하는것
//2. 참조 가능한 영역이 확대가 된다.
//3. 컴파일러에 의해서 암시적 형변환(자동 형변환)이 되지 않기    
//   때문에 자료형을 생략할 수 없다.(강제 형변환)
class RefTest02 {
	public static void main(String[] args) {
		Parent02 p = new Parent02();
		Child02 c;
		// 서브 클래스형 레퍼런스 변수에 슈퍼 클래스의 레퍼런스 값을 대입하면
		c = (Child02) p; 	// 이를 DownCasting 이라하는데 컴파일러 에러가 발생한다.
	
//		Child02 c1 = (Child02) new Parent02();
		
		c.parentPrn(); 		// 2개의 메소드 모두 호출 안됨.
		c.childPrn();
	}
}


