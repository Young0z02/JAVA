//#final

class A {
	int m=3;
	final int n=4;
	void abc() {
		int a=3;
		final int b=4;
		a=5;
		// b=6; //오류 (필드 / 지역변수의 앞에 final이 붙으면 값을 변경 불가)
	}
}

class B {
	void abc() {
		System.out.println("B1");
	}
	final void bcd() {
		System.out.println("B2");
	}
}

class C extends B{
	@Override
	void abc() {
		System.out.println("C1");
	}
//	void bcd() { //final 메서드는 오버라이딩 불가
//		System.out.println("B2");
//	}
	
}

class D {
	
}

// class E extends D { //final 클래스는 상속 불가
	
// }
public class Test {
	public static void main(String[] args) {
		A a = new A ();
		a.m=5;
//		a.n=6; //오류 (필드/ 지역변수의 앞에 final이 붙으면 값을 변경 불가)
	}

}
