package 조건문과반복문;
import java.util.Scanner;

/**
 
 do - while 문은 블록 내의 실행 문을 우선 실행시키고,
 실행결과에 따라서 반복 실행을 결정한다.

 */

public class _03_do_while {
	public static void main(String [] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner mScanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = mScanner.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}
