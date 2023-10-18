//�������� �Ӽ�(�켱����)

class MyThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<100000000L; i++) {} //long���� �ٲ������ - ��κ�
			System.out.println(this.getName()+":"+this.getPriority());
			
		}
	}
public class Test {
	public static void main(String[] args) {
		//CPU �ھ� üũ
		System.out.println(Runtime.getRuntime().availableProcessors()); //���� 16��
		
		for (int i=0; i<3; i++) {
			MyThread mth1 = new MyThread();
			mth1.start();
		}
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		
		for (int i=0; i<10; i++) {
			MyThread mth1 = new MyThread();
			mth1.setName(i+"��° ������");
			if (i==9)
				mth1.setPriority(Thread.MAX_PRIORITY);
			else
				mth1.setPriority(Thread.MIN_PRIORITY);
			mth1.start();
		}

	}
}
