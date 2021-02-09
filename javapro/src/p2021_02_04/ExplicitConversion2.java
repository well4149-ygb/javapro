package p2021_02_04;

public class ExplicitConversion2 {

    public static void main( String[] args ) {
    	
    // int형 변수를 97로 초기화
    int intValue = 97;

    // int형 변수 값을 char형으로 변환 후 할당
    char charValue = ( char )intValue;
    System.out.println( "charValue = " + charValue );

    // float형 변수 초기화.
    float floatValue = 3.14F;

    // float형 변수 값을 int형으로 변환 후 할당
    int intValue2 = ( int )floatValue;
    System.out.println( "intValue2 = " + intValue2 );

    // float형 변수 초기화
    double doubleValue = 21.12345;
    
    // double형 변수 값을 float형으로 변환 후 할당
    float floatValue2 = ( float )doubleValue;
    System.out.println( "floatValue2 = " + floatValue2 );

    }
}