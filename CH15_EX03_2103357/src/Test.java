class SMIRunnable implements Runnable {
	@Override
	public void run() {
		//내가 만든 쓰레드에서 실행할 일을 적는 부분
		//SMI (자막 출력)
		String[] smi =  new String[] {"하나", "둘", "셋", "넷", "다섯"};
		try { Thread.sleep(20);} catch (InterruptedException e) {}
		for(int i=0; i<smi.length; i++) {
			System.out.println(" (자막)-" + smi[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	} 
}



public class Test {
	public static void main(String[] args) {
		//자막 출력 smiThread에서 담당
		SMIRunnable smi = new SMIRunnable();
		Thread th = new Thread(smi); //자바가 제공하는 Thread
		th.start();
		
		//비디오 출력 mainThread가 담당
		int[] video = new int[] {1,2,3,4,5};
		for(int i=0; i<video.length; i++) {
			System.out.print(" (비디오)-" + video[i]);
			try { Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}