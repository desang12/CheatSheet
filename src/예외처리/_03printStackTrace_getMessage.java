package 예외처리;

/**
 
 > printStackTrace()
 예외 발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력
 
 > getMessage()
 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
 
 
 프로그램이 비정상적으로 종료되는 것을 막고,
 예외의 발생원인을 찍어보기위해 사용
 
 printStackTrace(PrintStream s) 또는 printStackTrace(PrintWriter s)를 사용하면
 발생한 예외에 대한 정보를 파일에 저장할 수도 있다.
 
 */


public class _03printStackTrace_getMessage {
	public static void main(String [] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외메시지 : " + e.getMessage());
		}
		System.out.println(6);
	}
}
