package designPatterns.BASIC.Singleton;

public class Singleton {
	static Singleton singletonObject; //정적 참조변수
	
	private Singleton() {}; // private 생성자
	
	//객체 반환 정적 메서드
	public static Singleton getInstance() {
		if(singletonObject == null){
			singletonObject = new Singleton();
		}
		return singletonObject;
	}
}
