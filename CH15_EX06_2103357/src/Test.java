
public class Test {
	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		System.out.println(th1.getName());
		System.out.println(Thread.activeCount()); //���� ���ư��� �ִ� �������� ���� -1 (main)
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread(); //java api�� �����ϴ� ������ (run()�� �ƹ��ϵ� ����)
			System.out.println(t.getName()); //�ν��Ͻ� �޼��� .�� �پ����
			t.start(); // �̸��� �� ������
		}
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread(); //java api�� �����ϴ� ������ (run()�� �ƹ��ϵ� ����)
			t.setName(i+"��° ������");
			System.out.println(t.getName()); //�ν��Ͻ� �޼��� .�� �پ����
			t.start(); // �̸��� ������
		}
		
		for(int i=0; i<3; i++) {
			Thread t = new Thread(); //java api�� �����ϴ� ������ (run()�� �ƹ��ϵ� ����)
			System.out.println(t.getName()); //�ν��Ͻ� �޼��� .�� �پ����
			t.start(); //�̸��� ������
		}
	}

}
