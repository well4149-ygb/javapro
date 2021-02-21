package p2021_02_16.Abstact;

abstract class Hello{		// 추상 클래스
  public abstract void sayHello(String name);	// 추상 메소드
}
abstract class GoodBye{		// 추상 클래스
  public abstract void sayGoodBye(String name);	// 추상 메소드
}

// 자바에서는 클래스의 다중상속을 허용하지 않는다.
//class SubClass03 extends GoodBye, Hello {
//  public void sayHello(String name){
//      System.out.println(name+"씨 안녕하세요!");
//  }
//  public void sayGoodBye(String name){
//      System.out.println(name+"씨 안녕히 가세요!");
//  }
//}
class AbstractTest03{
   public static void main(String[] args) {
//     SubClass03 test= new SubClass03();
//     test.sayHello(args[0]);
//     test.sayGoodBye(args[0]);
   }   
}                                                       
