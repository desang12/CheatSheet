package designPatterns.BASIC.TemplateCallback.AFTER;

// 전략 생성 코드가 컨텍스트 내부에 위치한다.
public class Soldier {
	void runContext(String weaponSound) {
		System.out.println("전투 시작");
		excuteWeapon(weaponSound).runStrategy();
		System.out.println("전투 종료");
	}
	
	private Strategy excuteWeapon(final String weaponSound) {
		return new Strategy() {
			public void runStrategy() {
				System.out.println(weaponSound);
			}
		};
	}
}
