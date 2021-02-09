package p2021_02_09.Constructor;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Math 클래스
// Math 클래스 = 정적 필드 + 정적 메소드		
// Math	클래스는 생성자가 제공되지 않기 때문에 Math 클래스로 직접 객체를 
// 생성 할 수 없다.		
//		Math m = new Math();

	System.out.println("E="+Math.E);
	System.out.println("PI="+Math.PI);
		
System.out.println("abs()="+Math.abs(-10));     //절대값
System.out.println("ceil()="+Math.ceil(3.14));  //올림기능
System.out.println("round()="+Math.round(10.5));//반올림기능
System.out.println("floor()="+Math.floor(10.5));//내림기능
System.out.println("max()="+Math.max(10, 20));  //최대값
System.out.println("min()="+Math.min(10, 20));  //최소값
System.out.println("pow()="+Math.pow(2,3));     //2의 3승
	
// 0.0 <= Math.random() < 1.0 범위의 난수 발생
System.out.println("random()="+Math.random());
		
System.out.println("sqrt()="+Math.sqrt(5));		// 제곱근
	}

}


