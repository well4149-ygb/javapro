package p2021_02_10;

public class SubstringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	아래와 같은 주민번호가 있을때, 남자인지 여자인지를 판별하는 프로그램을 작성하세요?
		
		String jumin = "900101-2234567";
		
		String gender = jumin.substring(7, 8);
		
		if(gender.equals("1") || gender.equals("3")) {
			System.out.println("남자 입니다.");
		}else if(gender.equals("2") || gender.equals("4")) {
			System.out.println("여자 입니다.");
		}
		
	}

}
