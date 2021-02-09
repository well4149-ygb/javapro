package p2021_02_09.Final;

final class FinalClass{//상속이 안됨...
  String str="Java ";
    public void setStr(String s){
      str=s;
    System.out.println(str);
  }
}
//class FinalEx extends FinalClass{    
//   int a=10; 
//   public void setA(int a)  {
//    this.a=a;
//   }
//   public void setStr(String s){
//    str+=s;
//    System.out.println(str);
//   }
//}
public class FinalTest03{
   public static void main(String[] args) {
    FinalEx fe= new FinalEx( );
   }   
}          