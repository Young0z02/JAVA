class A1{
	void abc() {
		
	}
}
class B1 extends A1{
	void abc() {
		System.out.println("�޼��� �������̵�");
	}
}

abstract class A2 {
	abstract void abc();
}
class B2 extends A2 {
	void abc() {
		System.out.println("�޼��� �������̵�");
	}
}

public class Test {
	public static void main(String[] args) {
		A1 a = new B1();
			a.abc();
	}
}
