package p2021_02_16.Abstact;

interface IHello06 {	// 인터페이스
	int a = 10;			// 상수 : public static final 생략되어 있음
	public abstract void sayHello(String name);		// 추상 메소드
}
interface IGoodBye06 {	// 인터페이스
	public abstract void sayGoodBye(String name);	// 추상 메소드
}

// 인터페이스끼리 상속을 받을때는  extends로 상속을 받아야되고, 다중상속도 가능하다.
interface ITotal extends IHello06, IGoodBye06 {
	public abstract void greeting(String name);		// 추상 메소드
}

class SubClass06 implements ITotal {
	public void sayHello(String name) {		// 메소드 오버라이딩
		System.out.println(name + "씨 안녕하세요!");
	}
	public void sayGoodBye(String name) {	// 메소드 오버라이딩
		System.out.println(name + "씨 안녕히 가세요!");
	}
	public void greeting(String name) {		// 메소드 오버라이딩
		System.out.println(name + ", 안녕!");
	}
}

class AbstractTest06 {
	public static void main(String[] args) {
		SubClass06 test = new SubClass06();
		test.sayHello("홍길동");
		test.sayGoodBye("이순신");
		test.greeting("안화수");
		
//		IHello06.a = 30;  			// a는 상수이기 때문에 값을 수정할 수 없다.
		System.out.println(IHello06.a);  // 10		
	}
}





