package p2021_02_17;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet 클래스
// :오름차순으로 정렬해서 저장하고 출력하는 기능 제공
// 		  	오름차순 정렬
//----------------------------------------------
//  숫자 : 작은 숫자부터 큰숫자로 정렬   ex) 1, 2, 3, 4, 5....
//  문자 : 사전순 정렬   ex) a, b, c, d.....

public class TreeSetTest {
	/**
	 * HashSet 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs = new TreeSet();		
		
		// boolean  add(Object e)
		if(hs.add("korea")){
			System.out.println("첫 번째 korea 추가 성공");
		}else{
			System.out.println("첫 번째 korea 추가 실패");
		}		
		if(hs.add("japan")){
			System.out.println("japan 추가 성공");
		}else{
			System.out.println("japan 추가 실패");
		}		
		if(hs.add("america")){
			System.out.println("america 추가 성공");
		}else{
			System.out.println("america 추가 실패");
		}		
		if(hs.add("britain")){
			System.out.println("britain 추가 성공");
		}else{
			System.out.println("britain 추가 실패");
		}
		
		if(hs.add("korea")){	// 중복된 데이터를 저장할 수 없다.
			System.out.println("두 번째 korea 추가 성공");
		}else{
			System.out.println("두 번째 korea 추가 실패");
		}
		
		System.out.println(hs);		
		
		Iterator it = hs.iterator();		
		while(it.hasNext()){
			System.out.println(it.next());
		}		
	}
}
