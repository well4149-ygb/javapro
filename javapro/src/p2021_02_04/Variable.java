package p2021_02_04;

import java.util.ArrayList;
import java.util.List;

public class Variable {
	public static void main(String[] args) {
		//변수:메모리상에 데이터를 저장하기 위한 기억 공간
		//변수를 만드는 형식: 자료형 변수명 = 데이터(값);
		byte b1 =10;
//		byte b2 = -127;
		short s =100;
		int i =1000;
//		int j =3.14; 오류발생: 자료형과 데이값이 일치되어야 한다.
		long l =10000;
		
		System.out.println("b1="+b1);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		
		//2.실수형 변수
		
		
		
		//3.
		
		
		//4.논리형 변수
		boolean bn1 =true;
		boolean bn2 = false;
		
		System.out.println("bn1="+bn1);
		System.out.println("bn2="+bn2);
		
		//참조형: 배열, 클래스, 인터페이스
		//5.참조형 변수: 배열 -동일한 자료형의 데이터를 저장하는 정적인 자료구조
		
		int[] score = {80,90,100};
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
		
		for (int j = 0; j < score.length; j++) {
			System.out.print(score[j]+"\t");
		}
		System.out.println();
		//6.참조형 변수 : 클래스
		String s1 = "자바";
		String s2 = new String("자바");
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		if(s1==s2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(s1.equals(s2)) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		//7.참조형 변수: 인터페이스(List)
		//1)순차적인 자료
//		2)여러가지 자료형의 데이터를 모두 저장할 수 있다.
//		3)동적으로 공간의 크기를 늘릴 수 있다.
//		List list = List();  인터페이스는 자체적으로 객체를 생성할 수 없다.
		List list = new ArrayList(); //업캐스팅
		
//		ArrayList lit = new ArrayList(); 
		list.add(30);
		list.add(3.14);
		list.add('J');
		list.add(true);
		list.add("자바");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		System.out.println(list);
		System.out.println(list.get(1));//3.14
		
		System.out.println();
		
		for(int k= 0;k<list.size();k++) {
			System.out.println(list.get(k)+"\t");
		}
	}
}
