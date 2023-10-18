//page 325
class A {
	int m=3;
	void abc() {
		System.out.println("A 클래스의 메서드");
	}
}
class B extends A {
	int n=5;
	void bcd() {
		System.out.println("B 클래스의 메서드");
	}
}
public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m);
		a.abc();
		
		B b = new B();
		System.out.println(b.m);
		System.out.println(b.n);
		b.abc();
		b.bcd();
		
		A ab = new B ();
		System.out.println(ab.m);
		ab.abc();
		
		B b2 = (B)ab;
		System.out.println(b2.m);
		System.out.println(b2.n);
		b2.abc();
		b2.bcd();
	}
}
