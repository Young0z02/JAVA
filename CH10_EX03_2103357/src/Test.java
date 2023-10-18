class A {
	int m=3;
	static int n=4;
	void abc() {
		System.out.println("A의 인스턴스 메서드");
	}
	static void bcd() {
		System.out.println("A의 스태틱 메서드");
	}
}

class B extends A {
	int m=5;
	static int n=6;
	void abc() {
		System.out.println("B의 인스턴스 메서드");
	}
	static void bcd() {
		System.out.println("B의 스태틱 메서드");
	}
}




public class Test {
	public static void main(String[] args) {
		
		A aa = new A ();
		System.out.println(aa.m); // 3
		System.out.println(aa.n); // 4
		aa.abc(); // A의 인스턴스 메서드 
		aa.bcd(); // A의 스태틱 메서드
		
		
		B bb = new B ();
		System.out.println(bb.m); //5
		System.out.println(bb.n); //6
		bb.abc(); // B의 인스턴스 메서드
		bb.bcd(); // B의 스태틱 메서드
		
		
		A ab = new B();
		System.out.println(ab.m); //3
		System.out.println(ab.n); //4
		ab.abc(); //B의 인스턴스 메서드
		ab.bcd(); //A의 스태틱 메서드
	}

}
