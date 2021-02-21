package p2021_02_18;

import java.util.Date;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
// 스택(Stack) : LIFO(Last Input First Output)구조	
		
		// Stack 객체 생성
		Stack s = new Stack();
		System.out.println(s.empty()); //비어있으면  true리턴

		// Stack에 값을 넣음
		s.push("gemini");
		Date d = new Date();
		s.push(d);
		s.push(new Integer(10));
		s.push("johnharu");

		// Stack의 값을 출력
		System.out.println(s.empty());
		
		//peek() : 가장 마지막 데이터를 구해오는 역할
		System.out.println(s.peek());	// johnharu
		
		//pop() : 가장 마지막 데이터를 출력하는 역할
		System.out.println(s.pop());	// johnharu 출력
		
		System.out.println(s.pop());	// 10 출력
		System.out.println(s.pop());
		System.out.println(s.pop());	// gemini 출력
		System.out.println(s.empty());  // true
	}
}



