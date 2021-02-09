package p2021_02_09.Static;

public class NoneObject {
    static int number = 3;	// 정적필드, 정적 멤버변수
    
    public static void printNumber() {	// 정적 메소드
        System.out.println("number = " + number);
    }
}            