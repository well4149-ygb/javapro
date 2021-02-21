package p2021_02_17;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

class HashTableTest {
	public static void main(String[] args) {
//		Map ht = new Hashtable();			// 업캐스팅
		Hashtable ht = new Hashtable();
		
		// 해쉬 테이블에 키/데이터를 입력한다.
//		put(Object key, Object value)
		ht.put("딸기", "StrawBerry");
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");

		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		// Object  get(Object key)
		// Object obj = ht.get("포도");
		String Val = (String) ht.get("포도");//다운 캐스팅
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}

		// key를 모르는 경우에 사용하는 방법
//		열거형(Enumeration) : 딸기 사과 포도
		Enumeration Enum = ht.keys();
		while (Enum.hasMoreElements()) {
			String k = (String)Enum.nextElement();
			String v = (String)ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}



