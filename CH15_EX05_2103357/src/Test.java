public class Test {
	public static void main(String[] args) {
	
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				//���� ���� �����忡�� ������ ���� ���� �κ�
				//SMI (�ڸ� ���)
				String[] smi =  new String[] {"�ϳ�", "��", "��", "��", "�ټ�"};
				try { Thread.sleep(20);} catch (InterruptedException e) {}
				for(int i=0; i<smi.length; i++) {
					System.out.println(" (�ڸ�)-" + smi[i]);
					try { Thread.sleep(200);} catch (InterruptedException e) {}
				}
			}
		}); //�ڹٰ� �����ϴ� Thread
		th1.start();
		
		//���� ���
	
			Thread th2 = new Thread(new Runnable() {
				@Override
				public void run() {
					//���� ���
					int[] video = new int[] {1,2,3,4,5};
					for(int i=0; i<video.length; i++) {
						System.out.print(" (����)-" + video[i]);
						try { Thread.sleep(200);} catch (InterruptedException e){}
					}
				}
			});
			th2.start();
			
			Thread th3 = new Thread(new Runnable() {
				@Override
				public void run() {
					
				}
			});
			th3.start();
			
//			new Thread(new Runnable ()); -> ������ ���� ��
	}
}