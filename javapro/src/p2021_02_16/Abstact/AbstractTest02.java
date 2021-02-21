package p2021_02_16.Abstact;

// 메소드의 다형성
abstract class ShapeClass{			// 부모 추상클래스
	abstract void draw();			// 추상 메소드
}

class Circ extends ShapeClass{
	void draw(){					// 메소드 오버라이딩
		System.out.println("원을 그린다");
	}
}
class Rect extends ShapeClass{
	void draw(){
		System.out.println("사각형을 그린다");
	}
}
class Tria extends ShapeClass{
	void draw(){
		System.out.println("삼각형을 그린다");
	}
}
public class AbstractTest02{
	public static void main(String args[]){
		Circ c =  new Circ();
		Rect r = new Rect();
		Tria t=  new Tria();
	
		c.draw();
		r.draw();
		t.draw();
	}
}

