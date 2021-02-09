package p2021_02_08.Constructor;

  class MyDate07 {   
  private int year;    
  private int month;    
  private int day;
  public MyDate07(){
  }
  //생성자 역시 매개변수의 이름을 속성과 동일하게 줄 수 있다.
  public MyDate07(int year, int month, int day){
    //멤버변수로 속성 값을 초기화하려면 대입연산자 왼쪽에 this를 붙여야 한다.
    this.year=year;  this.month=month;  this.day=day;
  }    
  public void SetYear(int year){ //대입연산자 왼쪽에 this를 붙였기에
    this.year=year;             //속성 값이 변경됨
  }
  public void SetMonth(int month){//대입연산자 왼쪽에 this를 붙였기에
    this.month=month;           //속성 값이 변경됨
 }
 public void print(){
  System.out.println(year+ "/" +month+ "/" +day); 
  }
}

public class ConstructorTest07 {     
  public static void main(String[] args) {
    MyDate07 d=new MyDate07(2017, 7, 19);
    d.print();
    d.SetYear(2018);  //2008년으로 변경
    d.SetMonth(8);    //8월로 변경
    d.print();
  }
}           