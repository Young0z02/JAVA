//������
class A{
	int m;
	void abc() {
		
	}
//	A(){ //�����Ϸ��� ����� �ִ� ������
//		
//	}
}
class B {
	int m;
	void abc() {
		
	}
	B(){ //�������� �⺻ ������.
		
	}
}
class C{
	int m;
	void abc() {
		
	}
	C(int k){
		
	}
}
public class Test {
	public static void main(String[] args) {
		//#1. ��ü����
		A a = new A(); //�����Ϸ��� �⺻ �����ڸ� ��������
		B b = new B();
//		C c = new C(); //�����߻� (�⺻������ ����)
		C c = new C(3);
		
	}
}
