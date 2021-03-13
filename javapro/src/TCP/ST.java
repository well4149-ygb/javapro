package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ST extends Thread {
	private Socket m_Socket; //Socket 타입 변수 m_Socket 선언 
	public void run() //thread에 있는 thread에서 동작하는 run 함수를 오버라이딩 
	{
		super.run(); // 부모 thread에 run 함수 호출 
	try { 
		BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(System.in)); 
		//버퍼리더를 이용한 입력 객체 생성 
		PrintWriter sendWriter = new PrintWriter(m_Socket.getOutputStream()); 
		//PrintWriter의 sendWriter로 변수로 선언 후 객체를 생성 
		//객체를 생성할때 소켓의 출력 스트림을 인자로 받아서 생성 
		String sendString; 
		//문자열 변수 sendString 새성 
	while(true) //무한 반복 
	{ 
		sendString = tmpbuf.readLine(); 
		//입력을 받아서 문자열 변수 sendString에 대입 
		sendWriter.println(sendString); 
		//PrintWriter의 println함수에 문자열 변수 sendString을 대입 
		sendWriter.flush(); 
		//PrintWriter의 flush 함수 호출 
		// 문자열을 입력 받아서 PrintWriter의 객체에 입력 받은 문자열을 받고 
		// PrintWriter의 flush 함수이 호출 되면 문자열 데이터를 전송하게 됩니다. 
		} 
	}catch(IOException e) { 
		//입출력 예외처리 발생시 실행 
		e.printStackTrace(); 
		} 
	} 
	//메인문에서 소켓 객체 받아서 내 변수에 대입 
	public void setSocket(Socket _socket) { 
		//m_Socket에 main에서 만든 소켓 대입 
		m_Socket = _socket; 
	}
}


