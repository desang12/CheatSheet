package designPatterns.BASIC.TemplateMethod;

public class Dog extends Animal {

	@Override
	void play() {
		System.out.println("멍 멍");
		
	}

	@Override
	void runSomething() {
		System.out.println("멍 멍 꼬리 살랑살랑");
	}
	
}

class Cat extends Animal{
	@Override
	void play() {
		System.out.println("야옹");
		
	}

	@Override
	void runSomething() {
		System.out.println("야옹 꼬리 살랑살랑");
	}
}