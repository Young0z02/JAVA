class A{
	void abc() {
		System.out.println("A 클래스 메서드");
	}
}

class B extends A {
	void abc() {
		System.out.println("B 클래스 메서드");
	}
	void bcd() {
		abc(); //this.abd() 실행 (B 클래스 메서드)
	}
	void cde() {
		super.abc(); //A 클래스 메서드
	}
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
		b.bcd(); // B 클래스 메서드
		b.cde();
	}

}
