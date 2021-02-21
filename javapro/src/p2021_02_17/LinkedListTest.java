package p2021_02_17;

import java.util.LinkedList;
import java.util.Queue;

class LinkedListTest {
	public static void main(String[] args) {

// 큐(Queue) : FIFO(First Input First Output)구조 
		
		Queue myQue = new LinkedList();		 // 업캐스팅
//		LinkedList myQue = new LinkedList();
		myQue.offer("1-자바");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-MFC");

//		System.out.println(myQue.poll());	// 1-자바
//		System.out.println(myQue.poll());	// 2-C++
//		System.out.println(myQue.poll());	// 3-API
//		System.out.println(myQue.poll());	// 4-MFC
//		System.out.println(myQue.poll());	// null 
//		큐(Queue)가 비어있으면 null 값을 리턴함
		
		while (myQue.peek() != null) // 큐가 비어있지 않다면
			System.out.println(myQue.poll()); // 큐에서 데이터를 꺼내온다.
	}
}

