package 변수;

/**
 
 변수
 - 변수란? : [하나의 값]을 할당할 수 있는 [메모리공간]
 - 변수의 선언
  	int value; //아직 초기화는 되지 않음
 - 변수는 초기화되어야 읽을 수 있음.
 - 모든 변수는 메서드 블럭 {} 내에 존재함.
 
 데이터타입
 - 타입 캐스팅 : 데이터 타입을 다른 데이터 타입으로 변환하는 것.
 - 자동 타입 변환(Promotion) : 작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될 때 발생.
 - 강제 타입 변환 : 
 	
 	작은 크기 타입 = (작은 크기 타입)큰 크기 타입
 	
 
 
 */


public class _01개요 {
	public static void main(String [] args) {
		int unicode = 'A';
		System.out.println(unicode);
	}
}
