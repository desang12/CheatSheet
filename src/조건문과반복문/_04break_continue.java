package 조건문과반복문;

/**
 
 반복문이 중첩되어 있을 때
 break문은 가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료시키지 않는다.
 
 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 라벨을 붙이고 break 라벨;을 사용하면 된다.
 
 public class _04break_continue {
	public static void main(String [] args) {
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++){
			for(char lower = 'a'; lower <= 'z'; lower++){
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
	System.out.println("Exit");
	}
}
 
 
 continue문은 특정 조건을 만족하는 경우, continue문을 실행해서
 그 이후의 문장을 실행하지 않고 다음 반복으로 건너뛴다.
 
 다음 예제는 1~10 사이의 정수 중 짝수만 출력하는 코드이다.
 
 public class _04break_continue {
	public static void main(String [] args) {
		for (int i = 0; i <= 10; i++) {
			if(i%2 != 0){
				continue;
			}
			System.out.print(i + ((i == 10) ? "" : ", "));
		}
	}
}

 */



public class _04break_continue {
	public static void main(String [] args) {
		for (int i = 0; i <= 10; i++) {
			if(i%2 != 0){
				continue;
			}
			System.out.print(i + ((i == 10) ? "" : ", "));
		}
	}
}
