class A{}
class B extends A {}
class C extends B {}
class D extends C {}


public class Test {
	public static void main(String[] args) {
		
		B m = new C();
		
		A a = m; // 0 - �� / ���� ����
		B b = m; // 0 - �� / ���� ����
		C c = (C) m; // 0 - �ٿ�
		D d = (D) m; // x - �Ұ���
		
	}

}
