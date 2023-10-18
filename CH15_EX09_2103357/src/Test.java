//쓰레드의 동기화 #1 - EX09
class MyData{
	int data=3;
	void plusData() { //2초뒤에 data필드 값이 1 증가되는 메서드
		int myData = data;
		//2초 뒤에 +1 수행
		try {Thread.sleep(2000);} catch (InterruptedException e) {} //2초 정지
		data = myData+1;
	}
}

class MyThread extends Thread {
	MyData myData;
	MyThread(MyData myData) {
		
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println("출력값:"+myData.data);
		
		
	}
}
public class Test {
	public static void main(String[] args) {
		MyData myData = new MyData();
		
		MyThread mt1 = new MyThread(myData);
		mt1.setName("Thread1");
		mt1.start();
		
//		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		MyThread mt2 = new MyThread(myData);
		mt2.setName("Thread2");
		mt2.start();
	}
}