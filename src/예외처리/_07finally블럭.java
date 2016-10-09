package 예외처리;

/**
 
 finally 블럭은 try-catch문과 함께 예외의 발생여부에 상관없이
 실행되어야할 코드를 포함 시킬 목적으로 사용된다.
 
	 try {
	 	//예외가 발생할 가능성이 있는 문장
	 } catch (Exception e) {
	 	//예외 처리를 위한 문장
	 } finally {
	 	//예외의 발생 여부에 관계없이 항상 수행되어야 하는 문장
	 }
 
 예외가 발생한 경우에는 try - catch - finally 순으로 실행
 예외가 발생하지 않은 경우 try - finally 순으로 실행
 
 
 
 */
public class _07finally블럭 {
	public static void main(String [] args) {
		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() {}
	static void copyFiles() {}
	static void deleteTempFiles() {}
}
/*
 
 위 예제는 프로그램설치를 위한 준비를 하고 파일들을 복사하고
 설치가 완료되면, 프로그램을 설치하는데 사용된 임시파일들을 삭제하는 순서로 진행
 프로그램의 설치과정 중에 예외가 발생해도, 설치에 사용된 임시파일들이 삭제되도록 
 finally블럭을 이용해서 작성.
 
  
 */
