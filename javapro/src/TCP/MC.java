package TCP;

import java.io.IOException;
import java.net.Socket;

public class MC {

	public static void main(String[] args) {
		
		try { //1. 소켓생성 특징 서버 ip가 필요, 포트 
				Socket c_socket = new Socket("서버IP",8888); 
			//2. 리시브 스래드 생성 
				RT rec_thread = new RT(); 
				//3. 리시브 스래드에 소켓 전달 
				rec_thread.setSocket(c_socket); 
				//4. 샌드 스래드 생성 
				CT send_thread = new CT(); 
				//5. 샌드 스래드에 소켓 전달 
				send_thread.setSocket(c_socket); 
				//6. 샌드 스래드 시작 
				send_thread.start(); 
				//7. 리시브 스래드 시작 
				rec_thread.start(); }
		catch(IOException e) { 
			//입출력 예외 발생시 실행 
			e.printStackTrace(); }
		}

	}


