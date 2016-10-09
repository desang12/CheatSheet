package 예외처리;
/**
 
 메서드에 예외를 선언하려면, 메서드의 선언부에 키워드 throw를 사용해서
 메서드 내에서 발생할 수 있는 예외를 적어주기만 하면 된다.
 그리고 예외가 여러 개일 경우에는 쉼표, 로 구분한다.
 
	 void method() throws ExceptionA, ExceptionB, ExceptionC... {
	  //메서드 내용
	 }
 
 ※ 예외를 발생시키는 throw와 메서드 선언 시 throws를 구분
 
 > 메서드의 선언부에 예외를 선언하여 메서드를 사용하려는 사람이
 메서드의 선언부를 보았을 때, 이 메서드를 사용하기 위해서는 어떠한 예외들이
 처리되어져야 하는지 쉽게 알 수 있다.
 
 메서드에 throws를 명시하는 것은 예외를 처리하는 것이 아니라,
 자신을 호출한 메서드에게 예외를 전달하여 예외처리를 떠맡기는 것이다.
 예외를 전달받은 메서드가 또다시 자신을 호출한 메서드에게 전달할 수 있으며,
 이런 식으로 계속 호출스택에 있는 메서드들을 따라 전달되다가 제일 마지막에 있는
 main메서드에서도 예외가 처리되지 않으면, main 메서드 마저 종료되어 프로그램 전체가 종료된다.
 
 
 */


public class _06메서드에_예외_선언하기 {

	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("메인 메서드에서 예외 처리 완료.");
			e.printStackTrace();
		}

	}
	
	static void method() throws Exception {
		throw new Exception();
	}

}
