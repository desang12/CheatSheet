package designPatterns.BASIC.TemplateCallback.AFTER;

//클라이언트
public class Client {

	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("총, 총총총");
		
		System.out.println();
		
		rambo.runContext("칼, 칼칼칼");
		
		System.out.println();
		
		rambo.runContext("도끼, 도끼도끼");
		
	}
}
