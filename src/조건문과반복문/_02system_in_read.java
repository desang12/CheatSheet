package 조건문과반복문;

import java.io.IOException;

/**
 
 System.in.read(); --> 키보트로부터 입력된 키 코드를 리턴함.
 
 키보드의 각 키가 가지고 있는 키 코드
 
 숫자
 0 = 48
 1 = 49
 2 = 50
 ...
 9 = 57
 
 알파벳
 A = 65
 B = 66
 ...
 Z = 90
 a = 97
 b = 98
 ...
 z = 122
 
 기능 키
 backspace = 8
 Tab = 9
 Enter = [CR=13, LF=10]
 Shift = 16
 Ctrl = 17
 Alt = 18
 space = 32
 PAGEUP = 33
 PAGEDOWN = 34
 
 방향 키
 <-- : 37
 ↑ : 38
 --> : 39
 ↓ : 40
 
 
 public class _02system_in_read {
	public static void main(String [] args) {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode != 13 && keycode != 10){
				System.out.println("---------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("---------------------------");
				System.out.println("선택 : ");
			}
			
			try {
				keycode = System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(keycode == 49) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(keycode == 50){
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(keycode == 51) {
				run = !run;
			}
		}
		System.out.println("프로그램 종료");
	}
}
 
 
 
 */



public class _02system_in_read {
	public static void main(String [] args) {
		boolean run = true;
		int speed = 0;
		int keycode = 0;
		
		while(run) {
			if(keycode != 13 && keycode != 10){
				System.out.println("---------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("---------------------------");
				System.out.println("선택 : ");
			}
			
			try {
				keycode = System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(keycode == 49) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(keycode == 50){
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(keycode == 51) {
				run = !run;
			}
		}
		System.out.println("프로그램 종료");
	}
}
