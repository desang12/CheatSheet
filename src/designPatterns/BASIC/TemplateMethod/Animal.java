package designPatterns.BASIC.TemplateMethod;

public abstract class Animal {
	public void playWithOwner() {
		System.out.println("귀염둥이 이리온...");
		play();
		runSomething();
		System.out.println("잘했어");
	}
	
	// 추상 메서드
	abstract void play();
	
	
	// Hook 메서드
	void runSomething() {
		System.out.println("꼬리 살랑");
	}
}
