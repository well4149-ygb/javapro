package p2021_02_17;

// HashSet과 Date 클래스가 있는 패키지를 임포트
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {

		// HashSet 클래스의 객체 생성
		Set hs = new HashSet();			// 업캐스팅
//      HashSet hs = new HashSet();

//      boolean add(Object e)
		// hs 객체에 데이터 객체 보관
		hs.add(new String("gemini"));
		hs.add("johnharu");
//		Date d=new Date();
//      hs.add( d );
		hs.add(new Date());

		// hs 객체가 보관하고 있는 데이터 객체 출력
		System.out.println("hs의 내용 : " + hs);

		// "johnharau" 데이터 객체를 hs 객체에서 제거
		hs.remove("johnharu");
		System.out.println("hs의 내용 : " + hs);

		// hs 객체에 있는 데이터 개체의 갯수를 출력
		System.out.println("hs의 데이터 갯수" + hs.size());
	}
}