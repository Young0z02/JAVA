class A1 {
	
	void abc() {
		bcd(); //���� �� ���� ���� (�̹� ó���� �� ��)
		
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
		// System.out.println("���ܹ߻�");
		//	}
	}	
}
