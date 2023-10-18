class A{}
class B extends A {}
class C extends B {}
class D extends C {}


public class Test {
	public static void main(String[] args) {
		
		B m = new C();
		
		A a = m; // 0 - 업 / 생략 가능
		B b = m; // 0 - 업 / 생략 가능
		C c = (C) m; // 0 - 다운
		D d = (D) m; // x - 불가능
		
	}

}
