package socket.실습.싱글스레드;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExample {
	
	Socket mSocket = null;
	
	
	public ClientExample (String ip, int port) throws Exception {
		mSocket = new Socket(ip, port);
	}
	
	void toServer () {
		
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			OutputStream out = mSocket.getOutputStream();
			InputStream in = mSocket.getInputStream();
			
			PrintWriter mPrintWriter = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader mBufferedReader = new BufferedReader(new InputStreamReader(in));
			
			String message; // 전달 메시지
			String returnMessage; //받는 메시지
			
			while((message = input.readLine()) != null) {
				if(message.equals("q")) {
					break;
				}
				mPrintWriter.println(message);
				mPrintWriter.flush();
				
				returnMessage = mBufferedReader.readLine();
				System.out.println("From Server : " + returnMessage);
			}
			try {out.close();} catch (Exception e){ }
			try {in.close();} catch (Exception e){ }
			try {mSocket.close();} catch (Exception e){ }
			
		} catch (Exception e) {e.printStackTrace();}
		
	}
	
	
	public static void main(String [] args) throws Exception {
		ClientExample client = new ClientExample("localhost", 7788);
		client.toServer();
	}
}
