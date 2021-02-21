package p2021_02_17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Collections01 {
	public static void main(String[] args) {
		// Set 인터페이스만으로 객체 생성할 수 없다.
//		Set s = new Set();

		Set set = new HashSet(); // 업캐스팅
//		HashSet	set = new HashSet();
		System.out.println("요소의 갯수->" + set.size());

//      boolean add(Object e)		
		set.add("하나");
		set.add(new Integer(2));
		set.add(new Double(3.42));
		set.add("넷");
		set.add("five");
		set.add(true);
		set.add(6);
		set.add(6);
		System.out.println("요소의 갯수->" + set.size());
		System.out.println(set);

		// Iterator(반복자) : "하나", 2, 3.42, "넷", "five", 6
		Iterator elements = set.iterator();
		while (elements.hasNext()) {
			System.out.println("\t\t" + elements.next());
		}

//		Vector에만 적용 
//		Enumeration enu = set.elements();
//		while (enu.hasMoreElements()) {
//			System.out.println(enu.nextElement());
//		}

	}
}
