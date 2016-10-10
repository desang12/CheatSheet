package 스트림;

/**
 
 1. InputStream
 
 InputStream은 바이트 기반 입력 스트림의 최상위 클래스로 추상 클래스이다.
 모든 바이트 기반 입력 스트림은 이 클래스를 상속해서 만들어진다.
 
 InputStream --> (FileInputStream, BufferedInputStream, DataInputStream)
 
 
 2. 메서드
 read() : 입력 스트림으로부터 1바이트를 읽고 읽은 바이트를 리턴
 read(byte[] b) : 입력스트림으로 부터 읽은 바이트들을 매개값으로 주어진 바이트 배열 b에 저장하고 실제로 읽은 바이트 수를 리턴한다.
 read(byte[] b, int off, int len) :
 	입력 스트림으로부터 len개의 바이트만큼 읽고 매개값으로 주어진 바이트 배열 b[off]부터
 	len개 까지 저장. 그리고 실제로 읽은 바이트 수인 len개를 리턴.
 	만약 len개를 모두 읽지 못하면 실제로 읽은 바이트 수를 리턴
 close() : 사용한 시스템 자원을 반납하고 입력 스트림을 닫는다.
 
 
 3. read()
 입력스트림으로부터 1바이트를 읽고 4바이트 int 타입으로 반환.
 더 이상 입력 스트림으로부터 바이트를 읽을 수 없다면 -1을 리턴,
 이것을 이용해서 읽을 수 있는 마지막 바이트까지 루프를 돌며 한 바이트씩 읽을 수 있다.
 
 	InputStream is = new FileInputStream("C:/test.jpg");
 	int readByte;
 	while ((readByte = is.read()) != -1) {...}
 
 
 4. read(byte[] b) 메서드
 입력 스트림으로부터 매개값으로 주어진 바이트 배열의 길이만큼 바이트를 읽고 배열에 저장.
 그리고 읽은 바이트 수를 리턴한다.
 역시 더 이상 입력 스트림으로 부터 바이트를 읽을 수 없다면 -1을 리턴한다.
 이것을 이용해서 읽을 수 있는 마지막 바이트까지 루프를 돌며 읽을 수 있다.
 
	 InputStream is = new FileInputStream("C:/test.jpg");
	 int readByteNo;
	 byte[] readBytes = new byte[100];
	 while ((readByteNo = is.read(readBytes)) != -1) {...}
 
 입력 스트림으로부터 100개의 바이트가 들어온다면 read() 메서드는 100번을 루핑해서 읽어들여야 한다.
 그러나 read(byte[] b) 메서드는 한 번 읽을 때 매개값으로 주어진 바이트 배열 길이만큼
 읽기 때문에 루핑 횟수가 현저히 줄어든다. 그러므로 많은 양의 바이트를 읽을 때는
 read(byte[] b) 메서드를 사용하는 것이 좋다.
 
 
 5. read(byte[] b, int off, int len) 메서드
 
  입력스트림으로부터 len개의 바이트만큼 읽고, 매개 값으로 주어진 바이트 배열 b[off]부터
  len가지 저장한다. 그리고 읽은 바이트 수인 len개를 리턴한다.
  
 
 */

public class _02InputStream {

}
