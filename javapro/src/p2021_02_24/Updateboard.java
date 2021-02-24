package p2021_02_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class Updateboard {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";// mysql용
		try{
		      Class.forName(driver);
		      conn = DriverManager.getConnection(url, "jspid", "jsppass" );      

		      //---JDBC_Insert 추가된 내용-------
		      // 테이블에 추가할 내용을 도스 콘솔 창에서 사용자의 입력을 받도록 한다.
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      System.out.println("번호를 입력 하세요?");
		      String no = br.readLine();
		      int ino = Integer.parseInt(no);
		      System.out.println("작성자명을 입력");
		      String writer = br.readLine();
		      System.out.println("비밀번호를 입력");
		      String passwd = br.readLine();
		      System.out.println("제목을 입력");
		      String subject = br.readLine();
		      System.out.println("내용을 입력");
		      String content = br.readLine();
		      
		      String sql="update board set writer=?, passwd=?, subject=?,";
		      		sql+="content=?, reg_date=sysdate() where no=?";
		      
      		  pstmt = conn.prepareStatement(sql);
		      pstmt.setString(1, writer);
		      pstmt.setString(2, passwd);
		      pstmt.setString(3, subject);
		      pstmt.setString(4, content);
		      pstmt.setInt(5, ino);
		      
		      int result = pstmt.executeUpdate();
		      if(result ==1) {
		    	  System.out.println("글수정 성공");
		      }else {
		    	  System.out.println("글수정 실패");
		      }
			}
		    catch(Exception e){
		    	e.printStackTrace();
		    }finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
}
