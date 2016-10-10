package 스트림;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 
 1. Reader
 
 문자 기반 입력 스트림의 최상위 클래스로 추상 클래스이다.
 모든 문자 기반 입력스트림은 이 클래스를 상속받아서 만들어진다.
 
 Reader --> (FileReader, BufferedReader, InputStreamReader)
 
 2. 메서드
 
 read() : 입력 스트림으로부터 한 개의 문자를 읽고 리턴한다.
 read(char [] cbuf) : 입력 스트림으로부터 읽은 문자들을 매개값으로 주어진 문자 배열
 					  cbuf에 저장하고 실제로 읽은 문자수를 리턴한다.
 
 read(char[] cbuf, int off, int len) :
 입력 스트림으로부터 len개의 문자를 읽고, 매개값으로 주어진 문자 배열 cbuf[off]
 부터 len개 까지 저장한다. 그리고 실제로 읽은 문자 수인 len개를 리턴한다.
 
 
 3. read()
 
 	입력 스트림으로부터 한 개의 문자(2바이트)를 읽고 4바이트 int 타입으로 리턴.
 	read() 메서드가 리턴한 int값을 char타입으로 변환하면 읽은 문자를 얻을 수 있음
 	
 	char charData = (char) read();
 	
 	더 이상 입력 스트림으로부터 문자를 읽을 수 없다면 read() 메서드는 -1을 리턴하는데
 	이것을 이용하면 읽을 수 잇는 마지막 문자까지 루프를 돌며 한 문자씩 읽을 수 있다.
 
 	public class _04Reader {
		public static void main(String [] args) throws IOException {
			Reader reader = new InputStreamReader(System.in);
			int readData;
			while((readData = reader.read()) != -1) {
				char charData = (char)readData;
				if (charData == 'q'){
					break;
				}
				System.out.print(charData);
			}
		}
	}
 
 
 4. read(char [] cbuf)
 
 	
 	
 
 
 */


public class _04Reader {
	public static void main(String [] args) throws IOException {
		Reader reader = new InputStreamReader(System.in);
		int readData;
		while((readData = reader.read()) != -1) {
			char charData = (char)readData;
			if (charData == 'q'){
				break;
			}
			System.out.print(charData);
		}
		
		
	}
}
