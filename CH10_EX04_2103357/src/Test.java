class A{
	void abc() {
		System.out.println("A Ŭ���� �޼���");
	}
}

class B extends A {
	void abc() {
		System.out.println("B Ŭ���� �޼���");
	}
	void bcd() {
		abc(); //this.abd() ���� (B Ŭ���� �޼���)
	}
	void cde() {
		super.abc(); //A Ŭ���� �޼���
	}
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
		b.bcd(); // B Ŭ���� �޼���
		b.cde();
	}

}
