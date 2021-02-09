package p2021_02_08;

public class Animal {
	//사용자 정의 클래스
	int age;//필드 (멤버변수):heap메모리에 저장
	        //메소드 바깥쪽에 정의 되는 변수
	public Animal() {
		//기본 생성자(Dafault Constructor)
		//:매개변수가 없는 생성자
		System.out.println("생성자 호출 성공");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("자바");
		Animal a1        =  new     Animal();
	//  클래스  래퍼런스 변수 	연산자   생성자 호출
//		System.out.println(a1);
		System.out.println("age:"+a1.age);
		
        
	}

}
