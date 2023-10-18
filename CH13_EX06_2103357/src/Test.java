interface C {
	void ccc() ;
}

class A1 {
	C C = new B ();
	void abc () {
		System.out.println("메서드");
	}
	class B implements C {
		public void ccc () {
			System.out.println("메서드 구현");
		}
	}
}

class A2 {
	C c = new C() {
		public void ccc() {
			System.out.println("메서드 구현");
		}
	};
	void abc() {
		System.out.println("메서드");
	}
}
public class Test {
	public static void main(String[] args) {
		
	}

}
