package p2021_02_16;
// p335 ~ 337

abstract class Animal{				// 부모 추상클래스
	public String kind;				// 필드	
	public void breathe() {			// 일반 메소드
		System.out.println("숨을 쉽니다.");
	}	
	public abstract void sound();	// 추상 메소드
}

class Dog extends Animal{			// 자식 클래스
	public Dog() {
		this.kind = "포유류";
	}	
	@Override
	public void sound() {			// 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println(kind+"멍멍");
	}	
}
	
class Cat extends Animal{			// 자식 클래스
	public Cat() {
		this.kind = "포유류";
	}	
	@Override
	public void sound() {			// 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println(kind+"야옹");
	}	
}

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();			//  오버라이딩된 메소드가 호출됨
		cat.sound();			//  오버라이딩된 메소드가 호출됨
		System.out.println("---------");
		
		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();		// 업캐스팅
		animal.sound();
//		Animal an = new Dog();
		
		animal = new Cat();		// 업캐스팅
		animal.sound();
		System.out.println("----------");
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();	// 재정의된 메소드 호출
	}

}
