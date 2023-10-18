//쓰레드의 동기화 (키관리)

class A {
	Object obj = new Object();
	synchronized void abc() {
		for(int i=1; i<=3; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println(i+"sec");
		}
	}
	void bcd() {
		synchronized (obj) {
			for(int i=1; i<=3; i++) {
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				System.out.println(i+"초");
		}
	}
}
	void cde() {
		synchronized (this) {
			for(int i=1; i<=3; i++) {
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
				System.out.println(i+"번째");
			}
		}	
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				a.abc();
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				a.bcd();
			}
		});
		t2.start();
		
		
//		Thread t3 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				a.cde();
//			}
//		});
//		t3.start();
		
		new Thread(new Runnable () {
			@Override
			public void run() {
				a.cde();
			}
		});
		
		
		}
	}