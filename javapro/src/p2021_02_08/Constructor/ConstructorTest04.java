package p2021_02_08.Constructor;

class MyDate04{   
  int year;    				// 필드, 멤버변수
  int month;    
  int day;  

  public MyDate04(){		// 기본 생성자
    year=2016;    month=4;    day=1;
  }   
  // this : 내부 레퍼런스 변수
  public MyDate04(int year, int month, int day) {
	this.year = year;		// 2017
	this.month = month;		// 7
	this.day = day;			// 19
  }
  
  public void print(){		// 메소드
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest04 {     
  public static void main(String[] args) {
    MyDate04 d=new MyDate04();	//기본 생성자 호출
    d.print();

    MyDate04 d2=new MyDate04(2017, 7, 19);
    d2.print();
  }
}            