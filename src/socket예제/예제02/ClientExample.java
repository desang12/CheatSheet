package socket예제.예제02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		Socket mSocket = null;
		try {
			mSocket = new Socket();
			System.out.println("[연결 요청]");
			mSocket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("[연결 성공]");
			
			byte [] bytes = null;
			String message = null;
			
			OutputStream os = mSocket.getOutputStream();
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			
			InputStream is = mSocket.getInputStream();
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes, 0, readByteCount, "UTF-8");
			System.out.println("[데이터 받기 성공] : " + message);
			
			os.close();
			is.close();
		} catch(Exception e) {
			if(!mSocket.isClosed()){
				try {
					mSocket.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

}
