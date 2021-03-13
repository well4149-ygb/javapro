package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class RT extends Thread {
	private Socket m_Socket; // Thread 클래스 run 함수 오버라이딩 
	public void run() { 
		//1. 부모 쓰래드 run 시작 
		super.run(); 
		try { 
			//2. 버퍼리더 생성 -> m_Socket.getInputStream()(소캣을 이용한 버퍼리더 생성) 
			BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(m_Socket.getInputStream())); 
			//문자열 변수 선언 
			String receiveString; 
			//무한반복 
			while(true) { 
				//문자열 변수 receiveString <- 버퍼리더 리드라인 한줄씩 저장 
				receiveString = tmpbuf.readLine(); 
				//만약에 receiveString 널이면 실행 
				if(receiveString ==null) { 
					System.out.println("상대방 연결이 끊겼습니다"); 
					//출력 
					break; 
					//반복탈출 
				} 
				else { 
					// receiveString을 출력 
					System.out.println("상대방 :"+receiveString); 
					} 
				} 
			//반복문이 끝나면 버퍼리더 종료 
			tmpbuf.close(); 
			}catch(IOException e) { 
				//입출력 예외처리 발생시 실행 
				e.printStackTrace(); } 
		} //메인문에서 소켓 객체 받아서 내 변수에 대입 
	public void setSocket(Socket _socket) { 
		//m_Socket에 main에서 만든 소켓 대입 
		m_Socket = _socket; }
}		
	





