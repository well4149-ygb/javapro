package p2021_02_18;

import java.util.Stack;

public class StackTest01 {
	public static void main(String[] args) {
// 스택(Stack) : LIFO(Last Input First Output)구조		
		
		Stack myStack = new Stack();
		myStack.push("1-자바");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");

//		System.out.println(myStack.pop()); // 4-MFC
//		System.out.println(myStack.pop()); // 3-API
//		System.out.println(myStack.pop()); // 2-C++
//		System.out.println(myStack.pop()); // 1-자바
//		System.out.println(myStack.pop()); // EmptyStackException
		
		// 스택 자료구조가 비어있지 않으면
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}



