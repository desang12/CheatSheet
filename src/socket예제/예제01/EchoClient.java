package socket예제.예제01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {
	
	public static void main(String [] args) {
		
		try {
			String ip = "localhost";
			int port = 10001;
			Socket mSocket = new Socket(ip, port);
			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			OutputStream out = mSocket.getOutputStream();
			InputStream in = mSocket.getInputStream();
			
			PrintWriter mPrintWriter = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader mBufferedReader = new BufferedReader(new InputStreamReader(in));
			
			String message = null; //전달 메시지
			String returnMessage = null; //받는 메시지
			
			while((message = input.readLine()) != null) {
				if(message.equals("q")){
					break;
				}
				mPrintWriter.println(message); // printwriter를 이용해서 서버에게 전달
				mPrintWriter.flush(); // 버퍼 비우기
				
				returnMessage = mBufferedReader.readLine();
				System.out.println("From Server : " + returnMessage);
			}
			mPrintWriter.close();
			mBufferedReader.close();
			mSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
