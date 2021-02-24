package p2021_02_24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertboard {
	public static void main(String[] args) {
		//db와 연결
		Connection conn =null;
		//sql문을 실행시키는 객체 
		PreparedStatement pstmt = null;
		
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url    = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";// mysql용
		
		try {//forname은 정적 메서드
			Class.forName(driver);//jdbc드라이버를 로딩
			//디비를 연결하는 주소 그리고 접속하려는 db의 아이디와 패스워드를 입력
			conn = DriverManager.getConnection(url, "jspid", "jsppass");
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("작성자명을 입력하세요.");
			String writer = rd.readLine();
			System.out.println("비밀번호를 입력하세요.");
			String passwd = rd.readLine();
			System.out.println("제목을 입력하세요.");
			String subject = rd.readLine();
			System.out.println("내용을 입력하세요.");
			String content = rd.readLine();
			
			String sql= "insert into board(writer,passwd,subject,content,reg_date) ";
				   sql+= " values(?,?,?,?,sysdate())";
			//preparedstatement객체를 사용해서 sql문을 읽음.
			pstmt = conn.prepareStatement(sql);
			//varchar2는 setString int는 setInt로 넣음.
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			
			int result = pstmt.executeUpdate();//해당 sql문을 실행함.
			if(result ==1) {
				System.out.println("글작성 성공");
			}else {
				System.out.println("글작성 실패");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {//무조건 실행
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}





