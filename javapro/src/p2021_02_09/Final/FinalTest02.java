package p2021_02_09.Final;

class FinalMethod{
  String str="Java ";
  //public void setStr(String s) {
  //final 붙이면 서브 클래스에서 오버라이딩이 불가.            
  public final void setStr(String s) {
    str=s;
    System.out.println(str);
  }
}
class FinalEx extends FinalMethod{    
  int a=10; // final 붙이면 밑에서 a값 대입 불가.
  public void setA(int a) {
    this.a=a;
   }
//  public void setStr(String s) {
//    str+=s;
//    System.out.println(str);
//  }

}
public class FinalTest02{
  public static void main(String[] args) {
    FinalEx  ft= new FinalEx( );
    ft.setA(100);
    ft.setStr("hi");// 슈퍼 클래스의 setStr을 실행.
    FinalMethod ft1=new FinalMethod( );
    ft1.setStr("hi");// 자신의 클래스의 setStr을 실행.
  }   
}           