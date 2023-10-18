class A {
	int m;
	A(int m) {
		this.m=m;
	}
}

class B {
	int m;
	B(int m) {
		this.m=m; // �� ��ü ��ӿ� �ִ� m  ��� : int m (�Ķ���)
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		// �ʵ尪�� �����ϸ� true / �ٸ��� false
		if(obj instanceof B) { //obj�� B�� ĳ������ ������ ���� ĳ�����ض�
			result = (this.m ==((B)obj).m);
		}	
		return result;
	}
}

public class Test {
	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1==a2); //false
		System.out.println(a1.equals(a2));
		
		B b1 = new B(5);
		B b2 = new B(5);
		System.out.println(b1==b2);
		System.out.println(b1.equals(b2));
	}

}
