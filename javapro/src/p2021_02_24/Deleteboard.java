package p2021_02_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deleteboard {
	public static void main(String[] args) {
//		  String driver = "oracle.jdbc.driver.OracleDriver";
//		  String url = "jdbc:oracle:thin:@localhost:1521:xe";
		  String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost/jsptest";// mysql용
		  Connection con = null;
		  PreparedStatement pstmt =  null;
		  int no;
		  String sql;
		  try{
		      Class.forName(driver);
		      con = DriverManager.getConnection(url, "jspid", "jsppass" );      

		      //---JDBC_Delete 변경된 내용-------
		      // 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      System.out.println(" customer 테이블에서 레코드 삭제하기 .....");
		      System.out.print("삭제할 회원 번호를 입력하세요: ");
		      no = Integer.parseInt(br.readLine());     //테이블에서 삭제할 name 필드 값을 입력 받음
		   
		      // DELETE 쿼리문을 작성
			  sql = "DELETE FROM board WHERE no = ?";
			  pstmt = con.prepareStatement( sql );
			  pstmt.setInt(1, no);	  
		      int result=pstmt.executeUpdate() ;   
		      if(result == 1){
		  		 System.out.println(" 데이터 삭제 성공!! ");
		        }else{
		  		 System.out.println(" 데이터 삭제 실패 ");
		  	  }
			}catch(Exception e){
		      System.out.println("데이터베이스 연결 실패!");
		    }
		    finally{
		      try{
		        if( pstmt != null ) pstmt.close();
		        if( con != null )  con.close();
		      }
		      catch(Exception e){ 
		        System.out.println( e.getMessage());
		      }
		    }
	}
}
