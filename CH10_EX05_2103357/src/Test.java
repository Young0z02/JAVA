class A {
	A() {
		System.out.println("A ��ü ����");
	}
}

class B{
	B(){
		super();
		System.out.println("B ��ü ����");
	}
}

class C {
	C(int a){
		System.out.println("C ��ü ����");
	}
}
class D extends C {
	D(){
		super(3);
		System.out.println("D ��ü ����");
	}
}

//		super(); //�����Ϸ��� ���ִ� ���� / C�� ȣ�� - ���� ����� �� �ؼ� ������
//	}
public class Test {
	public static void main(String[] args) {
		A a = new A (); //
		B b = new B (); //
	}

}
