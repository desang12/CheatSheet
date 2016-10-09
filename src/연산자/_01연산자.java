package 연산자;


/**
 
 - 비트
 ~ : 비트 NOT
 & : AND
 | : OR
 ^ : XOR
 
 - 쉬프트
 >>, <<, >>>
 
 


 
 >>>>>>>>>> 비트 반전 연산자(~) <<<<<<<<<<<<

  비트 반전 연산자는 정수타입의 피연산자에만 사용되며,
  2진수로 표현된 피연산자를 반전한다.
  연산 후 부호 비트인 최상위 비트를 포함해서 모든 비트가 반전되기 때문에,
  부호가 반대인 새로운 값이 산출된다.
  (주의) 비트 반전 연산자 산출타입은 int 타입이 된다.
  
  toBinaryString() : 정수 값을 총 32비트의 이진 문자열로 리턴.

class BitOper {
	public static void main(String [] args){
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + " 십진수 : " + v1);
		System.out.println(toBinaryString(v2) + " 십진수 : " + v2);
		System.out.println(toBinaryString(v3) + " 십진수 : " + v3);
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + " 십진수 : " + v4);
		System.out.println(toBinaryString(v5) + " 십진수 : " + v5);
		System.out.println(toBinaryString(v6) + " 십진수 : " + v6);
		
	}
	
	public static String toBinaryString(int value){
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}


>>>>>>>>>>> NaN과 Infinity 연산 <<<<<<<<<<<

5 / 0.0 -> Infinity
5 % 0.0 -> NaN

(주의) 연산의 결과가 Infinity 또는 NaN이라면 다음 연산을 수행해선 안됨.
어떤 값과 산술연산을 해도 Infinity와 NaN이 산출되어 데이터가 엉망이 될 수 있음.

프로그램 코드에서 /와 %의 연산 결과가 Infinity 또는 NaN인지 확인하려면
Double.isInfinite()와 Double.isNaN() 메서드를 사용하면 된다.


class InfinityAndNaNCheck {
	public static void main(String [] args){
		int x = 5;
		double y = 0.0;
		double z = x / y;
		double w = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(w));
		
		if(Double.isInfinite(z) || Double.isNaN(z)){
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}	
	}
}



[[[[[[ 입력값의 NaN 검사 ]]]]]]]

부동소수점(실수)을 입력받을 때는 반드시 NaN 검사를 해야 한다.
악의성 있는 사용자는 숫자로 변환이 안 되는 NaN을 입력할 수도 있다.
(NaN + x = NaN)

public class _01연산자 {
	public static void main(String [] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance); //NaN이 리턴됨.
	}
}

때문에 사용자로부터 문자열을 입력받을 때에는 반드시 NaN인지를 조사하고 만약
"NaN"이라면 NaN과 산술 연산을 수행해서는 안 된다.

--> 수정
public class _01연산자 {
	public static void main(String [] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		
		if(Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음.");
			val = 0.0;
		}
		currentBalance += val;
		System.out.println(currentBalance); //NaN이 리턴됨.
	}
}




자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 되어 있다.

[[[[[[[[[[[ 삼항 연산자 ]]]]]]]]]]]

조건식 ? 값 또는 연산식 : 값 또는 연산식

public class _01연산자 {
	public static void main(String [] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}


*/





public class _01연산자 {
	public static void main(String [] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
