//#final

class A {
	int m=3;
	final int n=4;
	void abc() {
		int a=3;
		final int b=4;
		a=5;
		// b=6; //���� (�ʵ� / ���������� �տ� final�� ������ ���� ���� �Ұ�)
	}
}

class B {
	void abc() {
		System.out.println("B1");
	}
	final void bcd() {
		System.out.println("B2");
	}
}

class C extends B{
	@Override
	void abc() {
		System.out.println("C1");
	}
//	void bcd() { //final �޼���� �������̵� �Ұ�
//		System.out.println("B2");
//	}
	
}

class D {
	
}

// class E extends D { //final Ŭ������ ��� �Ұ�
	
// }
public class Test {
	public static void main(String[] args) {
		A a = new A ();
		a.m=5;
//		a.n=6; //���� (�ʵ�/ ���������� �տ� final�� ������ ���� ���� �Ұ�)
	}

}
