class A1 {
	
	void abc() {
		bcd(); //오류 날 일이 없음 (이미 처리가 다 됨)
		
	}
	
	void bcd() {
		try {
		Thread.sleep(1000);
	} catch(InterruptedException e) {
		}
	}
}

class A2 {
	void abc() {
		try {
			bcd(); 
		}catch(InterruptedException e) {
		}
	}
		void bcd() throws InterruptedException {
		Thread.sleep(1000);
	}
}
public class Test {
	public static void main(String[] args) throws ClassNotFoundException{
		
		Class cls = Class.forName("java.lang.Object2");
		
		//try {
		// Class cls = Class.forName("java.lang.Object");
		// catch (ClassNorFoundException e) {
		// System.out.println("예외발생");
		//	}
	}	
}
