package p2021_02_17;

import java.util.*;

public class VectorConstructor {
    public static void main( String[] args ) {
    
        // 기본적인 vector 생성 방법
       Vector vector1 = new Vector();
       System.out.println("size1="+vector1.size() );
       System.out.println("capacity1="+vector1.capacity());
        
        // 초기 capacity만 지정한 생성 방법
       Vector vector2 = new Vector( 3 );
       System.out.println("size2="+vector2.size());
       System.out.println("capacity2="+vector2.capacity());
        
        // vector에 값을 추가
        vector2.add( "gemini" );
        vector2.add( "johnharu" );
        vector2.add( "gracedew" );
        vector2.add( "bidon" );
       System.out.println("size2="+vector2.size());
       System.out.println("capacity2="+vector2.capacity());
        
        // 초기 capacity와 증가 capacity를 지정한 생성 방법
       Vector vector3 = new Vector( 1, 1 );
       vector3.add( "opendb" );
       System.out.println( "size3 = " + vector3.size() );
       System.out.println("capacity3="+vector3.capacity());
        
       vector3.add( "moon" );
       System.out.println( "size3 = " + vector3.size() );
	   System.out.println("capacity3="+vector3.capacity());
    }
}        
        
        
        