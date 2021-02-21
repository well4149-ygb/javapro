package p2021_02_17;

import java.util.*;

public class StoredVector {
    public static void main( String[] args ) {
    
        // Vector 객체 생성
        Vector v = new Vector( 1, 1 );
        
        // Vector에 객체 저장
        v.add( "gemini" );
        v.addElement( new Integer(10) );
        v.addElement( "johnharu" );
        v.addElement( "gracedew" );

		System.out.println(v);
        
        // Vector에 저장된 객체의 개수를 구함
        int length = v.size();
        
        // 처음부터 순차적으로 객체를 꺼냄
        for ( int i=0; i<length; i++ ) {
            System.out.println( v.get(i) );
        }
        
        System.out.println( v.firstElement() );
        System.out.println( v.indexOf( "johnharu" ) );
        System.out.println( v.isEmpty() );
        
        // 인덱스가 2인 객체를 삭제
        v.remove( 2 );
        System.out.println( v.elementAt( 2 ));
        
        //인덱스가 2인 객체 값을 "park"로 설정
        v.set( 2, "park" );
        System.out.println( v );
    }
}
        
        
             
        