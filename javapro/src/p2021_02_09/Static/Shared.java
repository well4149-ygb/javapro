package p2021_02_09.Static;

public class Shared {
	public static void main(String[] args) {

		StaticCount sc1 = new StaticCount();
		System.out.println("sc1.number = " + sc1.number);

		sc1.number++;	// 4
		System.out.println("sc1.number = " + sc1.number);

		StaticCount sc2 = new StaticCount();
		System.out.println("sc2.number = " + sc2.number);

		sc2.number++;	// 5
		System.out.println("sc2.number = " + sc2.number);
		
		StaticCount.number++;	// 6
		System.out.println(StaticCount.number);		
		
	}
}
