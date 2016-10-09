package 예외처리;


/** 
 
 오류
 발생시점에 따라 "컴파일 에러", "런타임 에러"로 구분
 
 - 컴파일 에러 : 컴파일 도중 발생하는 에러
 - 런타임 에러 : 프로그램 실행 도중 발생하는 에러
 + 논리적 에러 : 컴파일, 실행 성공 -> 의도와 다르게 동작
 
 자바에서는 런타임 에러를 "에러(Error)"와 "예외(Exception)"로 구분
 - Error : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(메모리부족, Stackoverflow)
 - Exception : 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류
 예외(Exception)는 프로그래머가 이에 대한 적절한 코드를 작성하여 비정상적인 종료 방지 가능
 
 예외 클래스는 크게 두 개의 그룹으로 나뉨
 1. RuntimeException과 그 자손 클래스들
 2. Exception클래스와 그 자손클래스들

 RuntimeException
 주로 프로그래머의 실수에 의해 발생
 예) 배열의 범위 벗어남, NullPointExecption, ClassCastException 등.
 
 Exception 클래스들
 주로 외부의 영향으로 발생할 수 있는 것들
 예) 존재하지 않는 파일의 이름 입력, 클래스의 이름 잘못 입력, 데이터 형식 틀림 등
 
 
 <예외 처리하는 법> : try - catch 문
 Exception Handling이란?
 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것.
 예외처리의 목적은 예외의 발생으로 인한 실행 중인 프로그램의 갑작스런 비정상 종료를 방지하고,
 정상적인 실행상태를 유지할 수 있도록 하는 것.
 
 ---------------------------------------------------------------------------------------
		 try {
		 	//예외가 발생할 수 있는 문장들을 넣는다.
		 } catch(Exception1 e1) {
		 	//Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 넣음.
		 } catch(Exception2 e2) {
		 	//Exception2가 발생했을 경우, 이를 처리하기 위한 문장 넣음.
		 	...
		 } catch(ExceptionN eN) {.
		 	//ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장 넣음.
		 }
-----------------------------------------------------------------------------------------
 
 	try-catch문은 중첩 가능하다.
 	
 
 */

/*
  
 
public class _01개요 {
	public static void main(String [] args) {
		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			result = number / (int)(Math.random() * 10);
			System.out.println(result);
		}
	}
}

Exception in thread "main" 100
java.lang.ArithmeticException: / by zero
	at 예외처리._01개요.main(_01개요.java:61)

--> 0으로 나누려했기 때문에 ArithmeticException 발생
실수는 0으로 나누는 것이 금지되어있지 않지만,
정수는 0으로 나누는 것이 금지되어있어 발생하는 오류.

*/

public class _01개요 {
	public static void main(String [] args) {
		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("0");
			}
			
		}
	}
}

