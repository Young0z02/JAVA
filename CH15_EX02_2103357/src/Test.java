class SMIThread extends Thread {
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
}
class VideoThread extends Thread {
	@Override
	public void run() {
		//���� ��� VideoThread�� ���
		int[] video = new int[] {1,2,3,4,5};
		for(int i=0; i<video.length; i++) {
			System.out.print(" (����)-" + video[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}
public class Test {
	public static void main(String[] args) {
		//�ڸ� ��� smiThread���� ���
		SMIThread smi = new SMIThread();
		smi.start();
		//���� ���(VideoThread) ���
		VideoThread video = new VideoThread();
		video.start();
		
	}
}