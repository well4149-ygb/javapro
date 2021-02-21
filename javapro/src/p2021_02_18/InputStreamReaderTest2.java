package p2021_02_18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest2 {
    public static void main( String[] args ) {
    	
	// byte Stream인 is 선언
	InputStream is = System.in;
	
	// InputStreamReader 객체 선언
	InputStreamReader isr = new InputStreamReader( is );
		
	int inputValue = 0;
	//배열의 크기:10, char형 2byte
	char[] temp = new char[10]; 

	System.out.print( "Input Value : " );
	
	try {
		// 키보드로부터 데이터를 입력
		inputValue = isr.read( temp );
	} catch ( IOException io ) {
	}
	
	System.out.println( "InputValue : " + inputValue );

	// char[]의 값을 출력
	for( int i=0 ; i<inputValue ; i++ ) {
	    System.out.print( temp[i] );
	}

	// char[]을 String type으로 변환
	System.out.println( "char[] -> String : " +
								new String( temp ));
    }
}
