package 예외처리;

/**
 
 키워드 throw를 사용해서 프로그래머가 고의로 예외를 발생시킬 수 있다.
 
 
 순서
 
 1.먼저, 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체 생성
 	Exception e = new Exception();
 	--> todtjdwkdp String을 넣어주면 인스턴스 메시지로 저장됨.
 	이 메시지는 getMessage()를 통해 얻을 수 있음.
 	
 	
 2. 키워드 throw를 이용해서 예외 발생 시킴
 	throw e;
  
 */


public class _05예외발생시키기 {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
			
		} catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}

}
