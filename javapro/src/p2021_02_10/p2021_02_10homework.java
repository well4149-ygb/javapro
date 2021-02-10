package p2021_02_10;

import java.util.Scanner;

public class p2021_02_10homework {
	//과제. 주민등록번호 유효성 검사하기 
	//    방법: 입력받은 2개의 문자열을 합친다.
	//         합친 문자열을 이용해서 유효성을 확인한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호 앞자리를 입력 하세요?");
		String jumin1 = sc.nextLine();			// String jumin1 = "900101";
		System.out.println("주민번호 뒷자리를 입력 하세요?");
		String jumin2 = sc.nextLine();			// String jumin2 = "2234567";
		
		String g = jumin2.substring(0, 1);//성별 검사 변수
		int[]check = {2,3,4,5,6,7,8,9,2,3,4,5};//유효성 체크 번호
		int sum = 0;//계산후 합계
		
		if(jumin1.equals("")) {
			System.out.println("주민번호 앞자리를 입력 하세요.");
		}else if(jumin1.length() != 6) {
			System.out.println("주민번호 앞자리 6자리를 입력 하세요.");
		}else if(jumin2.equals("")) {
			System.out.println("주민번호 뒷자리를 입력 하세요.");
		}else if(jumin2.length() != 7) {
			System.out.println("주민번호 뒷자리 7자리를 입력 하세요.");
		}
		
		//해당 2개의 문자열을 합친다.
		String juminNum = jumin1.concat(jumin2);
		System.out.println("입력한 주민번호:"+jumin1+"-"+jumin2);
		//유효성 검사를 한다.
		for (int i = 0; i < check.length; i++) {
            
            int tmp =(juminNum.charAt(i)-48) * check[i];  
            sum += tmp; //곱한 결과를 sum변수에 누적
        }
		System.out.println(sum);
		//합을 11로 나눈 나머지를 11로 뺀다.
        int pin = 11 - (sum%11);        
        
        if((juminNum.charAt(12)-48)==pin){ //주민등록번호 마지막 번호와 계산 값이 같은지 검사
            System.out.println("\""+juminNum+"\" 는 유효한 주민번호입니다.");
        }else{
            System.out.println("\""+juminNum+"\" 는 틀린 주민번호입니다.");
        }//if   
	}
}
