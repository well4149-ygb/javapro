package p2021_02_09;

import java.util.Scanner;

public class MemberInput {
//	키보드를 통해서 각 회원들의 정보를 입력 받는                         
//    클래스(MemberInput)를 작성한다. 
//    이때 입력 받는 회원의 정보는 성명, 나이, 이메일,주소를  
//    입력 받는다. 그리고 키보드로 입력한 회원의 정보는 새로운
//    회원정보를 저장하는 클래스(MemberInfo)의 멤버변수에 
//    저장을 시킨후 출력하는 프로그램을 작성하시오.
//    (단, 1명의 회원정보를 입력 받아서 처리한다. 
//     가능하면 2명 이상의 회원 정보도 입력 받아서 처리 해본다.)
	//1.memberinfo에서 해당 멤버변수의 겟터와 셋터를 사용한다.(생성자 포함)
	//2.memberinput에서 memberinfo의 객체배열을 생성한다.
	//3.스캐너를 선언한 뒤, 해당 객체배열을 반복문을 돌려서 배열에 입력한 후 저장한다.
	//4.저장한 배열을 while문을 사용해서 특정 조건 (이름)을 넣으면 해당 회원의 정보를 출력한다.
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc  = new Scanner(System.in);
		//memberinfo 의 객체 배열을 생성
		MemberInfo[] info;
		int i;
		System.out.println("인원수를 입력해주세요.");
		int num = sc.nextInt();//입력할 인원수
		info =new MemberInfo[num];//인원수만큼 객체배열을 생성
		
		//해당 객체배열에 입력값을 넣는다.
		for ( i = 0 ; i <info.length; i++) {
			System.out.println("회원 정보를 입력하세요.(이름,나이,이메일,주소 순)");
			   String name = sc.next();
			   int age = sc.nextInt();
			   String email = sc.next();
			   String address = sc.next();
			   
			   info[i] = new MemberInfo(name,age,email,address);
	  	}
		System.out.println("회원정보가 저장되었습니다.");
		
		while(true) {
			System.out.println("검색할 회원의 이름을 입력해 주세요.");
			String name = sc.next();//검색할 이름 
			
			for( i=0; i<num;i++) {
				if(name.equals(info[i].getName())) {//저장된 이름을 입력한 경우
					System.out.println("해당 회원의 정보:"
							+info[i].getName()+" "
							+info[i].getAge()+" "
							+info[i].getEmail()+" "
							+info[i].getAddress());
					break;
				}
				
			}
			if(name.equals("종료")) { 
				System.out.println("프로그램을 종료합니다.");
				break;//프로그램 종료
				}
			else if(i==num) {
				System.out.println("해당 이름이 없습니다.");
			}
		}
	}
}

 class MemberInfo {
	//멤버 변수
	private String name;
	private int age;
	private String email;
	private String address;
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getEmail() {
		return email;
	}


	public String getAddress() {
		return address;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	//생성자
	public MemberInfo(String name,int age, String email,String address) {
		this.name = name;
		this.age  = age;
		this.email = email;
		this.address = address;
	}
}