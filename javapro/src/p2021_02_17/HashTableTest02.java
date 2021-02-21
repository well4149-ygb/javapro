package p2021_02_17;

import java.util.Enumeration;
import java.util.Hashtable;

class HashTableTest02 {
	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("사과", "Apple");
		ht.put("딸기", "StrawBerry");
		ht.put("포도", "Grapes");
//		ht.put("test", 30);
		
		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		// Object get(Object  key)
		String Val = ht.get("포도");//String 자료형을 생략할 수 있다.
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}
		
		// key를 모르는 경우에 사용하는 방법
//		 열거형(Enumeration) : 딸기 사과 포도
		Enumeration<String> Enum = ht.keys(); // 해쉬 테이블의 키 요소들에 대한 Enumeration 객체 반환
		while (Enum.hasMoreElements()) {
			String k = Enum.nextElement();//String 자료형을 생략할 수 있다.
			String v = ht.get(k);//String 자료형을 생략할 수 있다.
			System.out.println(k + " : " + v);
		}
	}
}

