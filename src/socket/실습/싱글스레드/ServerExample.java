package socket.실습.싱글스레드;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	
	private int port; //port 변수 선언
	private String ip;
	
	//생성자 : 매개변수로 port번호 받음
	public ServerExample(String ip, int port) {
		this.port = port;
		this.ip = ip;
		
	}
	
	public void service() throws Exception {
		
		// 서버소켓 객체생성 -> 외부의 연결 요청 대기
//		ServerSocket mServerSocket = new ServerSocket(port);
		
		ServerSocket mServerSocket = new ServerSocket();
		//IP주소와 Port번호로 소켓 주소 생성.
		//해당 소켓 주소로 bind
		mServerSocket.bind(new InetSocketAddress(ip, port));

		while(true) {
			try {
				System.out.println("[연결 요청 기다리는 중...]");
				//서버 소켓은 클라이언트의 연결 요청이 올 때까지 실행을 멈추고 계속 기다림.
				//클라이언트의 요청이 들어오면 클라이언트 소켓과 통신할 새로운 소켓 생성.
				Socket mSocket = mServerSocket.accept(); 
				System.out.println("[ " + mSocket.getInetAddress() + " ] 연결 요청 들어옴.");
				System.out.println("[ " + mSocket.getInetAddress() + " ] 연결.");
				//getInetAddress() 해당 서버 소켓의 local address 반환
				
				processRequest(mSocket);
				System.out.println("[ 클라이언트 연결 종료 ]");
				
			} catch(Throwable e){
				System.out.println("[ 연결 오류 ]");
			}
			
		}
		
	}
	
	public void processRequest(Socket mSocket) throws Exception {
		
		//소켓의 OutputStream을 가져온다
		OutputStream out = mSocket.getOutputStream();
		//소켓의 InputStream을 가져온다
		InputStream in = mSocket.getInputStream();
		
		PrintWriter mPrintWriter = new PrintWriter(new OutputStreamWriter(out));
		BufferedReader mBufferedReader = new BufferedReader(new InputStreamReader(in));
		
		String receivedMessage = null;
		while((receivedMessage = mBufferedReader.readLine()) != null) {
			System.out.println("[ 클라이언트의 메시지 ] : " + receivedMessage);
			mPrintWriter.println(receivedMessage + " 잘 받았음."); //Client에게 해당 메시지 보냄
			mPrintWriter.flush();
		}
		
		try {out.close();} catch (Exception e){ }
		try {in.close();} catch (Exception e){ }
		try {mSocket.close();} catch (Exception e){ }
	}
	
	
	public static void main(String[] args) throws Exception {
		ServerExample mServer = new ServerExample("localhost", 7788);
		mServer.service();

	}

}
