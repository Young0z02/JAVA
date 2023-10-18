interface A {
	void aaa ();
}

class C{
	void cde(A a) {
		a.aaa();
	}
}

class B implements A {
	@Override
	public void aaa() {
		System.out.println("방법12");
	}
}

public class Test {
	public static void main(String[] args) {
		//#cde() ()메서드 호출방법 4가지
		//@방법 1
		C c1 = new C ();
		A a1 = new B();
		c1.cde(a1);
		
		//@방법 2
		C c2 = new C ();
		c1.cde(new B());
		
		
		//@방법 3
		C c3 = new C();
		A a3 = new A () {
			@Override
			public void aaa() {
				System.out.println("방법 3");
			}
		};
		
		c1.cde(a3);
		
		
		//@방법 4
		C c4 = new C ();		
		c4.cde(new A () {
			@Override
			public void aaa() {
				System.out.println("방법 3");
			}
		});
	}
}
