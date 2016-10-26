package designPatterns.BASIC.DecoratorPattern;

public class ClientWithDecor {

	public static void main(String[] args) {
		IService decorator = new Decorator();
		System.out.println(decorator.runSomething());
	}
}
