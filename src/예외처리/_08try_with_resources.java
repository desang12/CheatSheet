package 예외처리;

/**
 
 주로 입출력에 사용되는 클래스 중에서는 사용한 후에 꼭 닫아줘야 하는 것들이 있다.
 그래야 사용했던 자원(resources)이 반환되기 때문이다.
 
 	try {
 		fis = new FileInputStream("score.dat");
 		dis = new DataInputStream(fis);
 		...
 	} catch (IOException ie) {
 		ie.printStackTrace();
 	} finally {
 		dis.close();
 	}
 	
 	위 코드는 데이터를 읽는 도중에 예외가 발생해도 DataInputStream이 닫히도록
 	fianlly 블럭 안에 close()를 넣었다. 문제는 close()가 예외를 발생시킬 수 있다는 데 있다.
 	그래서 위의 코드는 아래와 같이 해야 올바른 것이 된다.
 	
 	try {
 		fis = new FileInputStream("score.dat");
 		dis = new DataInputStream(fis);
 		...
 	} catch (IOException ie) {
 		ie.printStackTrace();
 	} finally {
 	 	try {
 	 		if(dis!=null) {
 	 			dis.close();
 	 		}
 	 	} catch(IOException ie) {
 	 		ie.printStackTrace();
 	 	}
 	}
 	
 	코드가 복잡해졌으며, try블럭과 finally 블럭에서 모두 예외가 발생하면,
 	try블럭의 예외는 무시된다. 이러한 점을 개선하기 위해 try-with-resources문이 추가된 것이다.
 	
 	try(fis = new FileInputStream("score.dat");
 		dis = new DataInputStream(fis)) // ()괄호안에 두 문장 이상 넣을 경우 ;로 구분
 		
 		while(true) {
 			score = dis.readInt();
 			System.out.println(score);
 			sum += score;
 		}
 	} catch (EOFException e) {
 		System.out.println("점수의 총합은 " + sum + "입니다.");
 	} catch (IOException ie) {
 		ie.printStackTrace();
 	}
 	
 	try-with-resources문의 괄호안에 객체를 생성하는 문장을 넣으면, 이 객체는 따로 close()를 호출하지 않아도
 	try블럭을 벗어나는 순간 자동적으로 close()가 호출된다. 그 다음에 catch블럭 또는 finally 블럭이 수행된다.
 	
 
 
 
 */

public class _08try_with_resources {

}
