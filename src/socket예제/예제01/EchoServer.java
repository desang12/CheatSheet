package socket예제.예제01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 
 http://it-ing.tistory.com/111
 
 서버는 Socket을 생성하여 Port와 Bind해야 한다.
 그리고 Port에서 클라이언트의 접속을 기다리는데 이를 Listen이라고 한다.
 서버는 클라이언트가 Socket을 붙이려하면 이를 Accept하여 접속을 허가한다.
 이때부터 클라이언트의 요청 Send을 서버는 받아 Receive주며 통신이 성사된다.
 
 Inet
 인터넷프로토콜을 사용하는 네트워크를 지칭하는 용어,
 인터넷, 인트라넷 및 엑스트라넷 중 하나 또는 전체를 아우르는 용어로 사용
 
 자바에서의 InetAddress 클래스는 호스트 네임이나 IP 주소를 가져오는 역할을 한다.
 
 */

public class EchoServer {

	public static void main(String [] args) throws Exception {
		
		ServerSocket mServerSocket = null;
		int port = 10001;
		
		try {
			// 포트에 서버소켓을 바인딩
			mServerSocket = new ServerSocket(port);
			System.out.println(getTime() + "Server Ready");
			
			// 클라이언트의 접속 허용
			Socket mSocket = mServerSocket.accept();
			// 클라이언트의 주소를 가져온다.
			InetAddress clientAddress = mSocket.getInetAddress();
			System.out.println(getTime() + "Client Connected from : "+ clientAddress);
			
			//클라이언트 소켓의 바이트 스트림을 가져온다
			OutputStream out = mSocket.getOutputStream();
			//클라이언트 소켓의 바이트 스트림을 입력한다.
			InputStream in = mSocket.getInputStream();
			
			PrintWriter mPrintWriter = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader mBufferedReader = new BufferedReader(new InputStreamReader(in));
			
			String mReceived = null;
			while((mReceived = mBufferedReader.readLine()) != null) {
				System.out.println(getTime() + "Message from Client : " + mReceived);
				mPrintWriter.println(mReceived); // Echo to Client
				mPrintWriter.flush(); // 버퍼를 비움
			}
			
			mPrintWriter.close();
			mBufferedReader.close();
			mSocket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	//시간 출력
	static String getTime() {
		SimpleDateFormat mTime = new SimpleDateFormat("[hh:mm:ss]");
		return mTime.format(new Date());
	}
}
