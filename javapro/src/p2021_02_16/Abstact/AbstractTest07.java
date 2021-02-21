package p2021_02_16.Abstact;

 //인터페이스(IColor)므로 다중 상속 가능
interface IColor{
  int RED=1;                           //상수(public static final 로 인식)
  public static final int GREEN=2;     //상수 
  public static final int BLUE=3;      //상수
  void setColor(int c);                //추상메서드 (public abstract 로 인식)
  public abstract int getColor();      //추상메서드
}

//클래스(AbsColor)이므로 다중 상속 불가능 단일 상속만, 
abstract class AbsColor implements IColor{
  int color=GREEN;                  	//변수도 가질 수 있디. 2
  public void setColor(int c){          //구현된 메서드도 가질 수 있다. 
    color=c; 							//color=1;
  }
}

class SubClass07 extends AbsColor{
  public int getColor(){
    return color;							// 1
  }
}

class AbstractTest07{
  public static void main(String[] args) {
	  
    SubClass07 test= new SubClass07();
    test.setColor(IColor.RED);				// 1
    System.out.println(test.getColor());
  }
}  






