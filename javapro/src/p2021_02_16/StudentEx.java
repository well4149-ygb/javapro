package p2021_02_16;
// p294 ~ 295

class People{						// 부모 클래스
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;			// name = "홍길동"
		this.ssn = ssn;				// ssn = "123456-1234567"
	}	
}

class Student extends People{		// 자식 클래스
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);			// 부모 클래스의 생성자 호출
		this.studentNo = studentNo; // 1
	}
}

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = 
				new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("name:"+ std.name);
		System.out.println("ssn:"+ std.ssn);
		System.out.println("studentNo:"+ std.studentNo);
	}

}
