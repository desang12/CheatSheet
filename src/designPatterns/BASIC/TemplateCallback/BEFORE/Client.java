package designPatterns.BASIC.TemplateCallback.BEFORE;

//익명 내부 전략을 사용하는 클라이언트
public class Client {

	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("총! 총총초초초총!");		
			}
		});
		
		System.out.println();
		
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("칼. 카카카칼칼!");
				
			}
		});
		
		System.out.println();
		
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("도끼, 도도독 도끼!");	
			}
		});
		
	}
}
