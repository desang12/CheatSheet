package socket예제.예제03;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class TcpIpClient {

	public static void main(String[] args) {
		try {
			String serverIP = "127.0.0.1";
			System.out.println("서버에 연결 중입니다. 서버 IP : " + serverIP);
			//소켓을 생성하여 연결을 요청한다.
			
			Socket socket = new Socket(serverIP, 7777);
			
			//소켓의 입력 스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//소켓으로부터 받은 데이터를 출력한다.
			System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			//스트림과 소켓을 닫는다.
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
