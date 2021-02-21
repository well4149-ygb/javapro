package p2021_02_16;

// 부모클래스 안에 있는 필드는 자식클래스에게 상속된다.
class Point2D02 {						// 부모 클래스
	protected int x = 10;			// 필드, 멤버변수
	protected int y = 20;
}

class Point3D02 extends Point2D02 {		// 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z); // x와 y는 상속 받아 사용하는 멤버변수
	}
}

class SuperTest02 {
	public static void main(String[] args) {
		Point3D02 pt = new Point3D02();
		pt.print();
		
		System.out.println(pt.x);
		System.out.println(pt.y);
		System.out.println(pt.z);
		
	}
}


