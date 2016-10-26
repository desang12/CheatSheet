package designPatterns.BASIC.TemplateMethod;

public class Driver {

	public static void main(String[] args) {
		Animal bolt = new Dog();
		Animal kitty = new Cat();
		
		bolt.playWithOwner();
		
		System.out.println();
		
		kitty.playWithOwner();
	}
}
