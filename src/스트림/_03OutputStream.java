package 스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 
 1. OutputStream : 바이트 기반 출력 스트림의 최상위 클래스로 추상 클래스이다.
 
 OutputStream --> (FileOutputStream, PrintStream, BufferedStream, DataOutputStream)
 
 2. 주요 메서드
 write(int b) : 출력 스트림으로 1바이트를 보낸다(b의 끝 1바이트)
 write(byte[] b) : 출력스트림으로 주어진 바이트 배열 b의 모든 바이트를 보낸다.
 write(byte[] b, int off, int len) : 출력 스트림으로 주어진 바이트 배열
 									b[off]부터 len개 까지의 바이트를 보낸다.
 flush() : 버퍼에 잔류하는 모든 바이트를 출력한다.
 close() : 사용한 시스템 자원은 반납하고 출력 스트림을 닫는다.
 
 3. write(int b)
 
 	OutputStream os = new FileOutputStream("C:/test.txt");
 	byte [] data = "ABC".getBytes();
 	for(int i = 0; i < data.length; i++){
 		os.write(data[i]); // "A", "B", "C"를 하나씩 출력
 	}
 
 
 4. write(byte [] b) 
 
 	매개값으로 주어진 바이트 배열의 모든 바이트를 출력 스트림으로 보낸다.
 	
 	OutputStream os = new FileOutputStream("C:/test.txt");
 	byte[] data = "ABC".getBytes();
 	os.write(data); "ABC" 모두 출력
 	
 	
 5. write(byte[] b, inf off, int len)
 
 	OutputStream os = new FileOutputStream("C:/test.txt");
 	byte[] data = "ABC".getBytes();
 	os.write(data, 1, 2); "BC"만 출력
 	
 	
 6. flush()
 	
 	출력 스트림은 내부에 작은 버퍼(buffer)가 있어서 데이터가 출력되기 전에
 	버퍼에 쌓여있다가 순서대로 출력된다.
 	flush()는 버퍼에 잔류하고 있는 데이터를 모두 출력시키고 버퍼를 비우는
 	역할을 한다. 프로그램에서 더 이상 출력할 데이터가 없다면 flush() 메서드를
 	마지막으로 호출하여 버퍼에 잔류하는 모든 데이터가 출력되도록 해야 한다.
 	
 	OutputStream os = new FileOutputStream("C:/test.txt");
 	byte[] data = "ABC".getBytes();
 	os.write(data, 1, 2); "BC"만 출력
 	os.flush();
 	os.close();
 	
 
 */


public class _03OutputStream {
	public static void main(String [] args) {
	
	 	

	}
}
