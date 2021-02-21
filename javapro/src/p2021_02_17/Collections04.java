package p2021_02_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList();		// 업캐스팅
//		ArrayList list = new ArrayList();

		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);
		System.out.println(list);
		
		System.out.println(list.get(2)); // 인덱스 2번 원소 추출 : 3.42
		System.out.println(list.get(4)); // 인덱스 4번 원소 추출 : five

//		Object get(int index)
		for (int i = 0; i < list.size(); i++) {
//			System.out.println( i + " 번째 요소는 " + list.get(i));
			Object s = list.get(i);
//			String s =(String)(list.get(i));
			System.out.println(s);
		}
		
		// 향상된 for문
		for(Object s : list) {
			System.out.print(s+"\t");
		}
		System.out.println();
		
//		반복자(Iterator)	
		Iterator elements=list.iterator();    
		while(elements.hasNext()) {
			System.out.println("\t\t" + elements.next());
		}	

	}
}



