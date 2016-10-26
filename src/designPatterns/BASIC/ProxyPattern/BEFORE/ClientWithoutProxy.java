package designPatterns.BASIC.ProxyPattern.BEFORE;

public class ClientWithoutProxy {

	public static void main(String[] args) {
		Service service = new Service();
		System.out.println(service.runSomething());
	}
}
