package p2021_02_16.Abstact;

interface IHello04 {	    // public abstract 생략 가능
	public abstract void sayHello(String name);		//추상메소드
}

abstract class GoodBye04 {	// public abstract 생략 불가능
	public abstract void sayGoodBye(String name); 	//추상메소드
}

// 클래스와 인터페이스를 동시에 상속을 받을때는 클래스를  먼저 상속을 받고, 그런 다음에
// 인터페이스를 나중에 상속을 받아야 한다. (상속받는 순서가 바뀌면 오류가 발생한다.)
class SubClass04 extends GoodBye04 implements IHello04 {
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest04 {
	public static void main(String[] args) {
		SubClass04 test = new SubClass04();
		test.sayHello("홍길동");		// 오버라이딩된 메소드가 호출된다.
		test.sayGoodBye("이순신");	// 오버라이딩된 메소드가 호출된다.
	}
}




