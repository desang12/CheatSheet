package 예외처리;

import java.security.AccessControlException;

/**
 
 멀티 catch 블럭
 | 기호를 사용해서 여러 catch 블럭을 하나의 catch 블럭으로 합칠 수 있다.
 | 기호로 연결할 수 있는 예외 클래스의 개수에는 제한이 없음.
 
 만일 멀티 catch 블럭의 | 기호로 연결된 예외 클래스가 조상과 자손의 관계에 있다면 컴파일 에러가 발생한다.
 (불필요한 코드 제거)
 
 
 */

public class _04멀티catch블럭 {

	public static void main(String [] args){
		try {
			
		} catch (ArithmeticException | ArrayStoreException | AccessControlException e) {
			// TODO: handle exception
		}
	}
}
