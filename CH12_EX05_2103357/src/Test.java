interface A {
	void abc();
	default void bcd() {
		System.out.println("�������̽��� ����Ʈ �޼�Ʈ");
	}
}

class B implements A {

	@Override
	public void abc() { //public �� �� �־����
		System.out.println("B Ŭ���������� ������ �޼���");
	}
}

class C implements A {

	@Override
	public void abc() { //public �� �� �־����
		System.out.println("C Ŭ���������� ������ �޼���");
		bcd(); //�Ʒ� �������̵��� ȣ��
		A.super.bcd(); //interface A ȣ��
	}
	@Override
	public void bcd() {
		System.out.println("C Ŭ���� ������ �������̵��� �޼���");
		A.super.bcd();
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new B ();
		a.abc();
		a.bcd();
		
		A a2= new C();
		a2.abc();
		//a2.bcd();
	}

}


interface D {
	default void def() {
		System.out.println("D");
	}
}

interface E {
	default void def() {
		System.out.println("E");
	}
}

class F {
	void def() {
		System.out.println("F");

	}
}

class G extends F implements D,E {
	void abc() {
		//�̼�, ��� ����� G,D,E,F
	}
	public void def() {
		System.out.println("G");
	}
}


// D,E,F .super.def()