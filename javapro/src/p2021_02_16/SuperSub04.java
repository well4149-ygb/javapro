package p2021_02_16;

class Point2D04 {						// 부모 클래스
	protected int x = 10; // private int x=10;
	protected int y = 20; // private int y=20;
}

class Point3D04 extends Point2D04 {		// 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}
}

class SuperSub04 {
	public static void main(String[] args) {
		Point3D04 pt = new Point3D04();
		pt.print();
	}
}