package p2021_02_16.Abstact;

interface IHello { 	 // 인터페이스
	public abstract void sayHello(String name);   // 추상메소드
}
interface IGoodBye { // 인터페이스
	public abstract void sayGoodBye(String name); // 추상메소드
}

// 두 인터페이스로부터 상속을 받는 클래스 설계
// 자바에서는 인터페이스의 다중상속을 허용한다.
class SubClass05 implements IHello, IGoodBye {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}
	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest05 {
	public static void main(String[] args) {
		SubClass05 test = new SubClass05();
		test.sayHello("홍길동");		// 오버라이딩된 메소드가 호출된다.
		test.sayGoodBye("이순신");	// 오버라이딩된 메소드가 호출된다.	
	}
}
