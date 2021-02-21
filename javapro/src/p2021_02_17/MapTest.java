package p2021_02_17;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
// Map
// 1. 여러가지 자료형의 데이터를 저장할수 있다.
// 2. 데이터를 저장할 때는, key와 value를 동시에 저장해야 한다.
// 3. key값은 중복이 되면 안되고, 만약에 중복된 key가 있으면 
//	   가장 마지막의 설정된 value만 사용할 수 있다.	
// 4. value 값은 중복 되어도 상관없다.		
		
		// Map 인터페이스로 객체 생성을 할 수 없다.
//		Map m = new Map();
		
		// HashMap 객체 생성
		Map hm = new HashMap();			// 업캐스팅
//		HashMap hm = new HashMap();
		
		// 키와 데이터 쌍을 삽입
//		put(Object key, Object value)
		hm.put("woman", "gemini");
		hm.put("man", "johnharu");
		hm.put("age", new Integer(10));
		hm.put("city", "seoul");
		hm.put("city", "busan");

		// HashMap에 있는 객체들을 출력
		System.out.println(hm);

		// 키 값만 출력
		System.out.println(hm.keySet());

		// 키를 이용해 해당 데이터를 출력
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
	}
}




