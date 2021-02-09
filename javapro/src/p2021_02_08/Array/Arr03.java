package p2021_02_08.Array;

public class Arr03 {

  public static void main(String[] args) {
    //정수값을 담을 수 있는 5행 3열짜리 기억 공간이 생성 

    int[][] score = new int[5][3]; 
    int  row, col;  					//반복문에서 사용할 제어변수 선언

    //행과 열의 위치를 첨자로 지정하여 값 대입 
    score[0][0]=10;  score[0][1]=90;  score[0][2]=70;
    score[1][0]=60;  score[1][1]=80;  score[1][2]=65;
    score[2][0]=55;  score[2][1]=60;  score[2][2]=85;
    score[3][0]=90;  score[3][1]=75;  score[3][2]=95;
    score[4][0]=60;  score[4][1]=30;  score[4][2]=80;

    //반복문으로 일괄처리 
    for(row = 0; row < 5; row++){ 		// 학생수(1~5번:5명)
      for(col = 0; col < 3; col++){  	// 과목수(국어, 영어, 수학)
         System.out.print(" " +score[row][col]);
	  }
      System.out.println("");  //행단위로 줄 바꿈 
    }
  }
}           