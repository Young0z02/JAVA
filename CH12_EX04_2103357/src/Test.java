interface A {
	void abc();
}

//#��� 1-1. �ڽ� Ŭ���� �����
class B implements A {
	@Override
	public void abc() {
		System.out.println("B");
	}
}
	
	
public class Test {
	public static void main(String[] args) {
		
		//#�������̽� Ÿ���� ��ü�� �����϶�. (�� ���� ���)
		//��� 1-2, �ڽ�Ŭ������ �����ϱ�
		A a1 = new B();
				
		//��� 2, �͸��̳�Ŭ������ ����� ���		
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("�͸��̳�Ŭ����");
				
			}
		};
		a1.abc();
		a2.abc();   
	

	}
}
