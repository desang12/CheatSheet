package 참조타입;


/**
 
 배열은 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스를 부여해 놓은 자료구조이다.
 배열은 같은 타입의 데이터만 저장할 수 있다. 또한 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없다.
 
 1. 배열 선언
 타입 [] 변수;
 int [] intArray;
 double [] doubleArray;
 String [] strArray;
 
 2. 값 목록으로 배열 생성
 데이터타입 [] 변수 = {값0, 값1, 값2, ...};
 
 String [] names = {"A", "B", "C"};
 
 배열을 먼저 선언 후 값 목록으로 배열 객체를 생성하는 것은 허용X.
 
 타입 [] 변수;
 
 변수 = {값0, 값1, 값2,..}; // 컴파일 에러
 
 --> 변수 = new 타입 [] {값0, 값1, 값2,...}; (O)
 
 예)
 String [] names;
 names = new String [] {"A", "B", "C"};
 
 
 3. new 연산자로 배열 생성
 
 값의 목록을 가지고 있지 않지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면
 new 연산자로 다음과 같이 배열 객체를 생성할 수 있음.
 
 타입 [] 변수 = new 타입[길이];
 
 int [] intArray = new int[5];
 
 
 
 배열 복사
 
 for문 이용 또는 System.arraycopy() 메서드 이용
 
 System.arraycopy(원본배열, 원본배열에서 복사할 항목의 시작 인덱스, 새 배열, 새 배열에 붙여넣기 시작할 인덱스, 복사할 길이)
 
 public class _02배열 {
	public static void main(String [] args) {
		String [] oldStrArray = {"java", "array", "copy" };
		String [] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++){
			System.out.print(newStrArray[i] + ((i == newStrArray.length - 1) ? "" : ", "));
		}
	}
}

참조 타입 배열일 경우, 배열 복사가 되면 복사되는 값이 객체의 번지이므로 새 배열의 항목은 이전 배열의 항목이 참조하는
객체와 동일하다. 이것을 얕은 복사(shallow copy)라고 한다. 반대로 깊은 복사(deep copy)는 참조하는 객체도 별도로 생성하는
것을 말한다.
 
 */
public class _02배열 {
	public static void main(String [] args) {
		String [] oldStrArray = {"java", "array", "copy" };
		String [] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i = 0; i < newStrArray.length; i++){
			System.out.print(newStrArray[i] + ((i == newStrArray.length - 1) ? "" : ", "));
		}
	}
}
