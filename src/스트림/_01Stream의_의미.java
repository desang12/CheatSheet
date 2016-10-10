package 스트림;

import java.io.InputStream;
import java.io.OutputStream;

/**
 
 스트림 : 연속적인 데이터의 흐름(출발지 -----> 도착지)
 자바에서 데이터는 스트림을 통해 입출력됨.
 
 프로그램이 데이터를 입력받을 때 : InputStream
 프로그램이 데이터를 보낼 때 : OutputStream
 
 InputStream의 출발지 : 키보드, 파일, 네트워크상의 프로그램 ...
 OutputStream의 도착지 : 모니터, 파일, 네트워크상의 프로그램 ...
 
 항상 프로그램을 기준으로 데이터가 들어오면 입력 스트림이고,
 데이터가 나가면 출력 스트림이다.
 프로그램이 네트워크 상의 다른 프로그램과 데이터 교환을 하기 위해서는
 양쪽 모두 입력 스트림과 출력 스트림이 따로 필요하다.
 
 * 스트림의 특성이 단방향이므로 하나의 스트림으로 입력과 출력을 모두 할 수 없기 때문이다.
 
 
  >>> java.io 패키지의 주요 클래스
  
  File : 파일 시스템의 파일 정보를 얻기 위한 클래스
  Console : 콘솔로부터 문자를 입출력하기 위한 클래스
  
  InputStream/OutputStream : 바이트 단위 입출력을 위한 최상위 입출력 스트림 클래스
  
  FileInputStream/FileOutputStream
  DataInputStream/DataOutputStream
  ObjectInputStream/ObjectOutputStream
  PrintStream
  BufferedInputStream/BufferedOutputStream
  : 바이트 단위 입출력을 위한 하위 스트림 클래스
  
  Reader/Writer : 문자 단위 입출력을 위한 최상위 입출력 스트림 클래스
  
  FileReader / FileWriter
  InputStreamReader / OutputStreamWriter
  PrintWriter
  BufferedReader / BufferedWriter
  : 문자 단위 입출력을 위한 하위 스트림 클래스
  
  
  스트림 클래스는 크게 두 가지로 구분(바이트 기반 스트림, 문자 기반 스트림)
  
  - 바이트 기반 스트림은 그림, 멀티미디어, 문자 등 모든 종류의 데이터 주고 받음
  - 문자 기반 스트림은 오로지 문자만 받고 보낼 수 있도록 특화되어 있음
  
  
 예)
 그림, 멀티미디어, 텍스트 등의 파일을 바이트 단위로 읽어들일 때에는 FileInputStream을
 사용하고, 바이트 단위로 저장할 때는 FileOutputStream을 사용한다.
 텍스트 파일의 경우, 문자 단위로 읽어들일 때에는 FileReader를 사용하고,
 문자 단위로 저장할 때는 FileWriter를 사용한다.
 
 
 */


public class _01Stream의_의미 {

	public static void main(String [] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
	}
}
