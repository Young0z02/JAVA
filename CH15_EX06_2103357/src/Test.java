
public class Test {
	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		System.out.println(th1.getName());
		System.out.println(Thread.activeCount()); //현재 돌아가고 있는 쓰레드의 갯수 -1 (main)
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread(); //java api가 제공하는 쓰레드 (run()은 아무일도 안함)
			System.out.println(t.getName()); //인스턴스 메서드 .이 붙어야함
			t.start(); // 이름을 안 지어줌
		}
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread(); //java api가 제공하는 쓰레드 (run()은 아무일도 안함)
			t.setName(i+"번째 쓰레드");
			System.out.println(t.getName()); //인스턴스 메서드 .이 붙어야함
			t.start(); // 이름을 지어줌
		}
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread(); //java api가 제공하는 쓰레드 (run()은 아무일도 안함)
			System.out.println(t.getName()); //인스턴스 메서드 .이 붙어야함
			t.start(); //이름을 지어줌
		}
	}

}
