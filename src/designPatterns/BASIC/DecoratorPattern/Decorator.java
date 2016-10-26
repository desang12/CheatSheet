package designPatterns.BASIC.DecoratorPattern;

public class Decorator implements IService {
	IService service1;
	
	public String runSomething() {
		System.out.println("호출에 대한 장식이 주목적, 클라이언트에게 반환 결과에 장식을 더해 전달");
		
		service1 = new Service();
		return "정말" + service1.runSomething();
	}
}
