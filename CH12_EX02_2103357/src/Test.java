interface A{
	int m=3;
	void abc();
}

class B implements A{
	@Override
	public void abc() {
		System.out.println("B");
		
	}
}
public class Test {
	public static void main(String[] args) {
		//�������̽��� ��ü�� ����� 2���� ���
		
		//#��� 1. �ڽ�Ŭ���� ��������
		A a1 = new B();
		
		//#��� 2. �͸��̳�Ŭ���� ���
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("C");
				
			}
		};
	}

}
