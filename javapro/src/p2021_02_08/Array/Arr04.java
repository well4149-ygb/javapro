package p2021_02_08.Array;

public class Arr04 {

  public static void main(String[] args) {
   
    int[][] score = { { 85,  60,  70},   //0 행
				      { 90,  95,  80},   //1 행
				      { 75,  80, 100},   //2 행
                      { 80,  70,  95},   //3 행
				      {100,  65,  80}    //4 행
					 };
    int [] subject = new int[3]; 		//과목총점 저장 
    int [] student = new int[5]; 		//학생의 총점 저장
        // subject[0]=0, student[0]=0;
    int  r, c;  
	    
    System.out.println("각 과목별 총점구하기 ");
    for(c = 0; c < 3; c++){ 			// 과목         
      for(r = 0; r < 5; r++){ 			//학생      
        subject[c] += score[r][c];   
      }//subject[c] = subject[c] + score[r][c];
      System.out.println(subject[c]);  
    }

    System.out.println("학생별 총점구하기");
    for(r = 0; r < 5; r++){    			//학생      
      for(c = 0; c < 3; c++){  			//과목    
        student[r] += score[r][c];  
      }//student[r] = student[r] + score[r][c];
      System.out.println(student[r]);
    }

  }//main() end
}// class end        