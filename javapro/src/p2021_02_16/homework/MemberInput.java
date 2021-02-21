package p2021_02_16.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInput {
	public static void main(String[] args) {
		
		ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("회원가입 프로그램입니다.");
			System.out.println("1.회원가입 2.회원정보 출력 3.프로그램 종료");
			
			int input = sc.nextInt();
			
			if(input==1) {
				MemberInfo mi = new MemberInfo();
				
				System.out.println("회원등록을 합니다.");
				System.out.print("이름:");
				
				mi.setName(sc.next());
				System.out.println();
				System.out.print("나이:");
				mi.setAge(sc.next());
				System.out.println();
				System.out.print("이메일:");
				mi.setEmail(sc.next());
				System.out.println();
				System.out.print("주소:");
				mi.setAddress(sc.next());
				
				list.add(mi);//입력 받은 것을 list에 넣음
				System.out.println("회원가입이 완료되었습니다.");
			}else if(input ==2) {//입력받은 값을 출력
				for(MemberInfo mi : list){//개선된 루프를 이용하여 출력
				     System.out.println(mi.getName());
				     System.out.println(mi.getAge());
				     System.out.println(mi.getEmail());
				     System.out.println(mi.getAddress());
			    }
			}else if(input ==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
