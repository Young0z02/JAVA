//�������� ����ȭ #1 - EX09
class MyData{
	int data=3;
	void plusData() { //2�ʵڿ� data�ʵ� ���� 1 �����Ǵ� �޼���
		int myData = data;
		//2�� �ڿ� +1 ����
		try {Thread.sleep(2000);} catch (InterruptedException e) {} //2�� ����
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
		System.out.println("��°�:"+myData.data);
		
		
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