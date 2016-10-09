package 예외처리;


/**
 
 try블럭 내에서 예외가 발생한 경우
 1. 발생한 예외와 일치하는 catch 블럭이 있는지 확인
 2. 일치하는 catch 블럭을 찾게되면, 그 catch블럭 내의 문장을 수행
 3. try-catch 블럭을 빠져나감
 4. 만약 일치하는 catch 블럭 없다면, 예외 처리 불가

try블럭에서 예외가 발생하면, 예외가 발생한 위치 이후에 있는
try블럭의 문장들은 수행되지 않으므로, try블럭에 포함시킬 코드의 범위를 잘 선택해야 한다.


	try {
		System.out.println(1);
		System.out.println(0/0); //Exception 발생
		System.out.println(2); //실행되지 않는다.
	} catch (ArithmeticException e) {
		System.out.println(0);
	} catch (Exception e) {
		//위 catch블럭 수행되었으므로 이 부분은 수행 안됨.
	}
 
 */


public class _02try_catch문의_흐름 {

}
